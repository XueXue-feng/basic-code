package cn.itcast.dayweb.demo01.demo10collection;

import java.util.HashSet;

/*
* Set集合不能存储相同元素的原理：set集合在调用add方法的时候会调用equals()和hashCode()方法判断元素是否重复
* */
public class Demo05HashSetSaveString {
    public static void main(String[] args) {
        //创建hashset集合
        HashSet<String> hashSet = new HashSet<>();
        String str1 = new String("asd");
        String str2 = new String("asd");
        hashSet.add(str1);
        hashSet.add(str2);
        hashSet.add("重地");
        hashSet.add("通话");
        hashSet.add("asd");
        System.out.println(hashSet);//[重地, 通话, asd]
    }
}
