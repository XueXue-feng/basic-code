package cn.itcast.dayweb.demo.demo15Exception;

import java.io.IOException;

/*
*finally代码块无论是否出现异常都会指向
* 1.不能单独使用
* 2.一般用于资源是否/回收
*
* */
public class Demo07TryCatchFinally {
    public static void main(String[] args) {
        try {
            method("C:\\a.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("资源释放！！！");
        }
    }
    public static void method(String fileName) throws IOException {
        if(!fileName.endsWith(".txt")){
            throw new IOException("文件的结尾名不正确!!!");
        }
        System.out.println("我是猪");//异常不执行
    }
}
