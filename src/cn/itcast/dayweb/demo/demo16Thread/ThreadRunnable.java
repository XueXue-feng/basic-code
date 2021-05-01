package cn.itcast.dayweb.demo.demo16Thread;

/*
* java.lang.Runnable
* 创建多线程程序的第二种实现方法：实现Runnable接口
* java.lang.Thread 构造方法 public void Thread(Runnable target){}
* public void Thread(Runnable target,String name){}
* 实现Runnable接口创建多线程程序的好处1.避免了单继承的局限性，一个类只能继承一个父类（一个人只能有一个人亲爹）
* 但是实现了Runnable接口还可以继承其他类实现其他接口
* 2.增强了程序的扩展性，降低了耦合性，实现了Runnable(解耦)把设置线程对象和开启新线程做了分离
*
* */
public class ThreadRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run" + i);
        }
    }
}
