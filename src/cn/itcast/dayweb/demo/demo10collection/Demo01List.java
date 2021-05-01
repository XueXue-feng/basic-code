package cn.itcast.dayweb.demo.demo10collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* java.util.List接口 extends Collection
* list接口的特点：1.存取有序 2.可以存放重复的元素 3.有索引
* list中特有的有索引的方法：add(int index,E e),get(int index),set(int index,E e),remove(int index)
* 注意：操作索引的时候从0开始
* */
public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //添加
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        System.out.println(list);//[a, b, c, a]重写了toString()

        //替换
        list.set(2,"v");
        System.out.println(list);//[a, b, v, a]

        //移除
        list.remove(0);
        System.out.println(list);//[b, v, a]

        //List遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("==================");
        for(String str:list){
            System.out.println(str);
        }
        System.out.println("==================");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
