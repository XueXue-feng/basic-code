package cn.itcast.dayweb.demo.demo16Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
* 实现卖票案例的第三种方式：Lock()锁
* java.util.concurrent.lock.Lock接口
* Lock()获取锁;UnLock()释放锁
* 属于步骤：   java.util.concurrent.locks.ReentrantLock implements Lock()
* 1.在成员位置创建ReentrantLock对象
* 2.在可能出现线程安全的代码前使用lock()获取锁
* 3.在可能出现线程安全的代码后使用unLock()释放锁

 * */
public class RunnableImpl implements Runnable{
    private int ticket = 100;

    Lock lock = new ReentrantLock();
    //设置线程任务卖票
    @Override
    public void run() {
        while(true){
            try {
                lock.lock();
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                    ticket--;
                }
            }finally {
                lock.unlock();//无论程序异常与否都释放掉锁
            }
        }

    }
}
