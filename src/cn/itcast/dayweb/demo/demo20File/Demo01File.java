package cn.itcast.dayweb.demo.demo20File;

import java.io.File;

/*
*  java.io.File 类 文件和目录路径名的丑偶像表现形式
*  java把电脑中的文件和文件夹（目录）封装为一个file类，我们可以通过file类对文件夹进行操作
* File类是一个与操作系统无关的类，任何一个操作系统都可以使用File类
* file文件 directory文件夹/目录 path 文件夹路径
* 操作系统路径不能写死了EXP：D:\Java\JDK 9.0 API可以写成 "D:"+ File.separator + "Java"+ File.separator +"JDK 9.0 API"
* */
public class Demo01File {
    public static void main(String[] args) {
        //pathSeparator 与系统有关的路径分隔符
        System.out.println(File.pathSeparator);//windows 是; Linux是冒号:
        //separator 与系统有关的默认名称分隔符
        System.out.println(File.separator);//文件名称分隔符windows 是\ Linux是 /
    }
}
