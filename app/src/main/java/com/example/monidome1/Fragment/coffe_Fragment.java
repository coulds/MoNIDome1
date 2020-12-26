package com.example.monidome1.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.monidome1.BeanClass.Bean;
import com.example.monidome1.RetrofitUrl.Contant;
import com.example.monidome1.Interface.IRetrofitService;
import com.example.monidome1.Activity.MyAppcation;
import com.example.monidome1.R;
import com.example.monidome1.Adaputer.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link coffe_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class coffe_Fragment extends Fragment {

    private Context context;
    private List list;
    private View coffe_Layout;
    private SwipeRefreshLayout swipeRefreshLayout;
    private Boolean isRefresh = false;

    private List<Bean.DateBean> arrayList = new ArrayList<>();
    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    private String ur = "http://www.qubaobei.com/ios/cf/dish_list.php?stage_id=1&limit=20&page=1";

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
        context = this.context;
        initDate();
        initRecyclerView();
        NetWork();


        return coffe_Layout;
    }

    private void initRecyclerView() {

        recyclerView = (RecyclerView) coffe_Layout.findViewById(R.id.recyclerView);
        LinearLayoutManager manager = new LinearLayoutManager(this.getActivity());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        recyclerViewAdapter = new RecyclerViewAdapter(getActivity(), arrayList);
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    private void initDate() {
        swipeRefreshLayout = (SwipeRefreshLayout) coffe_Layout.findViewById(R.id.swipe_refreshLayout);
        swipeRefreshLayout.setColorSchemeResources(R.color.colorPrimary);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                swipeRefreshLayout.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        arrayList.clear();
                        NetWork();
                        recyclerViewAdapter.notifyDataSetChanged();
                        swipeRefreshLayout.setRefreshing(false);

                    }
                },2000);
            }
        });


    }
    private void  NetWork(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Contant.Base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        IRetrofitService iRetrofitService = retrofit.create(IRetrofitService.class);
        Call<Bean> call = iRetrofitService.getUrl(ur);
        call.enqueue(new Callback<Bean>() {
            @Override
            public void onResponse(Call<Bean> call, Response<Bean> response) {
                Bean bean = response.body();
                arrayList.addAll(bean.getData());
                recyclerViewAdapter.refrsh(arrayList);
//                bean.setData(arrayList.get());
                bean.save();
            }

            @Override
            public void onFailure(Call<Bean> call, Throwable t) {
                Log.d("TAG", "看看" + t);
                Toast.makeText(MyAppcation.getContext(),"看看数据一下："+t,Toast.LENGTH_SHORT).show();

            }
        });

    }
}