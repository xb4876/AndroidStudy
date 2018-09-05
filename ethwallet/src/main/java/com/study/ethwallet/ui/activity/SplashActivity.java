package com.study.ethwallet.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.study.ethwallet.R;
import com.study.ethwallet.WalletApplication;
import com.study.ethwallet.entity.ETHWallet;
import com.study.ethwallet.ui.view.SplashView;

public class SplashActivity extends BaseActivity {


    @Override
    public int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    public void initToolBar() {

    }

    @Override
    public void initDatas() {

        // call after setContentView(R.layout.activity_sample);
        SplashView.showSplashView(this, 4, R.drawable.default_img, new SplashView.OnSplashViewActionListener() {
            @Override
            public void onSplashImageClick(String actionUrl) {
                Log.d("SplashView", "img clicked. actionUrl: " + actionUrl);
                Toast.makeText(SplashActivity.this, "img clicked.", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSplashViewDismiss(boolean initiativeDismiss) {
                //Toast.makeText(SplashActivity.this, "img clicked123.", Toast.LENGTH_SHORT).show();
                Log.d("SplashView", "dismissed, initiativeDismiss: " + initiativeDismiss);
                ETHWallet wallet = WalletApplication.getWallet();
                if(wallet == null) {
                    Intent intent = new Intent(getApplicationContext(), NoWalletActivity.class);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }
                finish();
            }
        });

        // call this method anywhere to update splash view data
        // SplashView.updateSplashData(this, "http://ww2.sinaimg.cn/large/72f96cbagw1f5mxjtl6htj20g00sg0vn.jpg", "http://jkyeo.com");
    }

    @Override
    public void configViews() {

    }
}
