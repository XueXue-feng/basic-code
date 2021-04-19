package cn.itcast.day.demo07;

/*
* 静态代码块：
* 格式：public class 类名{
*       static{
*       静态代码块
*   }
* }
* 当第一次执行到本类的时候，静态代码快执行唯一的一次。
* */
public class Person {

    static{
        System.out.println("静态代码块执行了");
    }
    public Person(){
        System.out.println("构造方法执行了");
    }
}
