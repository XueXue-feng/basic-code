package cn.itcast.dayweb.demo01.demo19Lambda;

/*
* Lambda表达式的标准格式：由三部分组成 一些参数，一个箭头，一段代码
* (参数列表) -> {重写方法的代码}
* ()接口中抽象方法的参数列表，没有参数就空着
* ->就是传递的意思，把参数传递给方法体
* {}重写接口的方法体
* */
public class Demo02Lambda {
    public static void main(String[] args) {
        //使用匿名内部类的方法创建多线程
        new Thread(new Runnable() {
            @Override
            public void run() {//Thread-1我是run方法
                System.out.println(Thread.currentThread().getName() + "我是run方法");
            }
        }).start();

        //使用Lambda实现多线程
        new Thread(() ->{//Thread-0我是run方法
                System.out.println(Thread.currentThread().getName() + "我是run方法");

        }).start();
        //优化省略Lambda
        new Thread(() ->
            System.out.println(Thread.currentThread().getName() + "我是run方法")
        ).start();
    }
}
