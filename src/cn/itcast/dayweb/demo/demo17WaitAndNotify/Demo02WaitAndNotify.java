package cn.itcast.dayweb.demo.demo17WaitAndNotify;

/*
* 进入TimeWaiting(计时等待)状态：1.sleep(long m):在毫秒值结束之后，线程睡醒进入到Runnable/Blocked状态
* 2.wait(long m):在毫秒值结束之后如果没有被notify()唤醒就会自动醒来 notifyAll()唤醒所有等待的线程
* */
public class Demo02WaitAndNotify {
    public static void main(String[] args) {
        try {
            Thread.sleep(5000);
            System.out.println("我是sleep" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Object obj = new Object();
        try {
            synchronized (obj) {
                obj.wait(5000);
            }
            System.out.println("我是obj" + Thread.activeCount() + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
