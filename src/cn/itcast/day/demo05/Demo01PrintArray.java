package cn.itcast.day.demo05;

import java.util.Arrays;

/*
  面向过程：当需要实现一个功能时，每一个步骤都需要一步步的处理
* 面向对象：当需要实现一个功能时，找到一个有这项功能的人来实现
* */
public class Demo01PrintArray {
    public static void main(String[] args) {
        //打印输出一个数组格式为[1,2,3,4]
        int[] array = {1,2,3,4};

        //面向对象
        //找一个JDK给我们提供好的Array类，其中有一个toString()方法可以实现把数组变成一个字符串
        System.out.println(Arrays.toString(array));

        //面向过程,每一个步骤都要亲历亲为
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i < array.length - 1 ){
                System.out.print(array[i] + ", ");
            }else{
                System.out.print(array[i] );
            }
        }
        System.out.print("]");
    }

    /*public static void printArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i < array.length - 1 ){
                System.out.print(array[i] + ", ");
            }else{
                System.out.print(array[i] );
            }
        }
        System.out.print("]");
    }*/
}

