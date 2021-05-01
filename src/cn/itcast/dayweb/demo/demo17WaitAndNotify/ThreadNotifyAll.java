package cn.itcast.dayweb.demo.demo17WaitAndNotify;

/*
* wait(long m):在毫秒值结束之后如果没有被notify()唤醒就会自动醒来 notifyAll()唤醒所有等待的线程
* */
public class ThreadNotifyAll {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(new Runnable(){
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        //告知老板需要包子的种类和数量
                        System.out.println("顾客1告知老板需要包子的种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        ;
                        System.out.println("顾客1开吃");
                    }
                }
            }
        }).start();//顾客1

        new Thread(){
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        //顾客2告知需要包子的种类和数量
                        System.out.println("顾客2告知需要包子的种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("顾客2开吃");
                    }
                }
            }
        }.start();//顾客2

        new Thread(new Runnable(){
            @Override
            public void run() {
                while (true) {
                    try {
                        //System.out.println("知道了等待5秒即可");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println("包子做好了");
                        obj.notifyAll();
                    }
                }
            }
        }).start();
    }
}
