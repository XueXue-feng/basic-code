package cn.itcast.dayweb.function.demo03Stream;

import java.util.*;
import java.util.stream.Stream;

/*
* java.util.Stream.Interface Stream只能存储单列集合
* 获取流的方法：1.Collection集合可以用default Stream<E> Stream()方法
 * 2.使用Stream中的静态方法static <T> Stream<T> of(T... values)可变参数
 * */
public class Demo03Stream {
    public static void main(String[] args) {
        //方式1
        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(1);
        collection.add(2);
        collection.add(3);
        Stream<Integer> stream1 = collection.stream();
        stream1.forEach((integer)->{
            System.out.println(integer);
        });
        
        //把Set集合存储到Stream中
        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();
        
        //把Map集合间接存储到stream中
        Map<Integer,String> map = new HashMap<>();
        //把map集合的键存储到stream中
        Set<Integer> integers = map.keySet();
        Stream<Integer> stream3 = integers.stream();
        
        //把map集合中的值存储到stream中
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();
        
        //把map中的键值对的映射关系存储到stream中
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Stream<Map.Entry<Integer, String>> stream5 = entries.stream();

        //方式2
        String[] strings = {"我","是","胖","胖"};
        Stream<String> stringStream = Stream.of(strings);
        stringStream.forEach((str)->{
            System.out.println(str);
        });
    }
}
