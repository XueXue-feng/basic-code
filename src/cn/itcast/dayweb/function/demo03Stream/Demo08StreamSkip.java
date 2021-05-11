package cn.itcast.dayweb.function.demo03Stream;

import java.util.stream.Stream;

/*
* skip方法用于跳过元素。如果希望跳过前几个元素，可以使用skip方法跳过前几个元素组成一个新的流
* Stream<T> skip(long n)如果流中的元素大于n则截取前n个元素，如果流中的元素小于n则返回一个长度为0的空流
* */
public class Demo08StreamSkip {
    public static void main(String[] args) {
        //获取一个流
        String[] array = new String[]{"喜羊羊","美羊羊","懒洋洋","灰太狼","红太狼"};
        Stream<String> array1 = Stream.of(array);

        //使用skip方法获得狼
        array1.skip(3L).forEach((String name)->{
            System.out.println(name);
        });
    }
}
