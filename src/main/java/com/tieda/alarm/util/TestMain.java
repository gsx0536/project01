package com.tieda.alarm.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestMain {

    public static void main(String[] args) throws Exception {
        String monthStr = "2019-11";
        String getMonth = monthStr.substring(monthStr.lastIndexOf("-"), monthStr.length());
        SimpleDateFormat simdf = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate = new Date();
        int currentMonth = currentDate.getMonth();
        System.out.println("getMonth----" + getMonth);
        System.out.println("currentMonth----" + currentMonth);

    }

    private static String underLineToCamel(String param) {
        StringBuilder result = new StringBuilder();
        String[] words = param.split("_");
        for (String s : words) {
            if (result.length() == 0) {
                result.append(s.toLowerCase());
            } else {
                result.append(s.substring(0, 1).toUpperCase());
                result.append(s.substring(1).toLowerCase());
            }
        }
        return result.toString().replace("$", "");
    }
}
