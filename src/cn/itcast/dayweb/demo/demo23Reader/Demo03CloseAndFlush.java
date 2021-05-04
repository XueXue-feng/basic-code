package cn.itcast.dayweb.demo.demo23Reader;

import java.io.FileWriter;
import java.io.IOException;

/*
* flush()：刷新缓冲区，可以继续使用流
* close():刷新缓冲区，不可以继续使用流
* */
public class Demo03CloseAndFlush {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo23Reader\\c.txt");
        fw.write(97);
        //刷新之后流还可以继续使用
        fw.flush();
        fw.write(98);
        fw.close();
        fw.write(99);//java.io.IOException: Stream closed
    }
}
