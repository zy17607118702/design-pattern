package com.design.clone;//类注释设置模板

import com.design.exception.AppException;

/**
 * @Name:CloneDemo
 * @Description:
 * @Author: zhangyang
 * @Date: 2019-12-18 23:12
 **/
public class CloneDemo {
    /**
     * 升读克隆和浅度克隆 见克隆解析.txt
     * 里面的子对象指向一个对象和两个对象的问题
     */


    public static void main(String[] args) {
        //实例化对象
        Husband husband=new Husband();
        try {
            final Husband clone = (Husband)husband.clone();
            //husband 输出为false 说明对象不一样
            System.out.println(husband==clone);
            //husband.getWife() 输出为true 说明子对象是浅度克隆
            System.out.println(husband.getWife()==clone.getWife());
            final Husband deepClone =  (Husband)husband.deepClone();
            //husband 输出为false 说明对象不一样
            System.out.println(husband==deepClone);
            //husband.getWife() 输出为false  说明子对象也不一样
            System.out.println(husband.getWife()==deepClone.getWife());
        }catch (Exception ex){
            ex.printStackTrace();
        }


    }
}
