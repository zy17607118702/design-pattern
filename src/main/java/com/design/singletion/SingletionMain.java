package com.design.singletion;//类注释设置模板

import com.design.singletion.ehan.SingletionE;
import com.design.singletion.lanhan.SingletionL;

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
        final SingletionL instance = SingletionL.getInstance();
        final SingletionL instance1 = SingletionL.getInstance();
        System.out.println(instance==instance1);
        //饿汉式 直接new 不判断是否为空
        final SingletionE instance2 = SingletionE.getInstance();
        final SingletionE instance3 = SingletionE.getInstance();
        System.out.println(instance2==instance3);

    }
}
