package cn.itcast.day.demo07;

/*
* static修饰成员变量
* 一旦成员变量使用static修饰，那么这个变量不再属于对象自己而是属于所在类
* 多个对象共享一份数据
* */
public class Demo08StaticField {
    public static void main(String[] args) {
        Student one = new Student("郭靖",18);
        one.room = "101教室";
        Student two = new Student("黄蓉",16);
        System.out.println("姓名" + one.getName());
        System.out.println("年龄是" + one.getAge());
        System.out.println("所在教室是" + one.room);
        System.out.println("学号是" + one.getId());
        System.out.println("年龄是" + one.getAge());
        System.out.println("姓名" + two.getName());
        System.out.println("所在教室是" + two.room);
        System.out.println("学号是" + two.getId());

    }
}
