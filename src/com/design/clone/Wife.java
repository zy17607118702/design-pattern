package com.design.clone;//类注释设置模板

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Name:Wife
 * @Description:
 * @Author: zhangyang
 * @Date: 2019-12-18 23:24
 **/
@Data
public class Wife implements Serializable {

    private String name;
    private String age;

    public Wife(){
        this.name="测试老婆";
        this.age="99";
    }
}
