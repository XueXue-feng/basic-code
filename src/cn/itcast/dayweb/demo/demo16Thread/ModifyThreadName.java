package cn.itcast.dayweb.demo.demo16Thread;

/*
* 改变线程的名称：1.Thread中有一个setName()方法 2.创建一个带参数的构造方法，再调用父类的带参构造方法，把线程名称传递给父类。
* 让父类给线程起一个名字 Thread(String name)分配新的线程名称
* */
public class ModifyThreadName extends Thread{
    @Override
    public void run() {
        //获取线程的名称
        System.out.println(Thread.currentThread().getName());
    }

    public ModifyThreadName(String name) {
        super(name);
    }
    public ModifyThreadName() {

    }
}
