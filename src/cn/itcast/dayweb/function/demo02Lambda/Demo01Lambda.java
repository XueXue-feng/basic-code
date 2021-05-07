package cn.itcast.dayweb.function.demo02Lambda;

/*
* 日志案例
* 存在性能浪费：字符串无论是否使用字符串都拼接好了
* */
public class Demo01Lambda {
    //根据日志的级别显示日志的信息
    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "World";
        showLog(2,msg1 + msg2);
    }
    public static void showLog(int level,String message){
        if(level == 1){
            System.out.println(message);
        }
    }
}
