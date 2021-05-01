package cn.itcast.dayweb.demo.demo16Thread;

/*
* public static void sleep(long millis){}是当前正在执行的线程暂停指定的毫秒数
* */
public class Demo03ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        //模拟秒钟
        for (int i = 1; i <= 60; i++) {
            Thread.sleep(1000);
            System.out.println(i);
        }
    }
}
