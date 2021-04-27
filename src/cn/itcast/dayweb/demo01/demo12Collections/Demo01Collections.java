package cn.itcast.dayweb.demo01.demo12Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        //往集合中传递多个元素可以用Collections工具类
        Collections.addAll(arrayList,"a","b","c","b");
        System.out.println(arrayList);//[a, b, c, b]

        //使用指定的随机源对指定列表进行置换。
        Collections.shuffle(arrayList,new Random());
        System.out.println(arrayList);//[c, b, b, a]

        //sort()方法按照字母的ASCII表进行排序注意事项；被排序的几个必须实现Comparable接口重写CompareTo()
        //排序规则：this-参数 就是升序 反之就是降序
        Collections.sort(arrayList);
        System.out.println(arrayList);//[a, b, b, c]
        ArrayList<Person> arrayListPerson = new ArrayList<>();
        arrayListPerson.add(new Person("迪丽热巴" ,19));
        arrayListPerson.add(new Person("古力娜扎" ,20));
        arrayListPerson.add(new Person("马尔扎哈" ,19));
        System.out.println(arrayListPerson);
        Collections.sort(arrayListPerson);
        System.out.println(arrayListPerson);
    }
}
