package com.example.monidome1.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.Toast;

import com.example.monidome1.Activity.MyAppcation;
import com.example.monidome1.Adaputer.PictureAdapter;
import com.example.monidome1.BeanClass.PictureBean;
import com.example.monidome1.Interface.PictureService;
import com.example.monidome1.R;
import com.example.monidome1.RetrofitUrl.PictureUrl;

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
    private PictureAdapter pictureAdapter;
    private View pijiu_Layout;
    private RecyclerView picrecycleview;
    private List<PictureBean.DataBean> picturelist = new ArrayList<>();
    private String url ="http://wallpaper.apc.360.cn/index.php?c=WallPaperAndroid&a=getAppsByCategory&cid=1&start=0&count=99";

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
        NetAPI();
        InitRecycleview();
        return pijiu_Layout;
    }

    private void InitRecycleview() {
        picrecycleview = (RecyclerView) pijiu_Layout.findViewById(R.id.pictureRecycleview);

        GridLayoutManager manager = new GridLayoutManager(getActivity(),2);
        manager.setOrientation(GridLayoutManager.VERTICAL);
        picrecycleview.setLayoutManager(manager);
        pictureAdapter = new PictureAdapter(getActivity(),picturelist);
        picrecycleview.setAdapter(pictureAdapter);

//        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
//        manager.setOrientation(LinearLayoutManager.VERTICAL);


    }

    private void NetAPI() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(PictureUrl.Picture_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PictureService pictureService = retrofit.create(PictureService.class);
        Call<PictureBean> call = pictureService.getURL(url);
        call.enqueue(new Callback<PictureBean>() {
            @Override
            public void onResponse(Call<PictureBean> call, Response<PictureBean> response) {
                PictureBean pictureBean = response.body();
                picturelist.addAll(pictureBean.getData());
                pictureAdapter.refrest(picturelist);
            }

            @Override
            public void onFailure(Call<PictureBean> call, Throwable t) {
                Toast.makeText(MyAppcation.getContext(),"看看数据一下："+t,Toast.LENGTH_SHORT).show();

            }
        });
    }
}