package cn.itcast.day.demo10;

/*
* 1.接口是没有静态代码快或者是构造方法的
* 2.一个类的直接父类有且只有一个，一个类可以同时实现多个接口
* 格式：public class 类名称 implements interfaceImplA,interfaceImplB(参数列表){方法体};
* 3.如果所实现的多个接口中存在重复的抽象方法，那么只需要写一个即可
* 4.如果实现类没有所有接口中的所有抽象方法那么实现类就必须是抽象类
* 5.如果实现类所实现的接口中，存在重复的默认方法，那么实现类一定要对冲突的默认方法进行重写
* 6.一个类如果直接父类当中的方法和接口中的方法产生了冲突，会优先使用父类的方法
* */
public interface MyInterfaceA {
    public abstract void methodA();
    public abstract void methodAbs();

    public default void methodDefault(){
        System.out.println("My InterfaceA 的默认方法执行了 AAA");
    }
    public default void method(){
        System.out.println("我是接口A");
    }
}
