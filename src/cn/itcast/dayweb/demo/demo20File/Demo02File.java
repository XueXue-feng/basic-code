package cn.itcast.dayweb.demo.demo20File;

import java.io.File;

/*
 * 绝对路径：是一个完整的路径，以盘符开始的路径 D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code
 * 相对路径：是一个简化的路径，相对于当前项目的根目录，如果使用当前项目的根目录可以简化书写.
 * EXP:文件目录为：D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\123.txt可以简化书写为：123.txt(可以省略项目根目录)
 * 注意：1.路径不区分大小写
 * 2.在Windows中使用\，反斜杠是转义字符，所以反斜杠要写两个才能代表一个转义字符
 * */
public class Demo02File {
    public static void main(String[] args) {
        //show01();
       // show02("D:\\", "a.txt");//D:\a.txt
        show03();
    }

    /*
    * File(File parent, String child)
          根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
    * */
    private static void show03() {
        File fileParent = new File("D:\\");
        String child = "Hello.java";
        File file = new File(fileParent,child);
        System.out.println(file);//D:\Hello.java
    }

    /*
     * File(String parent, String child) 根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例
     * 路径 = parent(父路径) + child(子路径) 可以单独书写灵活使用
     * */
    private static void show02(String parent, String child) {
        File file = new File(parent, child);
        System.out.println(file);
    }

    /*构造方法File(String pathname) 通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例
     * 1.可以是文件夹结尾也可以是文件结尾
     * 2.可以是相对路径也可以是绝对路径
     * 3.文件夹路径可以存在也可以不存在。因为File对象只是把文件夹路径字符串封装为File对象，不考虑真假
     */
    private static void show01() {
        File file = new File("D:\\IntelliJ IDEA 2020.3.3\\code\\a.txt");
        System.out.println(file);//重写了toString()方法D:\IntelliJ IDEA 2020.3.3\code\a.txt

        File file2 = new File("D:\\IntelliJ IDEA 2020.3.3\\code");
        System.out.println(file2);//D:\IntelliJ IDEA 2020.3.3\code

        File file3 = new File("a.txt");
        System.out.println(file3);//a.txt

    }
}
