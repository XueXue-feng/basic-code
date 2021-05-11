package cn.itcast.dayweb.function.demo04MethodReferObj;

@FunctionalInterface
public interface Calcable {
    //传递一个整数对整数进行绝对值计算并返回
    public abstract Integer calculateIntAbs(int num);
}
