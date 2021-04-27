package cn.itcast.dayweb.demo01.demo13Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
* java.util.LinkedHashMap<K,V> extends HashMap<K,V>
LinkedHashMap由哈希表和链表实现，具有可预知的迭代顺序
* */
public class LinkedHashMapClass {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("1","a");
        hashMap.put("2","b");
        hashMap.put("3","c");
        hashMap.put("4","d");
        hashMap.put("5","e");
        System.out.println(hashMap);//k不允许重复，存取顺序不一定一致{1=a, 2=b, 3=c, 4=d, 5=e}

        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("1","a");
        linkedHashMap.put("2","b");
        linkedHashMap.put("3","c");
        linkedHashMap.put("4","d");
        linkedHashMap.put("1","y");
        System.out.println(linkedHashMap);//{1=y, 2=b, 3=c, 4=d}


    }
}
