package com.design.singletion.lanhan;//类注释设置模板

/**
 * @Name:Singletion
 * @Description:
 * @Author: zhangyang
 * @Date: 2019-12-19 21:07
 **/
public class Singletion {
    //懒汉式-非线程安全的单例模式
    private static  Singletion instance;
    private Singletion(){
    }
    //非线程安全
//    public static   Singletion getInstance(){
//        if(instance==null){
//            instance=new Singletion();
//        }
//        return instance;
//    }

    //线程安全 加上synchronized表示线程同步
    public static synchronized  Singletion getInstance(){
        if(instance==null){
            instance=new Singletion();
        }
        return instance;
    }
}
