package cn.itcast.dayweb.function.demo03Stream;

import java.util.function.Function;
import java.util.stream.Stream;

/*
java.util.stream Interface Stream<T>
* <R> Stream<R> map(Function<? super T,? extends R> mapper)
java.util.Function接口中抽象方法R apply(T t)将T类型的数据转换为R类型就称之为映射
 * */
public class Demo05StreamMap {
    public static void main(String[] args) {
        //获取一个string类型的流
        Stream<String> stringStream = Stream.of("1", "2", "3", "4");
        //把字符串类型的流映射为整数类型的流
        //使用匿名内部类
        /*stringStream.map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }).forEach((Integer in)->{
            System.out.println(in);
        });*/
        //使用Lambda表达式
        stringStream.map((String s)->{return Integer.parseInt(s);})
                .forEach((Integer in)->{
                    System.out.println(in);
                });
    }



}
