package cn.itcast.dayweb.demo.demo31PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Date;

/*
* 可以改变打印流的流向，输出语句默认在打印台输出使用System.setOut可以改变输出语句的打印目的地为输出流的位置
* static void setOut(PrintStream ps)
* 重新分配标准输出流
* */
public class Demo02PrintStream {
    public static void main(String[] args) {
        System.out.println("我是在控制台输出的");
        try(PrintStream ps = new PrintStream
                ("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo31PrintStream\\log.txt");) {
            System.setOut(ps);
            System.out.println("我是在哪里输出的呢====" + new Date());
            ps.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("我是在哪里输出的呢====" + new Date());

    }
}
