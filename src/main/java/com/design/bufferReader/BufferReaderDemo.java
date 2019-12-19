package com.design.bufferReader;

import com.design.exception.AppException;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 * @Name:BufferReader
 * @Description:
 * @Author: zhangyang
 * @Date: 2019-12-18 22:16
 **/
public class BufferReaderDemo {
    /**
     * 读取文本文档中的内容
     *
     * @param path 路径
     * @return
     */
    public static String readFiles(String path) {
        StringBuilder rssult = new StringBuilder();
        try {
            //读取的时指定GBK编码格式，若中文出现乱码请尝试utf-8，window默认编码格式为GBK
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "utf8"));

            String s = null;
            while ((s = reader.readLine()) != null) {
                //System.lineSeparator() 换行符
                rssult.append(System.lineSeparator() + s);
            }
            reader.close();
        } catch (Exception ex) {
            throw new AppException(ex.getMessage());
        }

        return rssult.toString();
    }

    public static void main(String[] args) {
        final String path = BufferReaderDemo.class.getResource("").getPath();
        // \t是分隔符 注意
        final String files = readFiles(path+"\\test.txt");
        System.out.println(files);
    }
}
