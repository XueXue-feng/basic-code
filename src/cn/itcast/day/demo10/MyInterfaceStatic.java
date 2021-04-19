package cn.itcast.day.demo10;

/*
* 从java8开始允许定义静态方法,格式： public static 返回值类型 方法名 (参数列表){方法体}
* 就是将abstract,default换成static加上方法体
* */
public interface MyInterfaceStatic {
    public static void methodStatic(){
        System.out.println("这是接口的静态方法");
    }
}
