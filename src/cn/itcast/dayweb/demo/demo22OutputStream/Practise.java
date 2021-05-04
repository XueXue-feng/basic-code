package cn.itcast.dayweb.demo.demo22OutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 文件的复制
* */
public class Practise {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        File file = new File("C:\\Users\\16146\\Pictures\\联想锁屏壁纸\\8523825.jpg");
        //将图片读取到内存中
        FileInputStream fis = new FileInputStream("C:\\Users\\16146\\Pictures\\联想锁屏壁纸\\8523825.jpg");
        FileOutputStream fos = new FileOutputStream("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo22OutputStream\\d.jpg",true);
        byte[] byteRead = new byte[246784];
        int len = 0;
        while((len = fis.read(byteRead)) != -1){
            //将内存中的图片复制输入到D:\IntelliJ IDEA 2020.3.3\code\day04-code\src\cn\itcast\dayweb\demo\demo22OutputStream
            fos.write(byteRead,1,len);
        }
        //先关闭写的后关闭读的
        fos.close();
        fis.close();
        System.out.println(System.currentTimeMillis() - start);
    }
}
