package com.example.monidome1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    private Toolbar toolbar;
    private DrawerLayout mdrawerLayout;
    private NavigationView navigationView;
    private myFragment myfragment;
    private pijiuFragment pijiufragment;
    private yinliaoFragment yinliaofragment;
    private coffe_Fragment coffefragment;

    private View coffelayout;
    private View pijiulayout;
    private View yinliaolayout;
    private View mylayout;

    private android.app.FragmentManager manager;
    private FragmentTransaction ft;



    private ImageView myImage;
    /**
     * 在Tab布局上显示联系人图标的控件
     */
    private ImageView yinliaoImage;

    /**
     * 在Tab布局上显示动态图标的控件
     */
    private ImageView pijiuImage;

    /**
     * 在Tab布局上显示设置图标的控件
     */
    private ImageView coffeImage;

    /**
     * 在Tab布局上显示消息标题的控件
     */
    private TextView coffeText;

    /**
     * 在Tab布局上显示联系人标题的控件
     */
    private TextView yinliaoText;

    /**
     * 在Tab布局上显示动态标题的控件
     */
    private TextView pijiuText;

    /**
     * 在Tab布局上显示设置标题的控件
     */
    private TextView myText;

    private FragmentManager fragmentManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        fragmentManager  = getSupportFragmentManager();
        setTabSelection(0);
        getSupportFragmentManager();
        DrawerLayout mdrawerLayout = (DrawerLayout) findViewById(R.id.dl_drawerlayout);
        initview();

    }
    private void initview() {

        navigationView =findViewById(R.id.nav_view);

        coffelayout = findViewById(R.id.coffe_layout);
        pijiulayout = findViewById(R.id.pijiu_layout);
        yinliaolayout = findViewById(R.id.yinliao_layout);
        mylayout = findViewById(R.id.my_layout);

        myImage = (ImageView) findViewById(R.id.my_image);
        pijiuImage = (ImageView) findViewById(R.id.pijiu_image);
        coffeImage = (ImageView) findViewById(R.id.coffe_image);
        yinliaoImage = (ImageView) findViewById(R.id.yinliao_image);

        coffeText = (TextView) findViewById(R.id.coffe_text);
        pijiuText = (TextView) findViewById(R.id.pijiu_text);
        yinliaoText = (TextView) findViewById(R.id.yinliao_text);
        myText = (TextView) findViewById(R.id.my_text);


        coffelayout.setOnClickListener(this);
        pijiulayout.setOnClickListener(this);
        yinliaolayout.setOnClickListener(this);
        mylayout.setOnClickListener(this);



    }

    private void setTabSelection(int index) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        hideFragment(transaction);
        switch (index){
            case 0:
                if (coffefragment == null){
                    coffefragment = new coffe_Fragment();
                    transaction.add(R.id.content,coffefragment);

                }else {
                    transaction.show(coffefragment);
                }
                break;
            case 1:
                if (pijiufragment == null){
                    pijiufragment = new pijiuFragment();
                    transaction.add(R.id.content,pijiufragment);
                }else {
                    transaction.show(pijiufragment);
                }
                break;
            case 2:
                if (yinliaofragment == null){
                    yinliaofragment = new yinliaoFragment();
                    transaction.add(R.id.content,yinliaofragment);
                }else {
                    transaction.show(yinliaofragment);
                }
                break;
            case 3:
                if (myfragment == null){
                    myfragment = new myFragment();
                    transaction.add(R.id.content,myfragment);
                }else {
                    transaction.show(myfragment);
                }
                break;
        }
        transaction.commit();
    }

    private void hideFragment(FragmentTransaction transaction) {
        if (coffefragment != null) {
            transaction.hide(coffefragment);
        }
        if (yinliaofragment != null) {
            transaction.hide(yinliaofragment);
        }
        if (pijiufragment != null) {
            transaction.hide(pijiufragment);
        }
        if (myfragment != null) {
            transaction.hide(myfragment);
        }

    }



    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.coffe_layout:
                // 当点击了消息tab时，选中第1个tab
                setTabSelection(0);
//                messageText.setTextColor();

                break;
            case R.id.yinliao_layout:
                // 当点击了联系人tab时，选中第2个tab
                setTabSelection(1);
                break;
            case R.id.pijiu_layout:
                // 当点击了动态tab时，选中第3个tab
                setTabSelection(2);
                break;
            case R.id.my_layout:
                // 当点击了设置tab时，选中第4个tab
                setTabSelection(3);
                break;
            default:
                break;
        }

    }
}