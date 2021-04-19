package cn.itcast.day.demo06;

/*
* 当方法的参数局部变量和类的成员变量重名的时候，会根据“就近原则”，优先使用方法的局部变量
* 需要使用类的成员变量的时候，需要使用格式：this.成员变量名
*
* 通过谁调用的方法，谁就是this
* this在方法的内部
* */
public class Person {
    String name;

    //参数是对方的名字，成员变量是我自己的名字
    public void sayHello(String name){
        System.out.println(name + "你好，我是：" + this.name);
        System.out.println(this);//@75412c2f
    }

    public void showName(){
        System.out.println("我叫" + name);
    }
}
