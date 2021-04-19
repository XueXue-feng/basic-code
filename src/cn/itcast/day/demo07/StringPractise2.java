package cn.itcast.day.demo07;

import java.util.ArrayList;

/*
* 统计字符串中各种字符的个数
* 失败没做出来
* */
public class StringPractise2 {
    public static void main(String[] args) {
        char[] arrayChar = {'1','a','a','d','g','5','7','8','o','a'};
        sumArrayChar(arrayChar);
    }
    //给定一个字符串，返回一个char[]
    public static char[] stringToChar(String str){
        char[] arrayChar = str.toCharArray();
        return arrayChar;
    }
    //统计一个char数组中各个字符的个数
    public static ArrayList<Character> sumArrayChar(char[] arrayChar){
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int begin = 0; begin < arrayChar.length ; begin++) {
            for(int end = 0;end < arrayChar.length ;end ++){
                int num = 0;
                if(end < arrayChar.length && arrayChar[begin] == arrayChar[end]){
                    if(end != begin){
                        num += 1;
                    }
                    num += 1;
                    arrayList.add(arrayChar[begin]);

                    System.out.println(arrayChar[begin] + "有" + num + "个");

                }
            }
        }
        System.out.print(arrayList);
        return arrayList;
    }


}
