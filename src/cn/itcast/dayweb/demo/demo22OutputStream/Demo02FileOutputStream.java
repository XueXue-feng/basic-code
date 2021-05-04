package cn.itcast.dayweb.demo.demo22OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
* 一次写多个字节的方法
* void write(byte[] b)  将 b.length 个字节从指定 byte 数组写入此文件输出流中。
  void write(byte[] b, int off, int len) 将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流。
  * 把字节数组的一部分写入,off是开始索引，len是写几个
注意：1.如果写入的第一个字节是正数(0~127)就会查询ASCII
* 2.如果写入的第一次字节是负数就会和第二个字节组成一个中文显示，查询系统默认码表
* */
public class Demo02FileOutputStream {
    public static void main(String[] args) {
        byte[] b = new byte[]{49,48,48};
        try {
        FileOutputStream fos = new FileOutputStream("day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo22OutputStream\\b.txt");
        fos.write(b);

        fos.write(b,0,1);
        fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //写入字符串的方法，可以使用String中的getBytes
        String str = "Hello World!!!";
        byte[] b2 = str.getBytes(StandardCharsets.UTF_8);
        try {
        FileOutputStream fos = new FileOutputStream("day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo22OutputStream\\c.txt");
            fos.write(b2);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
