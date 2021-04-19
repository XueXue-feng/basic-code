package cn.itcast.day.demo10;

/*
* 1.接口是没有静态代码快或者是构造方法的
* 2.一个类的直接父类有且只有一个，一个类可以同时实现多个接口
* 格式：public class 类名称 implements interfaceImplA,interfaceImplB(参数列表){方法体};
* */
public interface MyInterfaceB {
    public abstract void methodB();
    public abstract void methodAbs();
    public default void methodDefault(){
        System.out.println("My InterfaceB 的默认方法执行了 BBB");
    }
    public default void method(){
        System.out.println("我是接口B");
    }
}
