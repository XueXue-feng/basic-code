package cn.itcast.dayweb.demo.demo13Map;

import java.util.HashMap;
import java.util.Map;

/*
* Map集合的遍历：1.通过键找值的方式遍历map几个中的方法keySet()
* */
public class Demo02KeySet {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        //put(K key,V value)方法向map中添加数据,如果K唯一则返回Null,如果K不唯一则返回倍替代的值。
        map.put(1,"迪丽热巴");
        map.put(2,"古力娜扎");
        map.put(3,"马尔扎哈");
        map.put(4,"杨幂");

        //1.通过键找值的方式遍历map
        for(Integer integer: map.keySet()){
            System.out.println(map.get(integer));
        }

    }
}
