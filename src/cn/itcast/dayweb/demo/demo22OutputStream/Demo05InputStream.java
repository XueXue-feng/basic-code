package cn.itcast.dayweb.demo.demo22OutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
* 一次读取多个字节的方法FileInputStream
* 方法的参数byte[] bytes：从输入流中读取一定长度的字节，并将其储存在缓冲区的byte数组中，存储读取到的多个字节，一般定义成1024B字节1KB，1024的整数倍
* 方法的返回值int：每次读取到的有效字节个数
* */
public class Demo05InputStream {
    public static void main(String[] args) {
        try {
        FileInputStream fis = new FileInputStream("day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo22OutputStream\\b.txt");
        byte[] bytes = new byte[1024];
            //记录读取的有效字节个数
            /*System.out.println(read);
            * System.out.println(Arrays.toString(bytes));
             *System.out.println(new String(bytes));*/
            //使用循环优化
            int read = 0;
            while((read = fis.read(bytes))!= -1){
                //String(byte[] bytes, int offset, int length) 通过使用平台的默认字符集解码指定的 byte 子数组，构造一个新的 String
                 System.out.println(new String(bytes,0,read));
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
