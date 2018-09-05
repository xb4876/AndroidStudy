package com.study.ethwallet.entity;


import java.util.List;



/**
 * Entity mapped to table "ETHWallet".
 */
public class ETHWallet {


    private String name;

    private String password;
    private String keystorePath;
    private String mnemonic;
    private Boolean isCurrent;
    private Boolean isBackup;


    private List<Coin> coins;

    public ETHWallet() {
    }


    public ETHWallet(Long coinId, String name, String password, String keystorePath, String mnemonic, Boolean isCurrent, Boolean isBackup) {
        this.name = name;
        this.password = password;
        this.keystorePath = keystorePath;
        this.mnemonic = mnemonic;
        this.isCurrent = isCurrent;
        this.isBackup = isBackup;
    }



    public String getName() {
        return name;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setName( String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setPassword( String password) {
        this.password = password;
    }

    public String getKeystorePath() {
        return keystorePath;
    }

    public void setKeystorePath(String keystorePath) {
        this.keystorePath = keystorePath;
    }

    public String getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }

    public Boolean getIsCurrent() {
        return isCurrent;
    }

    public void setIsCurrent(Boolean isCurrent) {
        this.isCurrent = isCurrent;
    }

    public Boolean getIsBackup() {
        return isBackup;
    }

    public void setIsBackup(Boolean isBackup) {
        this.isBackup = isBackup;
    }




}
