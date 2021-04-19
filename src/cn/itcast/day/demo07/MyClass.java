package cn.itcast.day.demo07;

public class MyClass {

    String name;
    static int id;

    public void method(){
        System.out.println("这是一个普通的成员方法");
        //成员方法可以直接使用静态和非静态成员变量
        System.out.println(name);
        System.out.println(id);
    }
    public static void methodStatic(){
        System.out.println("这是一个静态方法");
        //静态方法只能访问静态成员变量
        System.out.println(id);
        //System.out.println(name);错误写法【重点】
    }
}
