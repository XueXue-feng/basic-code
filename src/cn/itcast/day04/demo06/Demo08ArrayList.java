package cn.itcast.day04.demo06;

import java.util.ArrayList;

/*
* 集合和数组的区别：数组的长度不可发生改变，Arraylist可以随意变化
* 对于Arraylist<E>尖括号表示泛型
* 泛型：也就是装在集合当中的所有元素，全都是统一的什么类型。
* 注意：泛型只能是引用数据类型不能是基本数据类型
* */
public class Demo08ArrayList {
    public static void main(String[] args) {
        //表示创建了一个ArrayList集合，集合的名称是arraylist,里面装的都是String类型的数据
        //从JDK1.7+开始右侧的尖括号内部的数据类型可以不写，但是尖括号本身还是要写的
        ArrayList<String> arrayList = new ArrayList<String>();
        //对于arraylist直接打印的是内容，不是地址值
        System.out.println(arrayList);

        //向集合中添加数据，打印的时候用逗号空格的形式分来
        arrayList.add("赵丽颖");
        arrayList.add("迪丽热巴");
        arrayList.add("古力娜扎");
        arrayList.add("马儿扎哈");
        System.out.println(arrayList);

    }
}
