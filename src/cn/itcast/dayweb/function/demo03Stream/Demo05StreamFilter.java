package cn.itcast.dayweb.function.demo03Stream;

import java.util.stream.Stream;

/*
* Stream中的常用方法filter用于过滤流中的数据
* Stream<T> filter(Predicate<? super T> predicate)
* Predicate中有一个抽象方法test用于判断参数是否符合返回一个boolean值
* */
public class Demo05StreamFilter {
    public static void main(String[] args) {
        //创建一个Stream流
        Stream<String> streamStr = Stream.of("张三丰", "周芷若", "赵敏", "张无忌");
        //对Stream中的数据进行过滤
        /*streamStr.filter((String name)->{return name.startsWith("张");})
                .forEach((String name)->{
                    System.out.println(name);
                });*/
        //对Lambda表达式进行优化
        streamStr.filter((name)-> name.startsWith("张"))
                .forEach((name)->System.out.println(name));
        /*
        * Stream属于管道流，只能被消费(使用)一次，第一个Stream调用完方法之后数据聚会流向下一个Stream
        * 中，第一个stream就会关闭了不能再使用了。
        * */
        //遍历一下streamStr
        streamStr.forEach((String name)->{
            System.out.println(name);//stream has already been operated upon or closed
        });
    }
}
