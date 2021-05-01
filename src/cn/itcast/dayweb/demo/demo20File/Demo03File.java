package cn.itcast.dayweb.demo.demo20File;

import java.io.File;

public class Demo03File {
    static File file = new File("D:\\Download","a.txt");

    public static void main(String[] args) {
        //getFileAbsolutePath();
       // getFilePath();
        getFileName();
        getFileLength();//0
    }

    //public String getAbsolutePath获取文件的绝对路径
    public static void getFileAbsolutePath() {
        System.out.println(file.getAbsoluteFile());//D:\Download\a.txt
    }
    //public String getPath()
    public static void getFilePath() {
        File file = new File("a.txt");
        System.out.println(Demo03File.file.getPath());//绝对的就是绝对的，相对的就是相对的
        System.out.println(file.toString());//D:\Download\a.txt两个方法一样
    }
    //public String getName传递构造方法的结尾部分是一个文件或者是文件夹
    public static void getFileName(){
        System.out.println(file.getName());//a.txt

    }
    //public long length()注意：1.文件夹没有大小概念 2.如果文件路径是假的则返回0
    public static void getFileLength(){
        System.out.println(file.length());
    }

}
