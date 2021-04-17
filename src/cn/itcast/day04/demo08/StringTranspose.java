package cn.itcast.day04.demo08;

import java.util.Arrays;
import java.util.Random;

/*
* 输入一个数组，写一个方法实现数组倒序排序
* */
public class StringTranspose {
    public static void main(String[] args) {
        int[] arrayRandom = {10,29,29,79};
        for (int i = 0; i < arrayRandom.length; i++) {
            System.out.print(arrayRandom[i] + ",");
        }
        System.out.println("\n==============");
        int[] array = transposeArray(arrayRandom);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "," );
        }
        System.out.println("\n==============");

        //对字符数组进行升序排列
        String str = "asertyuikolcvbnjmkvbnjmk";
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + ",");
        }
    }

    //用随机数产生一个长度为6的数组
    public static int[] randomArray(){
        int[] arrayInt = new int[6];
        for (int i = 0; i < 6; i++) {
            arrayInt[i] = new Random().nextInt(100) + 1;
        }
        return arrayInt;
    }

    //倒序 int[] 数组
    public static int[] transposeArray(int[] array){
        int[] arrayInt = new int[array.length];
        Arrays.sort(array);
        for (int a = array.length - 1,b = 0; a  >= 0 && b < array.length; a --,b ++) {
            arrayInt[b] = array[a];
        }
        return arrayInt;
    }
}
