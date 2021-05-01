package cn.itcast.dayweb.demo.demo16Thread;

public class Test2 {
    public static void main(String[] args) {
        //通过setName()方法改变线程的名称
        ModifyThreadName mt = new ModifyThreadName();
        mt.setName("我是猪猪侠");
        mt.start();//Thread-0

        //通过带参构造方法
        ModifyThreadName mtName = new ModifyThreadName("我是胖子");
        mtName.start();//我是胖子

    }
}
