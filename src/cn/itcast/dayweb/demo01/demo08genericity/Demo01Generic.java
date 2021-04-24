package cn.itcast.dayweb.demo01.demo08genericity;

import java.util.ArrayList;
import java.util.Iterator;

/*
*泛型：是一种未知的数据类型，当我们不知道使用什么数据类型的时候可以使用泛型
* 泛型也可以看成是一个变量用来接收数据类型E e Element元素 T t Type类型
* ArrayList不知道存储什么数据类型的时候聚可以使用泛型
* 创建集合对象的时候就会确定集合类型，会把数据类型作为参数传递给E
* */
public class Demo01Generic {
    public static void main(String[] args) {
        //noUseGeneric();
        useGeneric();
    }

    //创建对象使用泛型 好处：1.避免了类型转换异常，存储的什么类型取出来的就是什么类型 2.把运行异常提升为了编译期的异常
    private static void useGeneric() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("15");
        arrayList.add("Hello");
        System.out.println(arrayList);//[15, Hello]
    }

    //不使用泛型 好处：默认的类型就是Object类型 弊端：这个集合就不安全了
    private static void noUseGeneric() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(19);
        arrayList.add("Hello");
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
