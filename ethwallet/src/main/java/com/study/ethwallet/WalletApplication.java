package com.study.ethwallet;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;
import android.util.Log;

import com.study.ethwallet.entity.ETHWallet;

import org.bitcoinj.wallet.Protos;


public class WalletApplication extends MultiDexApplication {

    private static WalletApplication sInstance;
    private static ETHWallet wallet;


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("WalletApplication","onCreate");

        sInstance = this;

    }


    public static WalletApplication getsInstance() {
        return sInstance;
    }


    public static ETHWallet getWallet(){
        return wallet;
    }

    public static void setWallet(ETHWallet newWallet){
        wallet = newWallet;
    }
}
