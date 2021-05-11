package cn.itcast.dayweb.function.demo03Stream;

import java.util.ArrayList;
import java.util.List;

/*
* 用传统的方式对集合进行遍历，找出”张“姓氏的并且名字长度小于3的人，
* */
public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("周芷若");
        list.add("张三丰");
        list.add("张无忌");
        list.add("灭绝长老");
        list.add("张喵喵小可爱");

        //对集合进行过滤
        List<String> listNew = new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("张") && s.length() <= 3){
                listNew.add(s);
            }
        }
        System.out.println(listNew);
    }
}
