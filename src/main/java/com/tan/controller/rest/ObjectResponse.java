package com.tan.controller.rest;

import lombok.Data;

import java.io.Serializable;

/**
 * @author TWH
 * @date 2022/7/15 10:03
 */
@Data
public class ObjectResponse<T> implements Serializable {

    private Integer code;

    private T data;

    private String message;

    public ObjectResponse(){
    }

    /**
     *
     * @param code 响应码
     * @param message 信息
     */
    public ObjectResponse(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    public ObjectResponse(Integer code,String message,T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 失败返回数据
     * @return ObjectResponse
     */
    public ObjectResponse<T> fail(String message){
        return new ObjectResponse<>(500,message);
    }

    /**
     * 成功返回数据
     * @return ObjectResponse
     */
    public ObjectResponse<T>  ok(T data){
        return new ObjectResponse<>(200,"success",data);
    }
}
