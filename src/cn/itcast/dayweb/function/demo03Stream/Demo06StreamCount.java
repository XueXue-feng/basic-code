package cn.itcast.dayweb.function.demo03Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
* count方法用于统计流中元素的个数long count，count方法是一个终结方法，所以不能再调用Stream中的其他方法
* */
public class Demo06StreamCount {
    public static void main(String[] args) {
        //创建一个流
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");

        //创建一个流
        Stream<String> stream = list.stream();
        long count = stream.count();
        System.out.println(count);//5

    }
}
