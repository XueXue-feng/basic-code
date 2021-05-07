package cn.itcast.dayweb.demo.demo26BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
* java.io.BufferedWriter extends Writer字符缓冲输出流
* 继承自父类的方法：close(),write(),flush()
* 构造方法：
* BufferedWriter(Writer out) 创建一个使用默认大小输出缓冲区的缓冲字符输出流。
  BufferedWriter(Writer out, int sz)创建一个使用给定大小输出缓冲区的新缓冲字符输出流。
 缓冲流会给FileWriter增加一个字符缓冲区  指定缓冲区的大小
 * 特有的方法;newLine()  写入一个行分隔符。会根据不同的操作系统获取不同的行分隔符

* */
public class demo01BufferedWriter {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo26BufferedWriter\\a.txt")){
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("我是胖墩1号",0,6) ;
            bw.newLine();
            bw.write("我是胖墩2号",0,6) ;
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
