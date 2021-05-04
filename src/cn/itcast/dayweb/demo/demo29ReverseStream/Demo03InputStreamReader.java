package cn.itcast.dayweb.demo.demo29ReverseStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* java.io.InputStreamReader extends Reader 是字节流通向字符流的桥梁：它使用指定的 charset 读取字节并将其解码为字符
* 解码的作用
* 继承自父类的方法:read(),close()
* 构造方法：InputStreamReader(InputStream in)
          创建一个使用默认字符集的 InputStreamReader。
           InputStreamReader(InputStream in, String charsetName)
          创建使用指定字符集的 InputStreamReader。
参数：InputStream文件中保存的字节
* 注意：1.构造方法中指定的编码表要和文件的编码表一样
* */
public class Demo03InputStreamReader {
    public static void main(String[] args) {
        try(InputStreamReader isr = new InputStreamReader
                (new FileInputStream("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo29ReverseStream\\a.txt"),"GBK")) {
            int len = 0;
            while((len = isr.read()) != -1){
                System.out.println((char)len);
            }
            isr.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
