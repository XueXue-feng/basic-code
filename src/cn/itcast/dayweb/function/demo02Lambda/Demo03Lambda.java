package cn.itcast.dayweb.function.demo02Lambda;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
* Lambda表达式作为方法的返回值，当需要一个方法来获取java.io.Comparator接口类型的对象作为排序器时，
* 就可以调用该方法
*
* */
public class Demo03Lambda {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("qwerty");
        arrayList.add("erghjmqw");
        arrayList.sort(getComparator());
        System.out.println(arrayList);

    }

    public static Comparator<String> getComparator(){

       /* //使用匿名内部类
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        };*/
        //使用Lambda表达式
        return (String o2,String o1)->{
            return o1.length() - o2.length();
        };
    }
}
