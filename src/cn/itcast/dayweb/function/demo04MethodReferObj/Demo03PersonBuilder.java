package cn.itcast.dayweb.function.demo04MethodReferObj;

@FunctionalInterface
public interface Demo03PersonBuilder {
    //传递一个name,创建一个Person对象
    public abstract Demo03Person personBuilder(String name);
}
