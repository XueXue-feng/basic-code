package cn.itcast.dayweb.function.demo02Lambda;

/*
* 使用Lambda优化日志案例
* 特点：延迟加载Lambda使用前提：必须存在函数式接口
* 1.使用Lambda作为参数传递，仅仅是把参数传递给showLog方法，只有满足level == 1才会调用builderMessage方法
* 才会进行字符串的拼接。日志的等级不是1级，builderMessage就不会执行就不存在性能的浪费
* 延迟执行
* */
public class Demo02Lambda {
    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";
            /*showLog(1, new MessageBuilder() {
                @Override
                public String builderMessage() {
                    return msg1 + msg2;
                }
            });*/
        //使用Lambda表达式
        showLog(2,()->{
            System.out.println("不满足条件不执行");
            return (msg1 + msg2 + msg3);
        });

    }

    public static void showLog(int level,MessageBuilder msg){
        if(level == 1){
            System.out.println(msg.builderMessage());
        }
    }
}
