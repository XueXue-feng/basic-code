package cn.itcast.dayweb.demo.demo23Reader;

import java.io.FileWriter;
import java.io.IOException;

/*
* 续写和换行：
* FileWriter(File file, boolean append)
          根据给定的 File 对象构造一个 FileWriter 对象。
  FileWriter(String fileName, boolean append)
          根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 对象。

* */
public class Demo05Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw =new FileWriter("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo23Reader\\c.txt",true);
        fw.write("我叫李雪峰");
        fw.write("\r\n" + "我是胖胖哒");
        fw.flush();
        fw.close();
    }
}
