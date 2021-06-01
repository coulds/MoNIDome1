package com.example.monidome1.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.monidome1.Adaputer.HomeTopAdapter;
import com.example.monidome1.Banner.LocalImageLoader;
import com.example.monidome1.Bean.BannerBean;
import com.example.monidome1.Bean.HomeBean;
import com.example.monidome1.Bean.HomeTopBean;
import com.example.monidome1.Interface.BannerService;
import com.example.monidome1.Interface.HomeTopService;
import com.example.monidome1.Interface.TabService;
import com.example.monidome1.RetrofitUrl.WanAdroidUrl;
import com.example.monidome1.RetrofitUrl.Contant;

import com.example.monidome1.Activity.MyAppcation;
import com.example.monidome1.R;
import com.example.monidome1.Adaputer.RecyclerViewAdapter;
import com.example.monidome1.util.JumpWebUtils;
import com.example.monidome1.util.StringUtil;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.ClassicsHeader;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnLoadMoreListener;
import com.scwang.smart.refresh.layout.listener.OnRefreshListener;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;


import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.view.View.GONE;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link coffe_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class coffe_Fragment extends Fragment  {
    private Context context;
    private View coffe_Layout;
    private SwipeRefreshLayout swipeRefreshLayout;
    private Boolean isRefresh = false;

    private Banner banner;
    private LocalImageLoader mImageLoader;

    private int loadMoreNum;
    private NestedScrollView mNestedScrollView;
    private Toolbar mToolbar;

    private ArrayList<String> images=new ArrayList<>();
    private ArrayList<String> title=new ArrayList<>();
    private List<HomeBean.DataBean.DatasBean> arrayList = new ArrayList<>();
    private List<HomeTopBean.DataBean> toparrlist = new ArrayList<>();
    private List<BannerBean.DataBean> BannerList = new ArrayList<>();
    private RecyclerView recyclerView,toprecycleview;
    private RecyclerViewAdapter recyclerViewAdapter;
    private HomeTopAdapter homeTopAdapter;
    private String ur = "https://www.wanandroid.com/article/list/";
    private String url = "https://www.wanandroid.com/banner/json";
    private String topurl = "https://www.wanandroid.com/article/top/json";
    private int page=0;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public coffe_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment coffe_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static coffe_Fragment newInstance(String param1, String param2) {
        coffe_Fragment fragment = new coffe_Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        coffe_Layout = inflater.inflate(R.layout.fragment_coffe, container, false);
        context = getContext().getApplicationContext();

        getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        initDate();
        inittopRecycleview();
        initRecyclerView();
        TopNetWork();
        BannerNetWork();
        NetWork();
        initDateBanner();
        initToolbar();
        return coffe_Layout;
    }


    /**
     * 首页下滑弹出的toolbar
     *
     */

    private void initToolbar() {
        mNestedScrollView = coffe_Layout.findViewById(R.id.nest_scroll);
        mToolbar = coffe_Layout.findViewById(R.id.home_toolbar);
        int showOrHideToolbarHeight = StringUtil.dpToPx(context, 200)
                - StringUtil.getStatusBarHeight(context)
                - StringUtil.getActionBarHeight(context);
        mNestedScrollView.setOnScrollChangeListener((NestedScrollView.OnScrollChangeListener) (v, scrollX, scrollY, oldScrollX, oldScrollY) -> {
            if (scrollY > oldScrollY && scrollY - showOrHideToolbarHeight >= 0) {
                // 向上滑
                ((AppCompatActivity) getActivity()).setSupportActionBar(mToolbar);
                mToolbar.setPadding(0, StringUtil.getStatusBarHeight(context), 0, 0);
                mToolbar.setTitle("首页");
                mToolbar.setVisibility(View.VISIBLE);
            } else if (scrollY < oldScrollY && scrollY - showOrHideToolbarHeight <= 0) {
                // 向下滑
                ((AppCompatActivity) getActivity()).setSupportActionBar(mToolbar);
                mToolbar.setVisibility(GONE);
            }
        });
    }

    private void initDateBanner() {
        banner = coffe_Layout.findViewById(R.id.home_banner);
        mImageLoader = new LocalImageLoader();

        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
        banner.setImageLoader(mImageLoader);
        banner.setBannerAnimation(Transformer.Default);
        banner.setDelayTime(3000);
        banner.isAutoPlay(true);
        banner.setOnBannerListener(new OnBannerListener() {
            @Override
            public void OnBannerClick(int position) {
                JumpWebUtils.startWebView(context,
                        BannerList.get(position).getTitle(),
                        BannerList.get(position).getUrl()
                        );
//                Toast.makeText(getActivity(),"你点击了"+position+"行",Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void inittopRecycleview(){
        toprecycleview = (RecyclerView) coffe_Layout.findViewById(R.id.toprecyclerView);
        LinearLayoutManager manager = new LinearLayoutManager(this.getActivity());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        toprecycleview.setLayoutManager(manager);
       homeTopAdapter = new HomeTopAdapter(getActivity(),toparrlist);
//         homeTopAdapter = new HomeTopAdapter(getActivity(), toparrlist);
//        mPullLoadMoreRecyclerView.setAdapter(recyclerViewAdapter);
//        recyclerView.setAdapter(homeTopAdapter);
        toprecycleview.setAdapter(homeTopAdapter);

    }

    private void initRecyclerView() {

        recyclerView = (RecyclerView) coffe_Layout.findViewById(R.id.recyclerView);
        LinearLayoutManager manager = new LinearLayoutManager(this.getActivity());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        recyclerViewAdapter = new RecyclerViewAdapter(getActivity(),arrayList);
//         homeTopAdapter = new HomeTopAdapter(getActivity(), toparrlist);
//        mPullLoadMoreRecyclerView.setAdapter(recyclerViewAdapter);
//        recyclerView.setAdapter(homeTopAdapter);
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    private void initDate() {
        RefreshLayout refreshLayout = (RefreshLayout)coffe_Layout.findViewById(R.id.refreshLayout);
        refreshLayout.setRefreshHeader(new ClassicsHeader(getActivity()));
        refreshLayout.setRefreshFooter(new ClassicsFooter(getActivity()));
        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(final RefreshLayout refreshlayout1) {

                arrayList.clear();
                NetWork();
                refreshlayout1.finishRefresh(3000/*,false*/);//传入false表示刷新失败
                refreshlayout1.finishRefresh(true);

            }
        });
        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(RefreshLayout refreshlayout1) {
                page++;
                NetWork();
                refreshlayout1.finishLoadMore(30000/*,false*/);//传入false表示刷新失败
                refreshlayout1.finishLoadMore(true);
            }
        });
    }

    private void TopNetWork(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Contant.Base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        HomeTopService homeTopService = retrofit.create(HomeTopService.class);
        Call<HomeTopBean> calltop = homeTopService.getUrl(topurl);
        calltop.enqueue(new Callback<HomeTopBean>() {
            @Override
            public void onResponse(Call<HomeTopBean> call, Response<HomeTopBean> response) {
                HomeTopBean homeTopBean = response.body();
               toparrlist.addAll(homeTopBean.getData());
//                recyclerViewAdapter.notifyDataSetChanged();
               homeTopAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<HomeTopBean> call, Throwable t) {

            }
        });



    }
    private void  NetWork(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Contant.Base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        TabService tabService = retrofit.create(TabService.class);
        Call<HomeBean> call = tabService.getUrl(ur+page+"/json");
//        Log.e("TAG", "heiehieh嘿嘿哈哈哈: "+ur+page+"/json");
        call.enqueue(new Callback<HomeBean>() {
            @Override
            public void onResponse(Call<HomeBean> call, Response<HomeBean> response) {
                HomeBean homebean = response.body();
                arrayList.addAll(homebean.getData().getDatas());
                recyclerViewAdapter.notifyDataSetChanged();
//                recyclerViewAdapter.refrsh(arrayList);
            }

            @Override
            public void onFailure(Call<HomeBean> call, Throwable t) {

                Toast.makeText(MyAppcation.getContext(),"看看数据一下："+t,Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void BannerNetWork() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(WanAdroidUrl.Base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        BannerService bannerService = retrofit.create(BannerService.class);
        Call<BannerBean> call = bannerService.getUrl(url);
        call.enqueue(new Callback<BannerBean>() {
            @Override
            public void onResponse(Call<BannerBean> call, Response<BannerBean> response) {
                Log.e("哈哈哈","请求成功："+response);

                BannerBean bannerBean = response.body();
                BannerList.addAll(bannerBean.getData());
                Log.e("++++++++","这是bean集合里的数据："+BannerList);
                for (int i = 0; i < BannerList.size(); i++) {
                    images.add(BannerList.get(i).getImagePath());
                    title.add(BannerList.get(i).getTitle());
                }
                banner.setImages(images);
                banner.setBannerTitles(title);
                banner.start();
                recyclerViewAdapter.notifyDataSetChanged();

            }

            @Override
            public void onFailure(Call<BannerBean> call, Throwable t) {
                Log.e("哈哈哈","请求失败："+t);

            }
        });



    }


}