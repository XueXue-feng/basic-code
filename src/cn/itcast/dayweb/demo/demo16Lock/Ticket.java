package cn.itcast.dayweb.demo.demo16Lock;


/*
* 线程安全问题是不应该产生的，我们可以让一个线程在访问共享数据的时候无论是否失去了CPU的执行权
* ，让其他线程只能等待，
* 等待当前线程卖完票，其他线程再进行卖票
* 保证始终一个线程再卖票
*
* 解决线程安全的第一种方式：
* synchronized(锁对象){可能出现线程安全的代码(访问了共享数据的代码)}
* 注意：1.锁对象可以是任意对象 2,必须保证多个线程使用的锁对象是同一个人，
* 锁对象的作用：把同步代码块锁住始终只让一个线程在卖票
* */
public class Ticket {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        //开启多线程
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();


    }
}
