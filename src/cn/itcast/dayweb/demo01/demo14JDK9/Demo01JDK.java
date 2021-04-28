package cn.itcast.dayweb.demo01.demo14JDK9;

import java.util.ArrayList;
import java.util.List;

/*
* JDK9+新特性
* list,set,map接口增加了一个静态方法of()可以给集合一次性添加多个元素
* 使用前提：当集合中存储元素的个数已经确定，不改变的时候使用
* 1.of方法只适用于list,set,map不适用于实现类接口
* 2.of的返回值是一个不能改变的集合，集合不能再使用add()put()方法
* 3.set和map不能有重复的元素
* */
public class Demo01JDK {
    public static void main(String[] args) {
        List<String> list = List.of("1","2","3","5");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
