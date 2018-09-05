package com.study.ethwallet.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.study.ethwallet.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import jnr.ffi.annotations.In;

/**
 * 创建或导入钱包
 */
public class NoWalletActivity extends BaseActivity {


    @BindView(R.id.create_wallet_btn)
    TextView createWallet;
    @BindView(R.id.import_wallet_btn)
    TextView importWallet;

    @Override
    public int getLayoutId() {
        return R.layout.activity_no_wallet;
    }

    @Override
    public void initToolBar() {

    }

    @Override
    public void initDatas() {

    }

    @Override
    public void configViews() {

    }


    @OnClick({R.id.create_wallet_btn, R.id.import_wallet_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.create_wallet_btn:
                Log.d("NoWalletActivity","创建钱包");
                Intent intent = new Intent(getApplicationContext(), CreateWalletActivity.class);
                startActivity(intent);

                break;
            case R.id.import_wallet_btn:
                Log.d("NoWalletActivity","导入钱包");
                break;
        }
    }
}
