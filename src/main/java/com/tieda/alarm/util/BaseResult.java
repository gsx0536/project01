package com.tieda.alarm.util;

public class BaseResult {
    private String type = "success";
    private String message = "返回成功";
    private Response response;

    public BaseResult(String type, String message, Response response) {
        this.type = type;
        this.message = message;
        this.response = response;
    }

    public BaseResult(String type, String message) {
        this.type = type;
        this.message = message;
    }


    public BaseResult(Response response) {
        this.response = response;
    }

    public BaseResult(Object data) {
        this.response = new Response(data);
    }

    public BaseResult() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "{" +
                "\"type\":\"" + type + "\"" +
                ", \"message\":\"" + message + "\"}";
    }
}

