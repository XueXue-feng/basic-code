package cn.itcast.dayweb.demo.demo27BufferedReader;

import java.io.*;

/*
* java.io.BufferedReader extends FileReader
* 继承自父类的方法：close(),read()
* 构造方法:
BufferedReader(Reader in) 创建一个使用默认大小输入缓冲区的缓冲字符输入流。
BufferedReader(Reader in, int sz) 创建一个使用指定大小输入缓冲区的缓冲字符输入流。
特有的成员方法：String readLine() 读取一个文本行 换行，回车
* */
public class Demo01BufferedReader {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo26BufferedWriter\\a.txt");
            BufferedReader br = new BufferedReader(fr)){
            /*int len = 0;
            while((len = br.read()) != -1){
                System.out.print((char)len);
            }*/
            String str;
            while((str = br.readLine()) != null){
                System.out.println(str);
            }
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
