package cn.itcast.dayweb.demo01.demo07Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
*java.util.Iterator接口，可以对集合进行遍历
* 常用方法:hasNext():判断集合中有没有下一个元素
* next();取出下一个元素
* 使用步骤：1.使用Collection中的iterator()来获取Iterator的实现类对象
* 2.使用Iterator的hasNext方法来判断有没有下一个元素
* 3.使用Iterator的next()方法来取出集合中的下一个元素
* Iterator<E>也是有泛型的但是他的泛型跟着集合走
* */
public class Demo01Iterator {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("柯南");
        collection.add("小兰");
        collection.add("毛利小五郎");
        collection.add("灰原哀");
        collection.add("工藤新一");
        Iterator<String> iterator = collection.iterator();
        String str = "";
        while(iterator.hasNext()){
            str = str +iterator.next();
        }
        System.out.println(str);
        System.out.println("===================");
        for(Iterator<String> iterator2 = collection.iterator();iterator2.hasNext();){
            String str2 = iterator2.next();//1.把指针向后移动一位，初始指向的是-1 2.取出下一个元素
            System.out.println(str2);
        }
    }
}
