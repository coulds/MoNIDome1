package com.example.monidome1.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.monidome1.Adaputer.HomeAdapter;
import com.example.monidome1.Adaputer.ProjectListAdapter;
import com.example.monidome1.Bean.ProjectDecBean;
import com.example.monidome1.Interface.ProjectDecService;
import com.example.monidome1.R;
import com.example.monidome1.RetrofitUrl.WanAdroidUrl;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SimpleCardFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SimpleCardFragment extends Fragment {
    private RecyclerView recyclerView;
    private List<ProjectDecBean.DataBean.DatasBean> data = new ArrayList<>();
    private String URL="https://www.wanandroid.com/project/list/1/json";
    private List<String> mtitle = new ArrayList<>();
    private List<Fragment> mFragments = new ArrayList<>();
    private int chapterId;
    private String title;
//private List<ProjectNameBean.DataBean> projectlist = new ArrayList<>();


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SimpleCardFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static SimpleCardFragment newInstance(int chapterId) {
        SimpleCardFragment fragment = new SimpleCardFragment();
//        fragment.chapterId = chapterId;
        fragment.chapterId = chapterId;
//        fragment.projectlist = projectlist;
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
        View v = inflater.inflate(R.layout.fragment_simple_card, container, false);
        recyclerView = v.findViewById(R.id.recyclerView_project);
        ProjectDec();
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        ProjectListAdapter projectListAdapter = new ProjectListAdapter(getActivity(),data);
        recyclerView.setAdapter(projectListAdapter);
        return v;
    }

    private void ProjectDec() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(WanAdroidUrl.Base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ProjectDecService projectDecService = retrofit.create(ProjectDecService.class);
        Call<ProjectDecBean> call = projectDecService.getUrl(URL,chapterId);
        Log.e("TAG", "ProjectDec哈哈哈: "+chapterId );
        call.enqueue(new Callback<ProjectDecBean>() {
            @Override
            public void onResponse(Call<ProjectDecBean> call, Response<ProjectDecBean> response) {
                if (response != null){
                    ProjectDecBean projectDecBean = response.body();
                    data.addAll(projectDecBean.getData().getDatas());

//                    for (int i=0;i<data.size();i++){
//                        mprojectid.add(data.get(i).getChapterId());
//                    }

                    Log.e("TAG", "onResponse: "+response );
                }
            }

            @Override
            public void onFailure(Call<ProjectDecBean> call, Throwable t) {

            }
        });

    }
}