package cn.itcast.dayweb.demo.demo13Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
* Map.Entry<K,V>在map接口中有一个内部接口Entry
* 作用：当Map集合一创建，那么就会在map集合中创建一个Entry对象用来记录键与值（键值对对向，键值映射关系）---->结婚证
* entrySet把集合中多个entry对象取出来存储到一个set集合中set<Map.Entry<K,V>>
* */
public class Demo03MapEntry {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        //put(K key,V value)方法向map中添加数据,如果K唯一则返回Null,如果K不唯一则返回倍替代的值。
        map.put(1,"迪丽热巴");
        map.put(2,"古力娜扎");
        map.put(3,"马尔扎哈");

        //2,通过entrySet()方法遍历getKey(),getValue()
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String> entry = iterator.next();
            Integer integer = entry.getKey();
            String str = entry.getValue();
            System.out.println(integer + str);
        }
        System.out.println("====================");

        for(Map.Entry<Integer,String> entry: set){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
