package com.example.monidome1.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.monidome1.Activity.LoginActivity;
import com.example.monidome1.Entity.LoginEntity;
import com.example.monidome1.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link myFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class myFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private List<LoginEntity.DataBean> logindata = new ArrayList<>();
    private LoginEntity loginEntity;
    private View my_Layout;
    private TextView nikename;
    private String mParam1;
    private String mParam2;

    public myFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment myFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static myFragment newInstance(String param1, String param2) {
        myFragment fragment = new myFragment();
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


        my_Layout = inflater.inflate(R.layout.fragment_my, container, false);
        nikename =(TextView) my_Layout.findViewById(R.id.me_name);
        initview();
//        onLogin(logindata);
        return my_Layout;
    }

    private void initview() {
        TextView login_text = (TextView)my_Layout.findViewById(R.id.me_name);
        login_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
            }
        });
    }
//    private void onLogin(LoginEntity loginEntity){
//        if (loginEntity== null){
//            if (loginEntity.getErrorCode() == 0){
//                nikename.setText(loginEntity.getData().getUsername());
//
//
//            }
//        }
//    }


}