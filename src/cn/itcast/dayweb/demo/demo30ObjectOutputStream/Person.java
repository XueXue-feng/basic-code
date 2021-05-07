package cn.itcast.dayweb.demo.demo30ObjectOutputStream;

import java.io.Serializable;

/*
* 序列化和反序列化,通过实现Serializable接口以启用其序列化功能，未实现该接口就禁止任何序列化或反序列化功能
* Serializable接口也叫做标记型接口
* 当我们序列化或者是反序列化某个类的时候就需要实现Serializable接口，相当于给类做了一个标记
* 当我们序列化或者是反序列化的时候就会检测这个标记，有就会进行序列化，没有则会抛出异常
*
* static静态关键字：静态优先于非静态加载到内存中(静态优先于对象加载到内存中)
* 被static修饰的成员不能被序列化，序列化的都是对象
* transient关键字：瞬态关键字被transient修饰的成员遍历不能被序列化，如果不想被序列化可以加transient关键字，但是又没有静态的含义
* */
public class Person implements Serializable {
    private static final long serialVersionUID = 42L;//自定义serialVersionUID 的版本号与每个可序列化类相关联
    private String name;
    //private int age;
    private transient int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}
