package com.design.clone;//类注释设置模板

import lombok.Data;

import java.io.*;
import java.util.Date;

/**
 * @Name:HusBand
 * @Description:
 * @Author: zhangyang
 * @Date: 2019-12-18 23:23
 **/
@Data
public class Husband implements Cloneable, Serializable {
    private Wife wife;
    private Date date;

    public Husband() {
        this.wife = new Wife();
        this.date = new Date();
    }

    /**
     * 浅度克隆
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * 利用串行化深克隆一个对象，把对象以及它的引用读到流里，在写入其他的对象
     * 更简单的深度方法就是 所有子对象全部new一遍
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        //将对象写到流里
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //从流里读回来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}
