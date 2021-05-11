package cn.itcast.dayweb.function.demo03Stream;

import java.util.stream.Stream;

/*
* 延迟方法：返回值类型仍然是Stream接口自身的方法，支持链式调用
* 终结方法：返回值类型不再是Stream接口自身的方法，终结方法count(),forEach();
* Stream中的常用方法void forEach(Consumer<T> con){}该方法接收一个Consumer接口把其中的流元素
* 交给函数处理，Consumer是一个消费性的函数式接口，可以传递一个Lambda表达式
* 简单记：forEach是一个终结方法用来遍历流中的元素
* */
public class Demo04StreamForEach {
    public static void main(String[] args) {
        //获取一个Stream流
        Stream<String> streamStr = Stream.of("张三", "李四", "王五", "赵六", "田七");
        /*streamStr.forEach((str)->{
            System.out.println(str);
        });*/
        //对Lambda表达式进行优化
        streamStr.forEach((str)-> System.out.println(str));
    }
}
