package cn.itcast.dayweb.demo01.demo10collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
* java.util LinkedHashSet extends HashSet<E>
* LinkedHashSet特点：底层是由数组 + 链表 + 链表 或者是 数组 + 红黑树 + 链表组成的
* 多了一条链表用来记录元素的存储顺序
* */
public class Demo07LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add("abs");
        hashSet.add("abd");
        hashSet.add("abv");
        hashSet.add("abf");
        for(String str:hashSet){
            System.out.println(str);
        }
    }
}
