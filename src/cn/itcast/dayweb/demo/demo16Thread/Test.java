package cn.itcast.dayweb.demo.demo16Thread;

/*
* java属于抢占式调度，那个线程优先级高则优先执行那个程序，如果优先级相同则随机执行一个线程
* */
public class Test {
    public static void main(String[] args) {
        Demo02Thread myThread = new Demo02Thread();
        //调用Demo02Thread中的start方法，开启新的线程执行run方法
        //myThread.start();

        /*for (int i = 0; i < 20; i++) {
            System.out.println("main" + i);
        }*/

        MyThread myThread1 = new MyThread();
        myThread1.start();//Thread-2

        System.out.println(new MyThread().getName());//Thread-3

        System.out.println(MyThread.currentThread().getName());//main获取主线程的名称
    }
}
