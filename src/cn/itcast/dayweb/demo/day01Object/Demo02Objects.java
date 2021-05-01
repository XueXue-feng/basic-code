package cn.itcast.dayweb.demo.day01Object;

import java.util.Objects;

public class Demo02Objects {
    public static void main(String[] args) {
        String str1 = "abs";
        String str2 = "abs";
        //String 重写了equals方法比较的是属性
        System.out.println(str1.equals(str2));//true

        //如果str1为null则会报空指针异常,Objects这个类的equals方法可以解决
        /*
        容忍空指针异常
        * public static boolean equals(Object a, Object b) {
            return (a == b) || (a != null && a.equals(b));
        }
        * */
        String str3 = null;
        System.out.println(Objects.equals(str3,str1));//false

    }
}
