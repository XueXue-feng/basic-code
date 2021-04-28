package cn.itcast.dayweb.demo01.demo15Exception;

/*
*
* 自定义异常类：如果用户已经注册则提醒：亲您已注册
* */
public class RegisterException extends Exception{
    public RegisterException(String message) {
        super(message);
    }

    public RegisterException() {
        super();
    }
}
