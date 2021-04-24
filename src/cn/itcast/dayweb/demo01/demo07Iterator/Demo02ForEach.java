package cn.itcast.dayweb.demo01.demo07Iterator;

import java.util.ArrayList;
import java.util.Collection;

/*
* 增强for循环：从JDK1.5+开始，底层使用的也是iterator，使用for循环的合适简化了迭代器的书写
* 专门用来遍历数组和集合
* 格式：for(数组或集合的数据类型 变量名:集合名/数组名){sout(变量名)}
*
* */
public class Demo02ForEach {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("柯南");
        collection.add("小兰");
        collection.add("毛利小五郎");
        collection.add("灰原哀");
        collection.add("工藤新一");
        for(String str:collection){
            System.out.println(str);
        }
    }
}
