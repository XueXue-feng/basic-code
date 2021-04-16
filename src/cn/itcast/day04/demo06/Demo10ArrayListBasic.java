package cn.itcast.day04.demo06;

import java.util.ArrayList;

/*
* 集合的泛型只能是引用数据类型，不能是基本数据类型
* 如果希望在集合中使用基本数据类型，必须使用基本数据类型所对于的包装类
* 包装类都位于java.lang包下
* 整形：byte(Byte),short(Short),int(Integer),long(Long)
* 浮点型：double(Double),float(Float)
* 布尔型：boolean(Boolean)
* 字符型：char(Character)
*
* 从JDK1.5开始支持自动装箱(基本类型-->包装类型)，自动拆箱(包装类型-->基本类型)
*
* */
public class Demo10ArrayListBasic {
    public static void main(String[] args) {
        //泛型是String数据类型
        ArrayList<String> listA = new ArrayList<>();

        //包装类
        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(1);
        listB.add(100);
        listB.add(156);
        System.out.println(listB);
        //用基本数据类型接收
        int num = listB.get(1);
        System.out.println("索引值为1的元素是" + num);//100


    }

}
