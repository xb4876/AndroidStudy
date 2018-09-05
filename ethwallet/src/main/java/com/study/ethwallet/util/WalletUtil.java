package com.study.ethwallet.util;

import org.bitcoinj.core.Utils;
import org.bitcoinj.wallet.DeterministicSeed;

import java.security.SecureRandom;
import java.util.List;

public class WalletUtil {

    /**
     * 创建助记词
     *
     * @return
     */
    public static String generateMnemonic() {
        String passphrase = "";
        DeterministicSeed ds = new DeterministicSeed(new SecureRandom(), 128, passphrase, Utils.currentTimeSeconds());

        List<String> mnemonicCode = ds.getMnemonicCode();

        return convertMnemonicList(mnemonicCode);
    }

    //拼接助记词
    private static String convertMnemonicList(List<String> mnemonics) {
        StringBuilder sb = new StringBuilder();
        for (String mnemonic : mnemonics) {
            sb.append(mnemonic);
            sb.append(" ");
        }

        //去掉两边的空格
        return sb.toString().trim();
    }
}
