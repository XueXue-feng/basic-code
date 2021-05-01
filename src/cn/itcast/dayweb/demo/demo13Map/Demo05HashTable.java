package cn.itcast.dayweb.demo.demo13Map;

import java.util.HashMap;
import java.util.Hashtable;

/*
* java.util.HashTable<K,V> implements Map<E,V>
底层是一个线程安全的哈希表，速度慢,不能存储null K,V
* HashMap是一个多线程的集合，速度快，可以存储null,K,V之前的所有集合都存null
* 但是HashTable的子类Properties还活跃在历史的舞台上
* Properties是唯一一个与IO流结合在一起的集合
* */
public class Demo05HashTable {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put(null,"a");
        hashMap.put("2",null);
        hashMap.put("3",null);
        hashMap.put("4",null);
        hashMap.put(null,"e");
        System.out.println(hashMap);//允许存null,{null=e, 2=null, 3=null, 4=null}

        Hashtable<String,String> hashtable = new Hashtable<>();
        hashtable.put("null","1");//NullPointerException
        hashtable.put("null","2");
        hashtable.put("null",null);//NullPointerException
        System.out.println(hashtable);
    }
}
