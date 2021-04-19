package cn.itcast.day.demo07;

/*
* 静态内容总是先于非静态的，静态代码块先于构造方法
* 用途：
* 一次性的对静态变量进行赋值
* */
public class PersonStatic {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();
    }
}
