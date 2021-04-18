package cn.itcast.day04.demo09;

/*
* 抽象的概念
* 抽象方法所在的类必须是抽象类,在class前面加abstract
* 如何使用：
* 1.不能直接创建抽象类对象，不能直接创建一只动物
* 2.必须用一个子类来继承抽象父类，
* 3.子类必须覆盖重写父类中的抽象方法，覆盖重写去掉父类中的abstract关键字然后补上大括号和方法体，也叫做实现
* 4.创建子类对象进行使用
* */
public abstract class Animal {
    //动物吃东西将eat定义为抽象方法，加上abstract关键字去掉大括号,大括号中的内容不确定
    public abstract void eat();
    public abstract void sleep();
    //这是普通的成员方法
    public void normalMethod(){
        System.out.println("这是普通的成员方法");
    }
    //抽象父类构造方法
    public Animal(){
        System.out.println("抽象父类构造方法执行了");
    }
}
