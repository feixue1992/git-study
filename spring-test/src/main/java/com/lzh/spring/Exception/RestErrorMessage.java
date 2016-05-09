package com.lzh.spring.Exception;

import org.springframework.http.HttpStatus;

/**
 * Created by lzh on 2016/5/9.
 */
public class RestErrorMessage {
    private HttpStatus  status;
    private int code;
    private String message;
    private String detailedMessage;
    private String exceptionMessage;

    public RestErrorMessage(HttpStatus status, int code, String message, String detailedMessage, String exceptionMessage) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.detailedMessage = detailedMessage;
        this.exceptionMessage = exceptionMessage;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDetailedMessage() {
        return detailedMessage;
    }

    public void setDetailedMessage(String detailedMessage) {
        this.detailedMessage = detailedMessage;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
