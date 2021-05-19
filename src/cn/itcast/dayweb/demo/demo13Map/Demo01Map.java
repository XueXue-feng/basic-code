package cn.itcast.dayweb.demo.demo13Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* java.util.Map<K,V>集合特点：1.是一个双列几个，一个元素包含两个元素，K键，V值
* 2.Key和Value中的数据类型可以相同也可以不同
* 3.Map中的K不重复V可以重复
* 4.K与V一一对应
* java.util.HashMap<K,V>特点：1.hashmap底层是哈希表，查询速度快，JDK1.7之前是数组+链表
* JDK1.8+是数组+单向链表或者是数组+红黑树（链表的长度>=8）
* 2.是一个无序集合
* java.util.LinkedHashMap<K,V> extends HshMap<K,V>1.是一个有序的集合
* 2.底层是哈希表+链表的结构
* */
public class Demo01Map {
    public static void main(String[] args) {
        //Map对象
        Map<Integer,String> map = new HashMap<>();
        //put(K key,V value)方法向map中添加数据,如果K唯一则返回Null,如果K不唯一则返回倍替代的值。
        map.put(1,"迪丽热巴");
        map.put(2,"古力娜扎");
        map.put(3,"马尔扎哈");
        map.put(4,"杨幂");
        System.out.println(map);//{1=迪丽热巴, 2=古力娜扎, 3=马尔扎哈, 4=杨幂}重写了toString()

        //get(K key)
        System.out.println(map.get(4));

        //remove()方法
        System.out.println(map.remove(3));
        System.out.println(map.get(3));//null

        //containKey()
        System.out.println(map.containsKey(2));//true

        //遍历map
        Set<Integer> set = map.keySet();
        for (Integer integer : set) {
            System.out.println(map.get(integer));
        }

    }
}
