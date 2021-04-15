package cn.itcast.day04.demo06;

import java.util.Scanner;

/*
* 从键盘输入三个数字并求其最大值
* */
public class ScannerMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个数字：");
        int a = scanner.nextInt();
        System.out.print("请输入第二个数字：");
        int b = scanner.nextInt();
        System.out.print("请输入第三个数字：");
        int c = scanner.nextInt();

       /* int[] array = new int[]{a,b,c};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(a >= b ){
                max = a;
            }else if (max >= c){
                max = max;
            }else{
                max = c;
            }
        }*/

        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println("最大值是： " + max);
    }
}
