package cn.itcast.dayweb.demo.demo18ThreadPool;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "创建了一个新线程");
    }
}
