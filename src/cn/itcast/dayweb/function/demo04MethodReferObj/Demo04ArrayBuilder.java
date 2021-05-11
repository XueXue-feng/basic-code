package cn.itcast.dayweb.function.demo04MethodReferObj;

@FunctionalInterface
public interface Demo04ArrayBuilder {
    //定义一个函数式接口参数是数组的长度，返回创建好的数组
    public abstract int[] arrayBuilder(int length);
}
