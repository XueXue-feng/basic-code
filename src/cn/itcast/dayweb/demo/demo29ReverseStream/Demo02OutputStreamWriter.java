package cn.itcast.dayweb.demo.demo29ReverseStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/*
* java.io.OutputStreamWriter extends java.io.Writer
* 是字符流通向字节流的桥梁,可使用指定的 charset 将要写入流中的字符编码成字节,编码的过程
* 继承自父类的共性的成员方法：close(),write(),flush()
* OutputStreamWriter(OutputStream out)
          创建使用默认字符编码的 OutputStreamWriter。
  OutputStreamWriter(OutputStream out, String charsetName)
          创建使用指定字符集的 OutputStreamWriter。
 参数：OutputStream字节输出流，可以写转换之后的字节写入到文件中
 * charsetName指定的编码表名称，不区分大小写，不指定则默认UTF-8
 * 使用步骤：1.创建outputStreamWriter对象，再构造方法中指定编码表和FileOutputStream对象
 * 2.使用outputStreamWriter中的write方法，把字符转换成字节存储到缓冲区中（编码）
 * 3.使用outputStreamWriter的flush()和close()

* */
public class Demo02OutputStreamWriter {
    public static void main(String[] args) {
       /* try(OutputStreamWriter osw = new OutputStreamWriter
                (new FileOutputStream("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo29ReverseStream\\a.txt"), StandardCharsets.UTF_8);){*/
        try(OutputStreamWriter osw = new OutputStreamWriter
                (new FileOutputStream("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo29ReverseStream\\a.txt"),"GBK");){
        osw.write("我是胖胖吨");
            osw.flush();
            osw.close();
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
