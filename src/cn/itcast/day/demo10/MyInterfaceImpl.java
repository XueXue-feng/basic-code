package cn.itcast.day.demo10;

public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB{
    @Override
    public void methodA() {
        System.out.println("覆盖重写了methodA");
    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写了A.B接口都有的抽象方法只需要写一个即可");
    }

    @Override
    public void methodDefault() {
        System.out.println("MyInterfaceImpl 覆盖重写实现类中重构接口的默认方法");
    }

    @Override
    public void method() {

    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了methodB");
    }
}
