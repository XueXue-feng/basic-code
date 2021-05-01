package cn.itcast.dayweb.demo.demo18ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
* 从JDK1.5+之后，线程的工厂类：java.util.concurrent.Executors 用来生产线程池
* 返回值是：java.util.concurrent 接口 ExecutorService,submit(Callable<T> task) 提交一个返回值的任务用于执行，
* 使用步骤：1.使用线程池的工厂类生产一个指定线程数量的线程池
* 2.实现Runnable设置线程任务
* 3.调用ExecutorService的submit
* //调用shutdown()销毁线程池
* */
public class Demo01ThreadPool {
    public static void main(String[] args) {
        //获取线程池
        ExecutorService es = Executors.newFixedThreadPool(2);
        //线程池会一直开启着，使用玩了线程，会把线程归还给线程池继续使用
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());

        //关闭线程池不建议使用
        es.shutdown();
    }


}
