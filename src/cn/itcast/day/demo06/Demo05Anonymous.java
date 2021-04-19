package cn.itcast.day.demo06;

import java.util.Scanner;

public class Demo05Anonymous {
    public static void main(String[] args) {
        //普通使用方式
        Scanner scanner = new Scanner(System.in);
        /*System.out.print("请在键盘上输入一个数字");
        int a = scanner.nextInt();*/
        //匿名对象的方式
        //int b = new Scanner(System.in).nextInt();
        //System.out.println(b);
       // System.out.println(ScannerParam(new Scanner(System.in)));
        scanner = ScannerParam2();
    }

    public static int ScannerParam(Scanner scanner){
        //System.out.print("请在键盘上输入一个数字");
        int b = scanner.nextInt();
        return b;
    }
    //匿名对象作为返回值
    public static Scanner ScannerParam2 (){
        System.out.println("我执行了");
        return new Scanner(System.in);
    }
}
