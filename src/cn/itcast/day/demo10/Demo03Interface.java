package cn.itcast.day.demo10;

/*
* 注意：不能通过接口的实现类来调用接口的静态方法
* 正确用法：通过接口名称直接调用
* */
public class Demo03Interface {
    public static void main(String[] args) {
        MyInterfaceStatic.methodStatic();//这是接口的静态方法,通过接口直接调用
    }
}
