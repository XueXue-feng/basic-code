package cn.itcast.dayweb.demo.demo20File;

import java.io.File;

/*
* 判断文件是否存在：public boolean exists();
* 判断文件是以文件夹结尾的：public boolean isDirectory()
* 判断文件是以文件结尾的:public boolean isFile();
* 如果路径不存在isDirectory(),isFile();则都返回false
* */
public class Demo04File {
    static File file = new File("D:\\Download\\a.txt");
    public static void main(String[] args) {
        System.out.println(file.exists());//true


        if(file.exists()){
            System.out.println(file.isFile());//true
            System.out.println(file.isDirectory());//false
        }
    }
}
