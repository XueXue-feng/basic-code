package cn.itcast.day.demo13;

/*
* 如果接口的实现类（父类的子类）只需要使用唯一的一次，那么这些情况下就可以省略该类的定义，使用匿名内部类
* 匿名内部类的格式：
* 接口名称 对象名 = new 接口名称{
*   //覆盖重写接口中所有抽象方法
* };
* 注意事项：1.对格式new 接口名称{//覆盖重写接口中所有抽象方法};
* 进行解析：1.new代表创建对象的动作 2.接口名称就是匿名内部类需要实现哪个接口 3.{....}这里才是匿名内部类的内容
* 2.匿名内部类适用于这个类只想要用一次，在创建对象的时候只能使用唯一的额一次
* 3.匿名对象在调用方法的时候只能调用一次，如果希望同一个对象调用多个方法，就必须给匿名对象起个名字
* 4.匿名内部类是省略了实现类（子类）但是匿名对象是省略了对象名称
* */
public class DemoMain {
    public static void main(String[] args) {
        //多态写法
        MyInterface obj = new MyInterfaceImpl();
        obj.method();

        //是匿名类但不是匿名对象，myInterface是匿名类的对象
        MyInterface myInterface = new MyInterface() {
            @Override
            public void method() {//局部匿名内部类
                System.out.println("我也是接口的实现方法");
            }
        };
        myInterface.method();

        //匿名对象，匿名类
        new MyInterface() {
            @Override
            public void method() {//局部匿名内部类
                System.out.println("我也是接口的实现方法");
            }
        }.method();
    }

}
