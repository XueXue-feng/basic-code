package cn.itcast.dayweb.demo.demo23Reader;

import java.io.FileReader;
import java.io.IOException;

/*
* java.io.Reader字符输入流的顶层父类抽象类
* int read()  读取单个字符。
* int read(char[] cbuf) 将字符读入数组。
* close() 关闭该流并释放与之关联的所有资源。
* java.io.FileReader extends InputStreamReader extends Reader文件字符输入流：把文件硬盘中的数据以字符的方法读取到内存中
* 构造方法：FileReader(File file)
          在给定从中读取数据的 File 的情况下创建一个新 FileReader。读取数据的数据源
          FileReader(String fileName)
          在给定从中读取数据的文件名的情况下创建一个新 FileReader。
    1.创建一个FileReader对象
*   2.把FileReader对象指向目标文件
* */
public class Demo01Reader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo23Reader\\c.txt");
        int len = 0;
        char[] bytes = new char[1024];
        while((len = fileReader.read()) != -1){
            //System.out.println(new String(bytes,0,len));
            System.out.println((char) len);
        }
        fileReader.close();
    }
}
