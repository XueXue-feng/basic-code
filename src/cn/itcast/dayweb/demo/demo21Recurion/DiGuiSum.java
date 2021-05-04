package cn.itcast.dayweb.demo.demo21Recurion;

import java.util.Scanner;

/*
 * 累加计算1~n的和
 * 使用递归求和;main调用sum方法，导致在内存中有多个sum方法，会频繁的创建方法，调用方法，销毁方法，效率低下
 * 如果仅仅是计算1~n的和不推介使用递归求和
 * */
public class DiGuiSum {
    static int sum = 0;
    static int i = 0;

    public static void main(String[] args) {
        getSum(getNumber());
    }

    //此方法从键盘输入一个整数并获取该整数
    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数:");
        return scanner.nextInt();
    }

    //该方法要求使用递归的方法求出1~n的和
    public static void getSum(int num) {
        if (i == num + 1) {
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        i += 1;
        getSum(num);

    }
}
