package cn.itcast.dayweb.demo.demo16Thread;

/*
* 匿名内部类实现多线程
* */
public class InnerClassThread {
    public static void main(String[] args) {
        //匿名内部类的方法
       new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("run" + i);
                }
            }
        }.start();

       //实现Runnable的方法
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("Runnable" + i);
                }
            }
        }).start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main" + i);
        }

    }


}
