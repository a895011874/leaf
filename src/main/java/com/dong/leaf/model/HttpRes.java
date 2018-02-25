package com.dong.leaf.model;

import lombok.Data;

import java.util.List;

/**
 * Create by liudong on 2018/2/24
 */
@Data
public class HttpRes
{
    public static final String SUCCESS = "success";

    public static final String FAILURE = "failure";

    //请求状态
    private String state;

    //错误信息
    private String msg;

    //返回数据
    private List data;


}
