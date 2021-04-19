package cn.itcast.day.demo10;

public interface MyInterfaceD {
    public abstract void methodD();
    public abstract void methodCommand();

    public default void methodDefault(){
        System.out.println("我是接口D的默认方法");
    }
}
