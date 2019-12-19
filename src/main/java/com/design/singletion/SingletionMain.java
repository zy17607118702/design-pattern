package com.design.singletion;//类注释设置模板

import com.design.singletion.lanhan.Singletion;

/**
 * @Name:SingletionMain
 * @Description:
 * @Author: zhangyang
 * @Date: 2019-12-19 21:11
 **/
public class SingletionMain {
    public static void main(String[] args) {
        /**
         * 单例模式 就是值在程序运行的第一遍会实例化对象 都需只要程序不停止
         * 都不会再实例化该对象，需要用时就会适用对象本身
         */

        //懒汉式
        final Singletion instance = Singletion.getInstance();
        final Singletion instance1 = Singletion.getInstance();
        System.out.println(instance==instance1);
    }
}
