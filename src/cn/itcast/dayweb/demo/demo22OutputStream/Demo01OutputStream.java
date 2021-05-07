package cn.itcast.dayweb.demo.demo22OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* java.io.OutputStream 此抽象类是表示输出字节流的所有类的超类
* java.io.FileOutputStream extends OutputStream也叫文件字节输出流，作用：把内存中的数据写入到硬盘文件中
* FileOutputStream(File file) 创建一个向指定 File 对象表示文件中写入数据的文件输出流。
FileOutputStream(String name) 创建一个向具有指定名称的文件中写入数据的输出文件流。
   写入文件的目的地：File file目的地是文件的路径，String name目的地是文件名
   * 作用： 1.会创建一个FileOutputStream对象
   * 2.会根据构造方法中传递的文件/目录创建一个空文件
   * 3.会把FileOutputStream对象会指向空文件
写入数据的原理：内存-->硬盘 ,java虚拟机JVM -->OS操作系统-->OS调用写数据的方法-->把数据写入到文件中
* 字节输出流步骤：1.创建一个FileOutputStream对象，参数写路径
* 2。调用write()方法;
* 3.流会占用一部分内存，使用完毕后要释放资源close();
*
* 0~127会查询ASCII编码表
* 超出127会查询系统编码表(简体中文 GBK编码表)
* */
public class Demo01OutputStream {
    public static void main(String[] args) {
        try {
            //System.out.println( System.getProperty("java.class.path"));获取根目录
            FileOutputStream fos = new FileOutputStream("day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo22OutputStream\\a.txt");
            fos.write(97);//在写数据的时候会把十进制的字符转换为二进制，任意文本编辑器在打开文件的时候会查询编码表把字节转换为字符
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
