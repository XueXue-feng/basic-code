package cn.itcast.dayweb.function.demo02Lambda;

import java.util.function.Consumer;

/*
* Consumer中的默认方法 andThen();
* 作用：需要两个Consumer接口，可以把两个Consumer接口组合成一个再进行消费
* con1.andThen(con2).accept(s)谁写前面谁先消费
* */
public class Demo06AndThen {
    public static void method(String str, Consumer<String> con1,Consumer<String> con2){
         con1.andThen(con2).accept(str);
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 ="World";
        //使用匿名内部类
        method(str1, new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("我是Consumer1" + s);
            }
        }, new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("我是Consumer2" + s);
            }
        });
        //使用Lambda表达式进行优化
        method(str2,(s)->{ System.out.println("我是Consumer1" + s);},
                (s)->{System.out.println("我是Consumer2" + s);});
    }
}
