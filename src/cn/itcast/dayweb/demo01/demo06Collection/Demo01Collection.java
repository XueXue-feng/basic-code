package cn.itcast.dayweb.demo01.demo06Collection;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;

/*
*java.util.Collection:是所有单列集合最顶层的方法，里面定义了所有单列集合的共有方法
* add(E e),clear(),isEmpty(),size(),remove(Object o),contains(Object o)
* */
public class Demo01Collection {
    public static void main(String[] args) {
        //addCollection();
        //clearCollection();
        //containCollection();
        toArrayCollection();
    }

    //add()方法
    public static void addCollection(){
        Collection<String> collection = new ArrayList<>();
        System.out.println(collection);//重写了toString()方法
        collection.add("Hello");
        collection.add("World");
        System.out.println(collection);
    }
    //clear()
    public static void clearCollection(){
        Collection<String> collection = new ArrayList<>();
        collection.add("Hello");
        collection.add("World");
        System.out.println(collection);//重写了toString()方法
        collection.clear();
        System.out.println(collection);
    }
    //contain()
    public static void containCollection(){
        Collection<String> collection = new ArrayList<>();
        collection.add("Hello");
        collection.add("World");
        System.out.println(collection.contains("Hello"));
    }
    //toArray()
    public static void toArrayCollection(){
        Collection<String> collection = new ArrayList<>();
        collection.add("Hello");
        collection.add("World");
        Object[] obj = collection.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
    }
}
