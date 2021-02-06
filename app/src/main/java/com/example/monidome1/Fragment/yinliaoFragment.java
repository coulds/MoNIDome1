package com.example.monidome1.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.monidome1.Activity.MyAppcation;
import com.example.monidome1.Adaputer.YinliaoAdapter;
import com.example.monidome1.BeanClass.HomeBean;
import com.example.monidome1.BeanClass.YinliaoBean;
import com.example.monidome1.Interface.TabService;
import com.example.monidome1.Interface.YinliaoService;
import com.example.monidome1.R;
import com.example.monidome1.RetrofitUrl.YinliaoUrl;

import java.util.ArrayList;
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
    private RecyclerView yinliaorecyclerview;
    private YinliaoAdapter yinliaoAdapter;
    private View yinliao_Layout;
//    private List<YinliaoBean.ResultBean> yinliaoList = new ArrayList<>();
    private List<HomeBean.DataBean.DatasBean> homelist = new ArrayList<>();
//    private String url="https://api.apiopen.top/getWangYiNews?page=1&count=5";
    private String url="https://www.wanandroid.com/article/list/0/json";

    
    private ArrayList<Fragment> mFragments = new ArrayList<>();
    private final String[] mTitles = {
            "热门", "iOS", "Android"
            , "前端", "后端", "设计", "工具资源"
    };


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
        NetAPI();
        InitRecyclerView();


        return yinliao_Layout;

    }

    private void InitRecyclerView() {
        yinliaorecyclerview = (RecyclerView) yinliao_Layout.findViewById(R.id.yinliao_Recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        yinliaorecyclerview.setLayoutManager(linearLayoutManager);
        yinliaoAdapter = new YinliaoAdapter(getActivity(),homelist);
        yinliaorecyclerview.setAdapter(yinliaoAdapter);



    }

    private void NetAPI() {
        Retrofit retrofit1= new Retrofit.Builder().
                baseUrl(YinliaoUrl.yingliao_url).
                addConverterFactory(GsonConverterFactory.create()).
                build();
        TabService tabService = retrofit1.create(TabService.class);
        Call<HomeBean> call = tabService.getUrl(url);
        call.enqueue(new Callback<HomeBean>() {
            @Override
            public void onResponse(Call<HomeBean> call, Response<HomeBean> response) {
                HomeBean homeBean = response.body();
                homelist.addAll(homeBean.getData().getDatas());
                yinliaoAdapter.yinliaorefrsh(homelist);
            }

            @Override
            public void onFailure(Call<HomeBean> call, Throwable t) {

            }
        });





    }
}