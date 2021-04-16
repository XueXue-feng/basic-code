package cn.itcast.day04.demo06;

/*
* ArrayList 常用的方法
*
* public boolean add(E e):向集合中添加元素，E的数据类型和泛型的数据类型一样
* PS:对于arrayList list集合来说添加动作一定是成功的，但是对于其他集合来说不一定成功
* public E get(int index):从集合中获取元素，参数是索引编号，返回值就是对应位置的元素
* public E remove(int index):删除元素，参数是索引编号
* public int size(),
* */

import java.util.ArrayList;

public class Demo09ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList);

        //向集合中添加元素
        arrayList.add("我");
        arrayList.add("爱");
        arrayList.add("中");
        arrayList.add("国");
        arrayList.add("你爱吗");
        System.out.println(arrayList);

        //获取指定编号的内容
        System.out.println(arrayList.get(4));

        //删除指定索引中的内容
        System.out.println(arrayList.remove(4));
        System.out.println(arrayList);

        //size方法返回集合的容量
        System.out.println(arrayList.size());

        //返回第一次出现该内容的索引编号，如果不含则返回-1
        System.out.println(arrayList.indexOf("你"));

        //遍历集合
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
