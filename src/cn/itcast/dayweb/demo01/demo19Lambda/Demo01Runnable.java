package cn.itcast.dayweb.demo01.demo19Lambda;

public class Demo01Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "我是run方法");
            }
        });
        //开启多线程
        thread.start();
    }
}
