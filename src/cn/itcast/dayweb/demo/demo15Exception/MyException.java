package cn.itcast.dayweb.demo.demo15Exception;

/*
* 自己定义异常类：java给我没让你提供的异常类不够我们使用
* 格式：Public class xxException extends Exception/RuntimeException{
*      构造方法()
*      带参数的构造方法();
* }
* 注意：1.异常一般是以Exception结尾的表示这是一个异常类
* 2.必须继承Exception/RunTimeException
* Exception：这是一个编译期异常，必须throws或者是try...catch
* RunTimeException：运行时异常无需处理，交给JVM终端处理
* */
public class MyException extends Exception{
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
