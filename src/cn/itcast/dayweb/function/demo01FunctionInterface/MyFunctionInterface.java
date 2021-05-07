package cn.itcast.dayweb.function.demo01FunctionInterface;

/*
* 函数式接口：有且只有一个抽象方法的接口
* 当然接口中可以包含其他方法：默认方法，私有方法，静态方法
* FunctionalInterface检测接口是否是一个函数式接口，是编译成功，否编译失败
*
* */
@FunctionalInterface
public interface MyFunctionInterface {
    //定义一个抽象方法
    public abstract void method();
}
