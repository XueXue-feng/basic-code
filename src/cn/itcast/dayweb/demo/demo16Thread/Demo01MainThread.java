package cn.itcast.dayweb.demo.demo16Thread;

/*
* 主线程：执行主方法的线程main单线程程序，java程序中只有一个线程，线程从main方法开始从上到下依次执行
* JVM首先会执行main方法，main方法会进入到栈内存中，JVM会找操作系统开辟一条main方法通往CPU的通道
* CPU就可以通过这个通道来执行main方法，而这个路径叫做主线程
* */
public class Demo01MainThread {
    public static void main(String[] args) {
        //单线程程序
        Person one = new Person("小强");
        one.run();
        System.out.println(0/0);//ArithmeticException: / by zero单线程的弊端
        Person two = new Person("旺财");
        two.run();
    }
}
