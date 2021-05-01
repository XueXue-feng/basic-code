package cn.itcast.dayweb.demo.demo10collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
* java.util.Set接口 extends Collection
* 不允许存储重复的元素，没有索引，不能使用普通for循环
* java.util.HashSet implements Set<E>
特点：无序，不能存储重复元素，没有索引
* 底层是一个哈希表结构，查询快
* */
public class Demo03Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(3);
        set.add(2);
        set.add(5);
        set.add(3);
        //使用迭代器遍历集合
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());//3,2,5
        }
    }
}
