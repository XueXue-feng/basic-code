package cn.itcast.day.demo06;

import java.util.Random;
import java.util.Scanner;

/*
 * 给定一个数,然后猜一个数字，系统告诉他大了还是小了，并告知范围
 * */
public class Demo07RandomPractise {
    public static void main(String[] args) {
        //产生随机数
        System.out.print("请输入一个数字");
        int systemArgs = randomScanner(new Scanner(System.in).nextInt());
        System.out.println("给定的数字为： " + systemArgs);
        int i = 0;
        do {
            if (i == 2) {
                System.out.println("只剩最后一次机会了哦！");
            } else{
                System.out.println("请猜一个数字，系统会判断其与给定值的大小哦！！！");
             }
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            i += 1;
            if (judge(systemArgs, num)) {
                System.out.println("恭喜你！！！");
                break;
            }
        } while (true && i < 3);
    }

    //输入一个数字n给出一个1~n的随机数
    public static int randomScanner(int num) {
        //System.out.println();
        return new Random().nextInt(num) + 1;
    }

    //给出一个数告诉他比输入的数字大还是小,systemArgs是给定的数字，num是你猜的数字
    public static boolean judge(int systemArgs, int num) {
        if (systemArgs > num) {
            System.out.println("你猜的有点小哦");
            return false;
        } else if (systemArgs < num) {
            System.out.println("你猜的有点大哦");
            return false;
        } else {
            System.out.print("你猜对了");
            return true;
        }
    }
}
