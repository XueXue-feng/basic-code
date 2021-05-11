package cn.itcast.dayweb.function.demo03Stream;

import java.util.Arrays;
import java.util.stream.Stream;

/*
* limit方法用于截取流中的元素，limit方法可以对流进行截取，只截取前n个。
* 方法签名：Stream<T> limit(long maxSize)
* 参数是一个long类型，如何流中的元素大于截取参数则进行截取，否则不进行操作
* limit方法是一个延迟方法所以可以进行链式操作。
* */
public class Demo07StreamLimit {
    public static void main(String[] args) {
        //获取一个Stream流
        String[] array = {"灰太狼","懒洋洋","喜羊羊","美羊羊"};
        Stream.of(array);
        //使用limit方法进行截取
        Arrays.stream(array).limit(3L).forEach((String name)->{
            System.out.println(name);
        });
    }
}
