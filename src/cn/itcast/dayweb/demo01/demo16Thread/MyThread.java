package cn.itcast.dayweb.demo01.demo16Thread;

/*
* 返回该线程的名称1.getName();2.获取到当前正在执行的线程，使用线程中的方法获取线程的名称getName();
* public static currentThread()
* */
public class MyThread extends Thread{
    @Override
    public void run() {
        //打印线程的名称
        System.out.println(getName());

        //先获取到当前线程再获取其名字
        Thread th = MyThread.currentThread();
        System.out.println(th);//Thread[Thread-1,5,main]
        System.out.println(th.getName());//Thread-1

    }
}
