package cn.itcast.dayweb.demo.demo05Package;

import java.util.ArrayList;

/*
* 从JDK1.5+开始可以实现自动拆箱与自动装箱处理
* */
public class Demo02AutoPackage {
    public static void main(String[] args) {
        //自动装箱：int-->Integer
        Integer integerNum1 = 190;
        //自动拆箱Integer-->int包装类无法直接参与运算
        int integerNum2 = integerNum1 + 1;
        System.out.println(integerNum2);//191

        //ArrayList<Integer>无法直接存储整数但是可以存储Integer包装类
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(123);//包含了自动装箱操作
        int num = arrayList.get(0);//包含了自动拆箱操作
        System.out.println(arrayList);//[123]
        System.out.println(num);
    }
}
