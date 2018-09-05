package com.study.ethwallet.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.kenai.jffi.Main;
import com.study.ethwallet.R;
import com.study.ethwallet.WalletApplication;
import com.study.ethwallet.entity.ETHWallet;
import com.study.ethwallet.util.WalletUtil;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import jnr.ffi.annotations.In;

public class CreateWalletActivity extends BaseActivity {


    @BindView(R.id.wallet_name)
    EditText walletName;
    @BindView(R.id.wallet_password)
    EditText walletPassword;
    @BindView(R.id.create_wallet_btn)
    Button createWalletBtn;

    @Override
    public int getLayoutId() {
        return R.layout.activity_create_wallet;
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


    @OnClick({R.id.create_wallet_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.create_wallet_btn:
                //TODO 验证表单

                String name = String.valueOf(walletName.getText());
                String pwd = String.valueOf(walletPassword.getText());

                ETHWallet ethWallet = new ETHWallet();
                ethWallet.setName(name);
                ethWallet.setPassword(pwd);
                String mnemonics = WalletUtil.generateMnemonic();
                ethWallet.setMnemonic(mnemonics);

                WalletApplication.setWallet(ethWallet);

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();

                break;
        }
    }
}
