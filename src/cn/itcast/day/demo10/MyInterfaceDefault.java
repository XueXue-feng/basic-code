package cn.itcast.day.demo10;

/*
* 从java8开始，接口里允许定义默认方法 public default 返回值类型 方法名(参数列表){方法体}
* 接口中的默认方法可以解决接口升级的问题
* */
public interface MyInterfaceDefault {
    //抽象方法
    public abstract void methodAbs();

    //新添加的默认方法
    public default void methodAbsDefault(){
        System.out.println("新添加的默认方法");
    }
}
