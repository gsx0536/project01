package com.tieda.alarm.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResponseData {

    private String msg;

    private int code;

    private long count;

    private Map<String, Object> meta = new HashMap<>();

    private List data = new ArrayList();


    private ResponseData(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private ResponseData(int code, String msg, long count) {
        this.code = code;
        this.msg = msg;
        this.count = count;
    }

    public static ResponseData ok() {
        return new ResponseData(0, "Ok" );
    }

    public static ResponseData error() {
        return new ResponseData(1, "ERROR" );
    }

    public static ResponseData ok(String msg) {
        return new ResponseData(0, msg);
    }

    public static ResponseData error(String msg) {
        return new ResponseData(1, msg);
    }


    public static ResponseData errorData(String key, Object value) {
        ResponseData data = new ResponseData(1, "ERROR" );
        data.putDataMap(key, value);
        return data;
    }

    public static ResponseData okData(Object value) {
        ResponseData data = new ResponseData(0, "Ok" );
        data.putData(value);
        return data;
    }

    public static ResponseData okData(String key, Object value) {
        ResponseData data = new ResponseData(0, "Ok" );
        data.putDataMap(key, value);
        return data;
    }

    public static ResponseData okData(List value, long count) {
        ResponseData data = new ResponseData(0, "Ok", count);
        data.putData(value);
        return data;
    }

    public static ResponseData notFound() {
        return new ResponseData(404, "Not Found" );
    }

    public static ResponseData badRequest() {
        return new ResponseData(400, "没有数据" );
    }

    public static ResponseData forbidden() {
        return new ResponseData(403, "Forbidden" );
    }

    public static ResponseData unauthorized() {
        return new ResponseData(401, "unauthorized" );
    }

    public static ResponseData serverInternalError() {
        return new ResponseData(500, "Server Internal Error" );
    }

    public static ResponseData illegalArgument(Object errorTipObj) {
        ResponseData data = new ResponseData(0, "illegalArgument" );
        data.putDataMap("error", errorTipObj);
        return data;
    }

    public static ResponseData customerError() {
        return new ResponseData(1001, "Customer Error" );
    }

    public static ResponseData customerError(String message) {
        return new ResponseData(1001, message);
    }

    public static ResponseData customerError(String key, Object value) {
        ResponseData data = new ResponseData(1001, "Customer Error" );
        data.putDataMap(key, value);
        return data;
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }

    public long getCount() {
        return count;
    }

    public Map<String, Object> getMeta() {
        return meta;
    }

    public List<Object> getData() {
        return data;
    }

    public ResponseData putDataMap(String key, Object value) {
        this.meta.put(key, value);
        return this;
    }

    public ResponseData putData(Object o) {
        data.add(o);
        return this;
    }

    public ResponseData putData(List value) {
        data.addAll(value);
        return this;
    }

    public static ResponseData erroMsg(int code, String msg) {

        return new ResponseData(code, msg);
    }


}
