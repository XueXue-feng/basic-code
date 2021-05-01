package cn.itcast.dayweb.demo.demo16Thread;

/*
* 创建多线程方式1：创建Thread的子类 2.子类方法中重写Thread的run方法设置线程任务
* 3.创建子类对象并调用start()开启新的线程执行run方法
* */
public class Demo02Thread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run" + i);
        }
    }
}
