package cn.itcast.day.demo10;

/*
 * 接口中也可以定义成员变量，但是必须使用public static final来修饰
 * 从效果上看，其实就是接口的常量
 * 一旦使用final关键字修饰，说明不可改变
 * 接口中的常量public static final可以省略，但是不写也是这个效果
 * 注意事项：1.接口中的常量必须进行赋值。
 * 2.接口中的常量名称使用完全大写，用下划线进行分割
 * */
public interface MyInterfaceConst {
    //这就是一个常量，一旦赋值就不可以改变
    public static final int NUM = 10;
    String NAME = "小米";
}
