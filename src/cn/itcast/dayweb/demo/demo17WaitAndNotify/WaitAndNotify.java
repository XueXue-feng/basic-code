package cn.itcast.dayweb.demo.demo17WaitAndNotify;

/*
* 等待唤醒案例:线程之间的通信
* 创建一个顾客线程（消费者）：告知老板需要包子的种类和数量，调用wait方法放弃CPU的需求，进入Waiting状态
* 创建一个老板线程（生产者）：花了5秒做包子，昨晚包子之后调用notify()方法唤醒顾客吃包子
* 注意事项：1,。顾客和老板线程必须使用同步代码块包裹起来，保证等待和唤醒只有一个在执行，同步使用的锁对象是唯一的，
* 只有锁对象才能调用wait()和notify()方法，Object中的wait()和notify()，notify()执行完毕之后执行wait()之后的代码
*
*
* */
public class WaitAndNotify {
    public static void main(String[] args) {
        //创建唯一的锁对象
        Object obj = new Object();

        //创建两个线程
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println("我要5个肉包子");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("包子真好吃");
                }
            }
        };//顾客
        thread1.start();
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println("我已经做好包子了");
                        obj.notify();
                    }
                }
            }
        };//包子店老板
        thread2.start();

    }
}
