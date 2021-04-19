package cn.itcast.day.demo10;

/*
* 1.接口的默认方法可以通过接口的实现类直接继承，直接调用
* 2.接口的默认方法可以通过接口的实现类覆盖重写
* */
public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultImplA myInterfaceDefaultImplA = new MyInterfaceDefaultImplA();
        myInterfaceDefaultImplA.methodAbs();//我实现了抽象类中的接口方法 AAA
        //调用默认方法，如果实现类中没有会向上找接口
        myInterfaceDefaultImplA.methodAbsDefault();//实现类A覆盖重写了methodAbsDefault

        System.out.println("================");
        MyInterfaceDefaultImplB myInterfaceDefaultImplB = new MyInterfaceDefaultImplB();
        myInterfaceDefaultImplB.methodAbs();//我实现了抽象类中的接口方法 BBB
        myInterfaceDefaultImplB.methodAbsDefault();//新添加的默认方法
    }
}
