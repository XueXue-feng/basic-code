package cn.itcast.dayweb.demo.demo19Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* 使用数组存储Person对象，并对其排序
* */
public class Test2 {
    public static void main(String[] args) {
        List<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person("小米" ,10));
        arrayList.add(new Person("小米" ,79));
        arrayList.add(new Person("小米" ,70));

        /*Collections.sort(arrayList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 02 - 01;
            }
        });
        System.out.println(arrayList);*/
        Collections.sort(arrayList,(Person o1, Person o2)->{
            return 02 - 01;
        });
        //优化省略Lambda
        Collections.sort(arrayList,(o1, o2)-> 02 - 01);
        System.out.println(arrayList);
    }
}
