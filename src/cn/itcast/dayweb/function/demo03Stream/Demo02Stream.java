package cn.itcast.dayweb.function.demo03Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*
* 使用Stream的方式实现对集合的过滤
* Stream JDK1.8之后，关注的是做什么而不是怎么做
* */
public class Demo02Stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("周芷若");
        list.add("张三丰");
        list.add("张无忌");
        list.add("灭绝长老");
        list.add("张喵喵小可爱");

        //使用匿名内部类
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张");
            }
        }).filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() <= 3;
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //使用Lambda表达式
        list.stream().filter((name)->{return name.startsWith("张");})
                .filter((name)->{return name.length() <= 3;})
                .forEach((name)->{
                    System.out.println(name);
                });
    }
}
