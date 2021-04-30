package cn.itcast.dayweb.demo01.demo16Synchronized;

public class RunnableImpl implements Runnable{
    private int ticket = 100;
    //创建同步代码块对象
    Object obj = new Object();
    //设置线程任务卖票
    @Override
    public void run() {
        while(true){
            synchronized (obj) {
                if (ticket > 0) {
                    System.out.println("正在卖第" + ticket + "张票");
                    ticket--;
                }
            }
        }

    }
}
