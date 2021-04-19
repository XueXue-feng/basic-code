package cn.itcast.day.demo06;

import java.util.Scanner;

//从键盘输入两个数字并求和
public class ScannerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个数字");
        int a = scanner.nextInt();
        System.out.print("请输入第二个数字");
        int b = scanner.nextInt();
        System.out.println("两个数字之和是： " + (a + b));
    }
}
