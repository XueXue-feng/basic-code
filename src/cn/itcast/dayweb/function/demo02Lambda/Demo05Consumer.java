package cn.itcast.dayweb.function.demo02Lambda;

import java.util.function.Consumer;

/*
* java.util.function Interface Consumer<T>正好与Supplier相反他是一个消费性接口，
* 其数据类型由泛型决定，Consumer中有一个抽象方法void accept(T t);意为消费一个指定泛型数据

* Consumer是一个消费型接口，泛型指定什么类型就可以使用accept消费一个类型数据
* 怎么消费自定义
* */
public class Demo05Consumer {
    public static void method(String name,Consumer<String> con){
        con.accept(name);
    }

    public static void main(String[] args) {
       //使用匿名内部类的方法
        method("小米", new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("我是" + s);
            }
        });
        //使用Lambda表达式
        method("小红",(String s)->{
            //消费方式直接输出字符串
            System.out.println("我是" + s);
            //消费方式2对字符串进行反转
            System.out.println(new StringBuilder(s).reverse());
        });
    }
}
