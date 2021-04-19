package cn.itcast.day.demo10;

/*
*接口就是多个类的公共规范，接口是一种引用数据类型，最重要的内容就是其中的abstract
* public interface 接口名称{
* 接口内容}
* 备注换了关键字interface之后仍然编译为：.java-->.class
* java7：接口中包含的内容：常量，抽象方法
* java8：接口中包含的内容：常量，抽象方法，默认方法，静态方法
* java9:接口中包含的内容：常量，抽象方法，默认方法，静态方法,私有方法
* */
public class Demo01Interface {
    public static void main(String[] args) {
        MyInterfaceImplement myInterfaceImplement = new MyInterfaceImplement();
        myInterfaceImplement.methodAbs1();
        myInterfaceImplement.methodAbs2();
        myInterfaceImplement.methodAbs3();
        myInterfaceImplement.methodAbs4();

    }
}
