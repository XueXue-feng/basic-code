package cn.itcast.dayweb.demo.demo10collection;

import java.util.LinkedList;

/*
* java.util.LinkedList implements List
* 底层是一个链表结构，查询慢增删快，里面包含了大量操作首尾的方法。
*
* */
public class Demo02LinkedList {
    public static void main(String[] args) {
        //addMethod();
        //removeMethod();
        getMethod();
    }
    //addFirst(E e),addLast(E e);push(E e)往集合中添加元素
    public static void addMethod(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.addFirst(2);
        linkedList.addLast(3);
        linkedList.push(4);//[4, 2, 1, 3]
        System.out.println(linkedList);
    }

    //removeFirst(),removeLast(),pop()
    public static void removeMethod(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.addFirst(2);
        linkedList.addLast(3);
        linkedList.push(4);//[4, 2, 1, 3]

        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.pop();//[1]
        System.out.println(linkedList);

    }
    //getLast();getFirst()
    public static void getMethod(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.addFirst(2);
        linkedList.addLast(3);
        linkedList.push(4);//[4, 2, 1, 3]

        System.out.println(linkedList.get(2));//1
        System.out.println(linkedList.getFirst());//4
        System.out.println(linkedList.getLast());//3
    }
}
