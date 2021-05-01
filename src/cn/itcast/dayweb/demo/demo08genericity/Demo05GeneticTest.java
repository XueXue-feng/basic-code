package cn.itcast.dayweb.demo.demo08genericity;

import java.util.ArrayList;

/*
* 通配符?不能创建对象使用只能作为方法的参数使用
* */
public class Demo05GeneticTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(10);
        arrayList1.add(2);
        arrayList1.add(14);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("a");
        arrayList2.add("ab");
        arrayList2.add("ac");
        arrayList2.add("ar");
        printArray(arrayList2);

    }
    //定义一个方法可以遍历任意类型的数组
    public static void printArray(ArrayList<?> arrayList){
        for(Object obj:arrayList){
            System.out.println(obj);
        }
    }

}
