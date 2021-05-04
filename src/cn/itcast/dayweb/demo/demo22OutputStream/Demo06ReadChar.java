package cn.itcast.dayweb.demo.demo22OutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* 使用字节流读取中文
* 1个中文：GBK占用两个字节 UTF-8占用3个字节
* */
public class Demo06ReadChar {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo22OutputStream\\c.txt");
            byte[] bytes = new byte[1024];
            int len = 0;
            while((len = fis.read(bytes)) != -1){
                System.out.println(new String(bytes,0,len));
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
