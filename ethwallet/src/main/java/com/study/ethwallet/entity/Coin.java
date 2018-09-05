package com.study.ethwallet.entity;



/**
 * Entity mapped to table "COIN".
 */
public class Coin {

    private Long coinId;

    private String name;
    private String simpleName;
    private String symbol;

    private String address;
    private String privateKey;
    private String publicKey;
    private Long walletId;


    private ETHWallet eTHWallet;

    private transient Long eTHWallet__resolvedKey;

    public Coin() {
    }

    public Coin(Long coinId) {
        this.coinId = coinId;
    }

    public Coin(Long coinId, String name, String simpleName, String symbol, String address, String privateKey, String publicKey, Long walletId) {
        this.coinId = coinId;
        this.name = name;
        this.simpleName = simpleName;
        this.symbol = symbol;
        this.address = address;
        this.privateKey = privateKey;
        this.publicKey = publicKey;
        this.walletId = walletId;
    }



    public Long getCoinId() {
        return coinId;
    }

    public void setCoinId(Long coinId) {
        this.coinId = coinId;
    }

    public String getName() {
        return name;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setName( String name) {
        this.name = name;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getAddress() {
        return address;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setAddress( String address) {
        this.address = address;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public Long getWalletId() {
        return walletId;
    }

    public void setWalletId(Long walletId) {
        this.walletId = walletId;
    }


}
