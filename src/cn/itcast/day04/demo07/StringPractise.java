package cn.itcast.day04.demo07;

import java.lang.reflect.Array;
import java.util.Random;

/*
 * 定义一个方法，把数组{1,2,3}按照指定个格式拼接成一个字符串。格式参照如下：[word1#word2#word3]
 * */
public class StringPractise {
    public static void main(String[] args) {
        int[] array = arrayRandom();
        System.out.println("[" + arrayToString(array) + "]");
    }

    //产生一个长度为6的随机数组
    public static int[] arrayRandom() {
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100) + 1;
        }
        return array;
    }

    //将数组中的,改成*
    public static String arrayToString(int[] array) {
        String str = "";
        for (int i = 0; i < array.length; i++) {
            if (i == (array.length - 1)) {
                str = str + array[i];
            } else {
                str = str + array[i] + ",";
            }
        }
        //System.out.println("[" + str + "]");
        return str.replace(",","*");
    }
}
