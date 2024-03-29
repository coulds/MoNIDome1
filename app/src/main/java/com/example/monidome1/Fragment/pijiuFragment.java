package com.example.monidome1.Fragment;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.monidome1.Activity.MyAppcation;
import com.example.monidome1.Adaputer.HomeAdapter;
import com.example.monidome1.Adaputer.PictureAdapter;
import com.example.monidome1.Bean.PictureBean;
import com.example.monidome1.Bean.ProjectDecBean;
import com.example.monidome1.Bean.ProjectNameBean;
import com.example.monidome1.Bean.PublicAccountBean;
import com.example.monidome1.Interface.PictureService;
import com.example.monidome1.Interface.PublicAccountService;
import com.example.monidome1.R;
import com.example.monidome1.RetrofitUrl.PictureUrl;
import com.example.monidome1.RetrofitUrl.WanAdroidUrl;
import com.flyco.tablayout.SlidingTabLayout;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link pijiuFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class pijiuFragment extends Fragment {

    private SlidingTabLayout mSlidingTabLayout;
    private ViewPager mViewPager;
    private Context context;
    private View yinliao_Layout;
    private List<PublicAccountBean.DataBean> accountlist = new ArrayList<>();
    private List<ProjectDecBean.DataBean.DatasBean> projectID = new ArrayList<>();
    private List<String> mtitle = new ArrayList<>();
    private List<Fragment> mFragments = new ArrayList<>();
    private String url="https://wanandroid.com/wxarticle/chapters/json";


//    private PictureAdapter pictureAdapter;
    private View pijiu_Layout;
//    private RecyclerView picrecycleview;
//    private List<PictureBean.DataBean> picturelist = new ArrayList<>();
//    private String url ="http://wallpaper.apc.360.cn/index.php?c=WallPaperAndroid&a=getAppsByCategory&cid=1&start=0&count=99";

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public pijiuFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment pijiuFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static pijiuFragment newInstance(String param1, String param2) {
        pijiuFragment fragment = new pijiuFragment();
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
        pijiu_Layout = inflater.inflate(R.layout.fragment_pijiu, container, false);
        mSlidingTabLayout = pijiu_Layout.findViewById(R.id.SlidingTabLayout_pijiu);
        mViewPager = pijiu_Layout.findViewById(R.id.ViewPager_viewpage_pijiu);
        NetAPI();
        changeStatusBarTextColor(true);
        return pijiu_Layout;
    }

    private void changeStatusBarTextColor(boolean isBlack) {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.M) {
            if (isBlack) {
                getActivity().getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);//设置状态栏黑色字体
            } else {
                getActivity().getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_VISIBLE);//恢复状态栏白色字体
            }
        }
    }

    private void InitRecycleview() {
//        picrecycleview = (RecyclerView) pijiu_Layout.findViewById(R.id.pictureRecycleview);
//        GridLayoutManager manager = new GridLayoutManager(getActivity(),2);
//        manager.setOrientation(GridLayoutManager.VERTICAL);
//        picrecycleview.setLayoutManager(manager);
//        pictureAdapter = new PictureAdapter(getActivity(),picturelist);
//        picrecycleview.setAdapter(pictureAdapter);

//        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
//        manager.setOrientation(LinearLayoutManager.VERTICAL);


    }

    private void NetAPI() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(WanAdroidUrl.Base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PublicAccountService publicAccountService = retrofit.create(PublicAccountService.class);
        Call<PublicAccountBean> call = publicAccountService.geturl(url);
        call.enqueue(new Callback<PublicAccountBean>() {
            @Override
            public void onResponse(Call<PublicAccountBean> call, Response<PublicAccountBean> response) {
//                PublicAccountBean publicAccountBean = response.body();
//                accountlist.addAll(publicAccountBean.getData());

                if (response == null){
                    Toast.makeText(context,"respose为空",Toast.LENGTH_SHORT).show();
                }else {
                    PublicAccountBean publicAccountBean = response.body();
                    accountlist.addAll(publicAccountBean.getData());
                    Log.e("TAG", "onResponse: "+mtitle );

                    for (int i=0;i<accountlist.size();i++){
                        mtitle.add(accountlist.get(i).getName());
                        mFragments.add(PublicAccountFragment.newInstance(accountlist.get(i).getId()));
                        Log.e("哈哈哈就的哈就好", "返回: "+accountlist.get(i).getId());
                    }
                    mViewPager.setAdapter(new HomeAdapter(getFragmentManager()
                            ,mtitle,mFragments));
                    mSlidingTabLayout.setViewPager(mViewPager);

                }

                Log.e("TAG", "请求成功" );

            }

            @Override
            public void onFailure(Call<PublicAccountBean> call, Throwable t) {
                Log.e("TAG", "请求失败" );
            }
        });


    }
}