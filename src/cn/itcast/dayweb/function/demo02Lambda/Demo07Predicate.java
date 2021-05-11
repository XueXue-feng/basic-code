package cn.itcast.dayweb.function.demo02Lambda;

import java.util.function.Predicate;

/*
* java.util.function Interface Predicate<T>作用：对某种数据类型的数据进行判断结果进行判断boolean
* 符合条件返回true
* */
public class Demo07Predicate {
    public static boolean judgeString(String str, Predicate<String> pre){
        return pre.test(str);
    }

    public static void main(String[] args) {
        boolean check = judgeString("Hello World", new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if(s.length() >= 5){
                    return false;
                }
                return true;
            }
        });
        System.out.println(check);
    }
}
