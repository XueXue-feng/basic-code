package cn.itcast.dayweb.demo.demo23Reader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
*
* */
public class Demo04Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw =new FileWriter("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo23Reader\\c.txt");
        char[] c = new char[]{'我','是','大','胖','胖',};
        fw.write(c,0,4);
        fw.flush();
        fw.write("\r\n");
        fw.write(",你是谁！！！");
        fw.flush();
        fw.close();
        FileReader fr = new FileReader("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo23Reader\\c.txt");
        char[] c2 = new char[1024];
        int len = 0;
        while((len = fr.read(c2)) != -1){
            System.out.println(new String(c2,0,len));
        }
        fr.close();
    }
}
