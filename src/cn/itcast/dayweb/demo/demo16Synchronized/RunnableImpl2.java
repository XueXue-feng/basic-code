package cn.itcast.dayweb.demo.demo16Synchronized;

/*
* 解决同步的第二种方法:同步方法也会把访问共享数据的代码锁住，只让一个线程执行。
* 同步代码块的锁是:RunnableImpl2也就是this
* */
public class RunnableImpl2 implements Runnable{
    private static  int ticket = 100;
    //创建同步代码块对象
    Object obj = new Object();
    //设置线程任务卖票
    @Override
    public void run() {
        System.out.println(this);
        while(true){
             // payTicket();
            payTicketStatic();
        }
    }

    //同步方法
    public synchronized void payTicket(){
        if (ticket > 0) {
            System.out.println("正在卖第" + ticket + "张票");
            ticket--;
        }
    }

    //静态同步方法，锁对象是静态方法优先于对象，锁对象是本类的Class属性
    public static /*synchronized*/ void payTicketStatic(){
        synchronized (RunnableImpl2.class) {
            if (ticket > 0) {
                System.out.println("正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
