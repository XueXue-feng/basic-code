package cn.itcast.day.demo10;

public class MyInterfaceDefaultImplA implements MyInterfaceDefault{
    @Override
    public void methodAbs() {
        System.out.println("我实现了抽象类中的接口方法 AAA" );
    }

    @Override
    public void methodAbsDefault() {
        System.out.println("实现类A覆盖重写了methodAbsDefault");
    }
}
