package cn.itcast.day.demo05;

/*
* 通常情况下一个类并不能直接使用，需要创建一个对象来使用
* 使用步骤：导包，也就是指出需要使用的类在什么位置 import 包名称.类名称import  cn.itcast.day04.demo05.Student
* 对于和当前类属于同一个包的情况下，可以省略导包语句
* 创建，格式：类名称 对象名 = new 类名称(); Student student = new Student();
* 使用,分为两种情况，
* 如何使用成员变量：对象名.成员变量名
* 如何使用成员方法：对象名.成员方法名();
* 对象名.变量名或者方法名
*
* 注意事项：
* 1.那么成员变量没有赋值那么就有一个默认值，和变量一样
* */
public class Demo02Student {
    public static void main(String[] args) {
        //根据Student创建了一个student对象
        Student student = new Student();
        System.out.println(student.name);

        //改变成员变量的值
        student.name = "赵丽颖";
        System.out.println(student.name);

        //使用类的成员方法
        student.eat();
        student.sleep();
        student.study();
    }


}
