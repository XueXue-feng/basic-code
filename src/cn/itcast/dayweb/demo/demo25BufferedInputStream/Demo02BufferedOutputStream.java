package cn.itcast.dayweb.demo.demo25BufferedInputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
*  给基本的字节输入流增加一个缓冲区（数组）提高基本的字节输入流的读取效率
 * java.io.BufferedOutputStream extends OutPutStream字节缓冲输出流
 * 继承自父类的共性方法：close(),flush(),write()
 * 使用步骤：1.创建OutputStream 对象，参数中绑定要输出的目的地
 * 2.创建BufferedOutputStream对象，参数中传递FileOutputStream对象，提高FileOutputStream的传递效率
 * 3.使用BufferedOutputStream中的write方法
 * 4.使用BufferedOutputStream中的flush方法，把缓冲区中的数据刷新到磁盘中
 * 5.释放资源之前会先调用flush方法
* */
public class Demo02BufferedOutputStream {
    public static void main(String[] args) {
        //从内存写入到磁盘中
        try(FileOutputStream fos = new FileOutputStream("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo25BufferedInputStream\\a.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);){
            byte[] bytes = new byte[]{'a','b','c'};
            bos.write(bytes);
            bos.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
