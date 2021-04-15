package cn.itcast.day04.demo05;

/*
* 定义一个类用来模拟学生事务，其中就有两个部分组成：
* 属性：（有什么）姓名，年龄
* 行为：（能做什么）吃饭，睡觉，学习
*
* 对应到java类中
* 属性-->成员变量：String name;int age;
* 行为-->成员方法 public void eat(){}
*
* 注意事项：
* 1.成员变量是直接定义在类之中，是在方法外类之中
* 2.成员方法不要写static
* */
public class Student {
    //成员变量，全局变量
    String name;
    int age;

    //成员方法没有Static
    public void eat(){
        System.out.println("吃饭！");
    }
    public void sleep(){
        System.out.println("睡觉觉！");
    }
    public void study(){
        System.out.println("学习");
    }
}
