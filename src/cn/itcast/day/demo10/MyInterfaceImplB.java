package cn.itcast.day.demo10;

/*
* 注意事项：
* 1.接口的多个父接口抽象方法重复没关系
* 2.接口的多个父接口的默认方法重复，那么子接口必须进行默认方法的重写，default不能省略
* */
public class MyInterfaceImplB implements MyInterface{
    @Override
    public void method() {

    }

    @Override
    public void methodC() {

    }

    @Override
    public void methodD() {

    }

    @Override
    public void methodCommand() {

    }
}
