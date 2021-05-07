package cn.itcast.dayweb.function.demo02Lambda;

/*
* lava.lang.Runnable.假设有一个startThread方法使用该接口作为参数，那么就可以使用Lambda作为参数，
* */
public class Practise {
    public static void main(String[] args) {
        //使用匿名内部类
        startThread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        //使用Lambda表达式
        startThread(()->{
            System.out.println(Thread.currentThread().getName());
        });
    }
    public static void startThread(Runnable runnable){
        //开启多线程
        new Thread(runnable).start();
    }
}
