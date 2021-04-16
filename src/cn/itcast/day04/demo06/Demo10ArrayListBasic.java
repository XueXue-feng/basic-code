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
* */
public class Demo10ArrayListBasic {
    public static void main(String[] args) {
        //泛型是String数据类型
        ArrayList<String> listA = new ArrayList<>();

        ArrayList<Integer> listB = new ArrayList<>();

    }

}
