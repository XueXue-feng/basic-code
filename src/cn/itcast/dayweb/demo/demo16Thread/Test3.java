package cn.itcast.dayweb.demo.demo16Thread;

public class Test3 {
    public static void main(String[] args) {
        ThreadRunnable threadRunnable = new ThreadRunnable();
        //开启多线程
        new Thread(threadRunnable).start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main" + i);
        }
    }
}
