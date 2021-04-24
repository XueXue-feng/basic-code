package cn.itcast.dayweb.demo01.day01Object;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
* Object类：java.lang.Object
* 类 Object 是类层次结构的根类。每个类都使用 Object 作为超类。所有对象（包括数组）都实现这个类的方法。
 * */
public class Demo01ToString {
    public static void main(String[] args) {
        /*
        * Person类默认继承了Object类，所以可以使用父类的toString()
        * toString()返回该对象的字符串表示
        * */
        Person person1 = new Person("迪丽热巴" ,19);
        Person person2 = new Person("古力娜扎",19);
        System.out.println(person1.toString());//cn.itcast.dayweb.demo01.day01Object.Person@75412c2f
        //直接打印该对象其实就是调用了toString()
        System.out.println(person1);//cn.itcast.dayweb.demo01.day01Object.Person@75412c2f

        //使用Object类的equals方法
        /*
        * public boolean equals(Object obj) {
                return (this == obj);
            }this哪个对象调用的谁就是this,所以person1是this
        * */
        System.out.println(person1.equals(person2));//false

        //看一个类是否重写了toString()方法，直接打印该类对应的地址值即可
        Random random = new Random();
        System.out.println(random);//java.util.Random@3f3afe78

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner);//java.util.Scanner[delimiters=\p{javaWhitespace

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(10);
        arrayList.add(100);
        System.out.println(arrayList);//[1, 10, 100]

    }
}
