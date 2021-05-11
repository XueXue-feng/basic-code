package cn.itcast.dayweb.reflect;

import cn.itcast.dayweb.reflect.deman.Person;

/*
* 获取Class对象的方式：1.Class.forName("全类名");把类加载到内存中，源代码阶段
* 第一种方式多用于配置文件中，将类名定义在配置文件中，读取文件加载类
    2.Class字节码阶段类名.class：通过类的属性class来获取
    * 第二中多用于参数的传递
    3.Runtime阶段：通过对象.getClass()方法来获取getClass()方法在Object类型所以对象都可以使用
    * 第三种对象获取字节码文件
* */
public class Demo01Reflect {
    public static void main(String[] args) {
        //Class.forName("全类名");把类加载到内存中，源代码阶段
        try {
            Class cls1 = Class.forName("cn.itcast.dayweb.reflect.deman.Person");
            System.out.println(cls1);//class cn.itcast.dayweb.reflect.deman.Person

        System.out.println("=======================");
        //Class字节码阶段类名.class：通过类的属性class来获取
        Class<Person> cls2 = Person.class;
        System.out.println(cls2);

        System.out.println("=======================");
        //Runtime阶段：通过对象.getClass()方法来获取getClass()方法在Object类型所以对象都可以使用
        Person person = new Person();
        Class cls3 = person.getClass();
        System.out.println(cls3);

        /*
        * 结论：同一个字节码.class文件在程序运行中只会被加载一次，无论是通过哪一种方法获取的class对象都是同一个
        * */
        //比较这三个Class对象是否是同一个对象
        System.out.println(cls1 == cls2);//true
        System.out.println(cls1 == cls3);//true
        System.out.println(cls3 == cls2);//true


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
