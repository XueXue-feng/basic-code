package cn.itcast.day.demo10;

public interface MyInterfaceC {
    public abstract void methodC();
    public abstract void methodCommand();

    public default void methodDefault(){
        System.out.println("我是接口C的默认方法");
    }
}
