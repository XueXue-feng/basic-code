package cn.itcast.dayweb.demo01.demo17WaitAndNotify.BaoZi;

public class Customer implements Runnable {
    //包子
    Resource resource;
    //Restaurant restaurant;

    @Override
    public void run() {
        staticRun();
    }

    public void staticRun() {

        synchronized (resource) {
            while (true) {
                if (Resource.baoZi == true) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("我是顾客我花了5秒吃包子");
                    /*restaurant.*/resource.notify();//通知包子铺老板做包子
                    Resource.baoZi = false;
                } else {
                    System.out.println("我是顾客没有包子了我要睡觉");
                    try {
                        resource.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("===========================");
                }
            }
        }
    }
}

