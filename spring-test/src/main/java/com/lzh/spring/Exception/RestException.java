package com.lzh.spring.Exception;

/**
 * Created by lzh on 2016/5/9.
 */
public class RestException extends RuntimeException{
    private int code;
    private String message;
    private String detailedMessage;

    public RestException(int code, String message, String detailedMessage) {
        this.code = code;
        this.message = message;
        this.detailedMessage = detailedMessage;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetailedMessage() {
        return detailedMessage;
    }

    public void setDetailedMessage(String detailedMessage) {
        this.detailedMessage = detailedMessage;
    }
}
