package com.study.ethwallet;

import org.greenrobot.greendao.generator.DaoGenerator;
import org.greenrobot.greendao.generator.Entity;
import org.greenrobot.greendao.generator.Property;
import org.greenrobot.greendao.generator.Schema;
import org.junit.Test;


public class GreenDao {

    @Test
    public  void greenDao()  {

        //更新数据库版本号，
        // 第二个参数为要生成的DAO类所在包路径。
        Schema schema = new Schema(1, "com.study.ethwallet.db");
        addWallet(schema);
        try {
            new DaoGenerator().generateAll(schema,"./src/main/java");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addWallet(Schema schema) {
        Entity wallet = schema.addEntity("ETHWallet");

        // 自定义表名
        wallet.setTableName("ETHWallet");

        //钱包
        //自增主键
        //notification.addIdProperty();
        wallet.addLongProperty("coinId").primaryKey();
        wallet.addStringProperty("name" ).notNull();
        wallet.addStringProperty("password" ).notNull();
        wallet.addStringProperty("keystorePath");
        wallet.addStringProperty("mnemonic");
        wallet.addBooleanProperty("isCurrent");//状态
        wallet.addBooleanProperty("isBackup");//状态


        //顾客
//        Entity customer = schema.addEntity("Customer");
//        customer.addLongProperty("customerId").primaryKey();
//        customer.addStringProperty("name").notNull();

        //币种
        Entity coin = schema.addEntity("Coin");
        coin.addLongProperty("coinId").primaryKey();
        coin.addStringProperty("name").notNull();
        coin.addStringProperty("simpleName");
        coin.addStringProperty("symbol");
        coin.addStringProperty("address").notNull();
        coin.addStringProperty("privateKey");
        coin.addStringProperty("publicKey");

        //建立一对多关联（钱包对币种为一对多）
        Property property = coin.addLongProperty("walletId").getProperty();
        coin.addToOne(wallet,property);
        wallet.addToMany(coin,property).setName("coins");

    }


}
