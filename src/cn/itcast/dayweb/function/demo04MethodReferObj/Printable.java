package cn.itcast.dayweb.function.demo04MethodReferObj;

@FunctionalInterface
public interface Printable {
    //定义一个函数式接口用来打印输出字符串
    public abstract void printStr(String str);

}
