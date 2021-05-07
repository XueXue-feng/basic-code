package cn.itcast.dayweb.demo.demo31PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
* java.io.PrintStream extends OutputStream 字节打印流
* 特点：1.只负责数据的输出不负责数据的读取
* 2.不会抛出IOException
* 3.有特有的方法print(),println()
* 构造方法：PrintStream(File file) 创建具有指定文件且不带自动行刷新的新打印流。
          PrintStream(OutputStream out) 创建新的打印流。
          PrintStream(String fileName)  创建具有指定文件名称且不带自动行刷新的新打印流。
注意：如果使用继承自父类的write方法会查询编码表，自己特有的方法print()，println()写的数据原样输出。

* */
public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo31PrintStream\\Print.txt");
        ps.write(97);//a
        ps.println(97);//97
        ps.println(8.8);
        ps.close();
    }
}
