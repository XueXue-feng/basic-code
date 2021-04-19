package cn.itcast.day.demo08;

import java.util.Arrays;

/*
* java.util.Arrays是一个与数组相关的工具类，里面包含了大量的静态方法，用来实现与数组相关的操作
* 1.public static String toString(数组);//将参数数组变成默认格式的字符串[元素1,元素2,....]
* 2.public static sort(数组)//按照升序对数组进行排序
* PS:如果是数组sort默认按照从小到大，如果是String按照字母顺序，
* 如果是自定义类型的类，需要Comparable或者是Comparator接口的支持//今后学习
* */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] array = {10,20,30};
        //将Int[]按照默认格式变成String
        String str = Arrays.toString(array);
        System.out.println(str);//[10, 20, 30]

        int[] arrayB = {10,20,30,4,6,3};
        Arrays.sort(arrayB);
        System.out.println(Arrays.toString(arrayB));//[3, 4, 6, 10, 20, 30]

        String[] str2 = {"bbb","aaa","bbb","ccc"};
        Arrays.sort(str2);
        System.out.println(Arrays.toString(str2));//[aaa, bbb, bbb, ccc]

    }
}
