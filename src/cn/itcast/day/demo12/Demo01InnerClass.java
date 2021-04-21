package cn.itcast.day.demo12;

/*
* 如果一个事物的内部包含另一个事物，那么这就是一个类内部包含另一个类
* PS：身体和心脏，汽车和发动机
*
* 分类：
* 1.成员内部类：
* 2.局部内部类：包含匿名内部类
*
* 注意：1.内用外可以随意访问：外用内一定需要借助内部类对象
*
* 如何使用内部类，两种方法：
* 1.间接使用：在外部类的方法中创建内部类对象
* 2.直接调用，公式 外.内
* 外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称()
* */
public class Demo01InnerClass {
    public static void main(String[] args) {
        //通过外部类的对象，调用外部类的方法，里面间接使用内部类的方法
        Body body = new Body();
        body.setName("小米");
        body.methodMethod();
        System.out.println("==========");
        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
