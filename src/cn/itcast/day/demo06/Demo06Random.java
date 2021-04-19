package cn.itcast.day.demo06;

import java.util.Random;

/*
* Random类用来产生随机数
* 导包：import java.util.Random
* 创建:Random r = new Random()
* 使用:int num = r.nextInt();当小括号中没有数字时，他产生的int数字是所有int数字+-21亿
* nextInt(int n)
      返回一个伪随机数，它是取自此随机数生成器序列的、在 0（包括）和指定值（不包括）之间均匀分布的 int 值。
* */
public class Demo06Random {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(5));
        int[] array = new int[100];

        //生成100个1~100之间的随机数
        for (int i = 0; i < 100; i++) {
           array[i] =  random.nextInt(101);
            System.out.println(array[i]);
        }

    }

}
