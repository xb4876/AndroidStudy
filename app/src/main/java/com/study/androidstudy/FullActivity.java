package com.study.androidstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class FullActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //没有标题
        //this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        //去掉标题栏 this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        // 设置全屏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_full);
    }
}
