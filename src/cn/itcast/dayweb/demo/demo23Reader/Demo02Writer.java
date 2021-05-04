package cn.itcast.dayweb.demo.demo23Reader;

import java.io.FileWriter;
import java.io.IOException;

/*
* java.io.Writer字符输出流，抽象类
* java.io.FileWriter extends OutputStreamWriter文件字符输出流，把内存中的字符数据写入到文件中
* FileWriter(File file) 根据给定的 File 对象构造一个 FileWriter 对象。
* FileWriter(String fileName) 根据给定的文件名构造一个 FileWriter 对象。
* 构造方法的作用：1.创建一个FileWriter对象
* 2.根据构造方法的路径创建一个空文件
* 3.把对象指向空文件
* 使用步骤：1.创建FileWriter对象构造方法中绑定要写入数据的目的。
* 2.使用write()写入到内存缓冲区字符-->字节
* 3.flush()把内存缓冲区的文件刷新到文件中
* 4.close()会先把文件缓冲区中的文件刷新到文件中，然后再释放资源
* */
public class Demo02Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo23Reader\\c.txt");
        fw.write("我爱中华");
        fw.flush();
        fw.close();
    }
}
