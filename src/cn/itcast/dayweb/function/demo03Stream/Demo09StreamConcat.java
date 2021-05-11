package cn.itcast.dayweb.function.demo03Stream;

import java.util.stream.Stream;

/*
* concat方法用于把流组成在一起，如果有两个流希望并成为一个流，那么可以使用Stream中的静态方法concat
* static <T> Stream<T> concat(Stream<? extends T> a,Stream<? extends T> b)
*
* */
public class Demo09StreamConcat {
    public static void main(String[] args) {
        String[] array = new String[]{"喜羊羊","美羊羊","懒洋洋","灰太狼","红太狼"};
        Stream<String> stream1 = Stream.of(array);
        Stream<String> stream2 = Stream.of("张三", "李四", "王五", "赵六", "田七");

        //使用Stream中的静态方法concat把两个流组成一个新的流
        Stream.concat(stream1,stream2).forEach( name-> System.out.println(name));
    }
}
