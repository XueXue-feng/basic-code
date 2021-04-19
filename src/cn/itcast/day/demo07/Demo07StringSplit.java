package cn.itcast.day.demo07;

/*
* 字符串的分割
* public String[] spilt(String regex){}//按照参数的规则，将字符串切割成若干部分
* 注意事项：
* 1.
* */
public class Demo07StringSplit {
    public static void main(String[] args) {
        String strA = "aaa,bbb,ccc";
        String[] splitString = strA.split(",");
        for (int i = 0; i < splitString.length; i++) {
            System.out.println(splitString[i]);
        }
        System.out.println("===============");

        String strB = "aaa bbb ccc";
        String[] splitString2 = strB.split(" ");
        for (int i = 0; i < splitString2.length; i++) {
            System.out.println(splitString2[i]);
        }
        System.out.println("===============");

        //split的参数其实是一个正则表达式，今天要注意如果按照英文句号切割，必须写\\.
        //英文.在正则表达式中有特殊含义
        String strC = "aaa.bbb.ccc";
        String[] split = strC.split(".");
        System.out.println(split.length);//0

    }
}
