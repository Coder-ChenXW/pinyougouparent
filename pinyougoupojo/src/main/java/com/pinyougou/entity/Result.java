package com.pinyougou.entity;

import java.io.Serializable;


//分页结果实体类
public class Result implements Serializable {

    private boolean success;//是否成功
    private String message;//返回信息


    public Result() {
    }

    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    /**
     * 获取
     * @return success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * 设置
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * 获取
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return "Result{success = " + success + ", message = " + message + "}";
    }
}
