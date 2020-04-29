package com.tieda.alarm.constants;

import org.apache.commons.codec.digest.DigestUtils;

public class WXConstants {

    public static final String MD5_KEY = "!!1890&MoydjX*%!YI090132!#23FWEjkuiyieyI3";

    public static void main(String args[]) {
        System.out.println(DigestUtils.md5Hex("123" + WXConstants.MD5_KEY));
    }
}
