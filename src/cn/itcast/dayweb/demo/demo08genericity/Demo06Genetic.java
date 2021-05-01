package cn.itcast.dayweb.demo.demo08genericity;

import java.util.ArrayList;
import java.util.Collection;

/*
* 泛型的上限限定：? extends E代表使用的只能是E本身以及其子类.
* 泛型的下限限定：? super E代表使用的泛型只能是E类型的父类及本身
* */
public class Demo06Genetic {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("abd");collection.add("abd");
        collection.add("a");
        collection.add("c");
        //getElement1(collection);

        getElement2(collection);
    }

    //泛型的上限
    public static void getElement1 (Collection<? extends Object> collection){
        for(Object obj:collection){
            System.out.println(obj);
        }
    }
    //泛型的下限
    public static void getElement2(Collection<? super String> collection){
        for(Object obj:collection){
            System.out.println(obj);
        }
    }
}
