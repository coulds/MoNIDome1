package com.example.monidome1.Fragment;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import androidx.core.graphics.ColorUtils;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.monidome1.Adaputer.HomeAdapter;
import com.example.monidome1.Adaputer.YinliaoAdapter;
import com.example.monidome1.Bean.ProjectDecBean;
import com.example.monidome1.Bean.ProjectNameBean;
import com.example.monidome1.Interface.ProjectDecService;
import com.example.monidome1.Interface.ProjectService;
import com.example.monidome1.R;
import com.example.monidome1.RetrofitUrl.WanAdroidUrl;
import com.example.monidome1.RetrofitUrl.YinliaoUrl;
import com.flyco.tablayout.SlidingTabLayout;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link yinliaoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class yinliaoFragment extends Fragment {

    private SlidingTabLayout mSlidingTabLayout;
    private ViewPager mViewPager;
    private Context context;
    private View yinliao_Layout;
    private List<ProjectNameBean.DataBean> projectlist = new ArrayList<>();
    private List<ProjectDecBean.DataBean.DatasBean> projectID = new ArrayList<>();
    private List<String> mtitle = new ArrayList<>();
    private List<Fragment> mFragments = new ArrayList<>();
    private String url="https://www.wanandroid.com/project/tree/json";









    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public yinliaoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment yinliaoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static yinliaoFragment newInstance(String param1, String param2) {
        yinliaoFragment fragment = new yinliaoFragment();
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
        yinliao_Layout = inflater.inflate(R.layout.fragment_yinliao, container, false);
        mSlidingTabLayout = yinliao_Layout.findViewById(R.id.SlidingTabLayout_yinliao);
        mViewPager = yinliao_Layout.findViewById(R.id.ViewPager_viewpage);
        NetAPI();
        changeStatusBarTextColor(true);
        return yinliao_Layout;

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








    private void NetAPI() {
        Retrofit retrofit1= new Retrofit.Builder().
                baseUrl(WanAdroidUrl.Base_url).
                addConverterFactory(GsonConverterFactory.create()).
                build();
        ProjectService projectService = retrofit1.create(ProjectService.class);
        Call<ProjectNameBean> call = projectService.getUrl(url);
        call.enqueue(new Callback<ProjectNameBean>() {
            @Override
            public void onResponse(Call<ProjectNameBean> call, Response<ProjectNameBean> response) {
               if (response == null){
                   Toast.makeText(context,"respose为空",Toast.LENGTH_SHORT).show();
               }else {
                   ProjectNameBean projectNameBean = response.body();
                   projectlist.addAll(projectNameBean.getData());
                   Log.e("TAG", "onResponse: "+mtitle );

                   for (int i=0;i<projectlist.size();i++){
                       mtitle.add(projectlist.get(i).getName());
                       mFragments.add(SimpleCardFragment.newInstance(projectlist.get(i).getId()));
                       Log.e("哈哈哈就的哈就好", "返回: "+projectlist.get(i).getId());
                   }
                   mViewPager.setAdapter(new HomeAdapter(getFragmentManager()
                           ,mtitle,mFragments));
                   mSlidingTabLayout.setViewPager(mViewPager);

               }



            }

            @Override
            public void onFailure(Call<ProjectNameBean> call, Throwable t) {
                Log.e("+++++", "onFailure: "+"返回失败" );
            }
        });


    }

}