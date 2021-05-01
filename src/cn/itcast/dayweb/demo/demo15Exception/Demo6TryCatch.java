package cn.itcast.dayweb.demo.demo15Exception;

import java.io.IOException;

/*
*异常处理的第二种方式;try{可能会产生异常的代码}catch(异常变量用来接收try种抛出的异常){异常处理的逻辑}...catch(){}
* catch可以有多个
* 注意：try种可能会抛出多个异常对象，就可以使用多个catch
* 2.如果try种产生了异常，就会执行catch种的代码，执行完毕后就会继续
* 3.如果try种没有产生异常，那么就不会执行catch种的代码，继续
* */
public class Demo6TryCatch {
    public static void main(String[] args) {
        try {//try中抛出什么异常对象catch就定义什么异常变量来接收异常对象
            method("C:\\a.tx");
        }catch(IOException e){
            /*
             * Throwable中定义了三种异常处理方法getMessage()，toString(),
             * 提供编程访问由 printStackTrace() 输出的堆栈跟踪信息。此方法是最全面的
             * */
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            //JVM默认调用
            e.printStackTrace();
        }
        System.out.println("我是后续代码");
    }
    public static void method(String fileName) throws IOException {
        if(!fileName.endsWith(".txt")){
            throw new IOException("文件的结尾名不正确!!!");
        }
        System.out.println("我是猪");//异常不执行
    }
}
