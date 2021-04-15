package cn.itcast.day04.demo06;
import java.util.Scanner;
/*
* Scanner类的功能可以实现键盘输入数据到程序当中
* 引用类型的一般使用步骤：
* 1.导包：import 包路径.类名称 如果需要使用的目标类和所在类在同一个包下可以不写,只有Java.lang包不需要导包
* 2.创建：类名称 对象名 = new 类名称();
* 3.使用：对象名.成员方法名
* */
public class Demo03Scanner {
    public static void main(String[] args) {
        String name = "123";
        //System.in代表从键盘输入
        Scanner scanner = new Scanner(System.in);
        //获取键盘输入的int数字
        int num = scanner.nextInt();
        System.out.println("输入的键盘数字是： " + num);
        //获取键盘输入的字符串
        name = scanner.next();
        System.out.println("输入的键盘字符串是： " + name);
    }
}
