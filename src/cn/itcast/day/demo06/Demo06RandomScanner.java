package cn.itcast.day.demo06;

import java.util.Random;
import java.util.Scanner;

/*
* 输出1~n之间的随机数
* */
public class Demo06RandomScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数字 ：");
        int[] array = randomScanner(scanner.nextInt());
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static int[] randomScanner(int n){
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(n) + 1 ;
        }
        return array;
    }

}
