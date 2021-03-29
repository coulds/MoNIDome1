package com.example.monidome1.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.monidome1.Adaputer.ProjectListAdapter;
import com.example.monidome1.Adaputer.PublicAccountAdapter;
import com.example.monidome1.Bean.PADecBean;
import com.example.monidome1.Bean.ProjectDecBean;
import com.example.monidome1.Interface.PADecService;
import com.example.monidome1.Interface.ProjectDecService;
import com.example.monidome1.R;
import com.example.monidome1.RetrofitUrl.WanAdroidUrl;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnLoadMoreListener;
import com.scwang.smart.refresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PublicAccountFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PublicAccountFragment extends Fragment {


    private PublicAccountAdapter publicAccountAdapter;
    private View view;
    private RefreshLayout refreshLayouts;
    private RecyclerView recyclerView;
    private List<PADecBean.DataBean.DatasBean> data = new ArrayList<>();
    private String URL="https://wanandroid.com/wxarticle/list/";
    private List<String> mtitle = new ArrayList<>();
    private List<Fragment> mFragments = new ArrayList<>();
    private int chapterId;
    private int page = 1;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PublicAccountFragment() {
        // Required empty public constructor
    }

    public static PublicAccountFragment newInstance(int chapterId) {
        PublicAccountFragment fragment = new PublicAccountFragment();
        fragment.chapterId = chapterId;
        return fragment;
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PublicAccountFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PublicAccountFragment newInstance(String param1, String param2) {
        PublicAccountFragment fragment = new PublicAccountFragment();
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

        view = inflater.inflate(R.layout.fragment_public_account, container, false);
        recyclerView = view.findViewById(R.id.recyclerView_public);
        refresh();
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        publicAccountAdapter = new PublicAccountAdapter(getActivity(),data);
        recyclerView.setAdapter(publicAccountAdapter);
        PublicACCountDec();
        return view;

    }

    private void PublicACCountDec() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(WanAdroidUrl.Base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PADecService paDecService = retrofit.create(PADecService.class);
        Call<PADecBean> call = paDecService.getUrl(URL+chapterId+"/"+page+"/json");
        Log.e("TAG", "ACCOUNTDec哈哈哈: "+chapterId );
        Log.e("TAG", "ACCOUNT嘿嘿哈哈哈: "+URL+chapterId+"/"+page+"/json");
        call.enqueue(new Callback<PADecBean>() {
            @Override
            public void onResponse(Call<PADecBean> call, Response<PADecBean> response) {
                if (response != null ){
                    PADecBean paDecBean = response.body();
                    data.addAll(paDecBean.getData().getDatas());

                    publicAccountAdapter.notifyDataSetChanged();
                    Log.e("TAG", "onResponse: "+response );
                }
            }

            @Override
            public void onFailure(Call<PADecBean> call, Throwable t) {

            }
        });


    }

    private void refresh() {

        refreshLayouts = view.findViewById(R.id.account_smartrefresh);
        refreshLayouts.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                page = 1;
                data.clear();
                PublicACCountDec();
                refreshLayout.finishRefresh(2000);
                refreshLayout.finishRefresh(true);

            }
        });
        refreshLayouts.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                page++;
                PublicACCountDec();
                refreshLayout.finishLoadMore(2000);
                refreshLayout.finishLoadMore(true);

            }
        });

    }
}