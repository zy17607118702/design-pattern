package com.design.singletion.ehan;//类注释设置模板

/**
 * @Name:SingletionE
 * @Description:
 * @Author: zhangyang
 * @Date: 2019-12-19 21:20
 **/
public class SingletionE {
    private static SingletionE instance=new SingletionE();
    private SingletionE(){

    }
    public static SingletionE getInstance(){
        return instance;
    }
}
