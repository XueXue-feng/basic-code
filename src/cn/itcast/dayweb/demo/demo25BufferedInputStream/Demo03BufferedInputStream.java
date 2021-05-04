package cn.itcast.dayweb.demo.demo25BufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
* java.io.BufferedInputStream extends FileInputStream字节缓冲输入流
* 继承自父类的方法：close(),read()
* 构造方法:
* BufferedInputStream(InputStream in)我们可以传递一个FileInputStream对象
          创建一个 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
  BufferedInputStream(InputStream in, int size)指定大小的FileInputStream对象
          创建具有指定缓冲区大小的 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
* */
public class Demo03BufferedInputStream {
    public static void main(String[] args) throws IOException {
        //inputStream从磁盘中读入内存中
        FileInputStream fis = new FileInputStream("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo25BufferedInputStream\\a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte[] bytes = new byte[1024];//存储每次读取的数据
        int read = 0;//记录读取字节的有效字节数
        while((read = bis.read()) != -1){
           // System.out.println((char) read);
            System.out.println(new String(bytes,0, read));
        }
        bis.close();
    }
}
