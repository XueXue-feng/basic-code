package cn.itcast.dayweb.demo.demo22OutputStream;

import java.io.*;

/*
* java.io.InputStream字节输入流超类
* java.io.FileInputStream extends InputStream 文件字节输入流读取文件
* 作用：1、文件硬盘中的文件读取到内存中
* 构造方法：FileInputStream(File file)
          通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定。
          FileInputStream(String name)
          通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定。
作用：1.会创建一个FileInputStream对象
*    2.会把FileInputStream对象会指向文件
* 读取数据的原理：硬盘-->内存
* java虚拟机-->OS操作系统-->OS读取文件的方法-->读取文件
* 使用步骤：
* 1.创建FileInputStream对象，构造方法中绑定要读取的数据源
* 2.使用FileInputStream中的read方法
* 3.释放相关资源
* */
public class Demo04InputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo22OutputStream\\a.txt");
           /* System.out.println(fis.read());//读取一个字节  97 a
            *System.out.println(fis.read());//读取一个字节， 98 b 读取完之后会把指针像后移动一位
            *System.out.println(fis.read());//读取一个字节， 99 c
            *System.out.println(fis.read());//-1 **/
            //可以使用循环优化
            int num = 0;
            while((num = fis.read()) != -1){
                System.out.println(num);
            }

            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
