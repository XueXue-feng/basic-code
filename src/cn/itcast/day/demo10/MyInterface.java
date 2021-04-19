package cn.itcast.day.demo10;

/*
* 这个子接口中有4个方法methodC-->interfaceC，methodD-->interfaceD,
* methodCommand-->interfaceC,D,method-->interface
* */
public interface MyInterface extends MyInterfaceC,MyInterfaceD {
    public abstract void method();
    @Override
    public default void methodDefault(){
        System.out.println("我是MyInterface的重写的默认方法");
    }
}
