package cn.itcast.dayweb.demo.demo16Synchronized;

public class Ticket2 {
    public static void main(String[] args) {
        RunnableImpl2 runnableImpl = new RunnableImpl2();
        System.out.println(runnableImpl);
            //设置多线程
            Thread thread1 = new Thread(runnableImpl);
            Thread thread2 = new Thread(runnableImpl);
            Thread thread3 = new Thread(runnableImpl);

            //开启多线程
            thread1.start();
            thread2.start();
            thread3.start();

    }
}
