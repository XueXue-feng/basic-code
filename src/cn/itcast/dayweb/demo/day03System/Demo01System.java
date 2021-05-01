package cn.itcast.dayweb.demo.day03System;

import java.util.Arrays;

public class Demo01System {
    public static void main(String[] args) {
       arrayCopySystem();
        testTime();
    }

    public static void arrayCopySystem(){
        int[] arraySrc = new int[]{1,2,3,4,5};
        int[] arrayDest  = new int[]{6,7,8,9,10};
        System.arraycopy(arraySrc,0,arrayDest,0,3);
        /*for (int i = 0; i < arrayDest.length; i++) {
            System.out.println(arrayDest[i]);
        }*/
        System.out.println(Arrays.toString(arrayDest));
    }

    //使用for循环测试打印从1~9999所用的时间
    public static void testTime(){
        long testStart = System.currentTimeMillis();
        for (int i = 1; i < 9999 ; i++) {
            System.out.print(i);
        }
        long testEnd = System.currentTimeMillis();
        System.out.println("\n打印从1~9999，所使用的时间为" + ((testEnd - testStart) ));
    }
}
