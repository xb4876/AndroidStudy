package com.study.ethwallet.ui.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 基类
 */
public abstract class BaseActivity extends AppCompatActivity {
    public Toolbar mCommonToolbar;

    protected Context mContext;
    private Unbinder unbinder;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutId());
        mContext = this;
        unbinder = ButterKnife.bind(this);


        initDatas();
        configViews();
    }

    /**
     * 加载布局文件
     */
    public abstract int getLayoutId();

    /**
     * 初始化头部
     */
    public abstract void initToolBar();

    /**
     * 初始化数据
     */
    public abstract void initDatas();

    /**
     * 对各种控件进行设置、适配、填充数据
     */
    public abstract void configViews();


    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();

    }
}
