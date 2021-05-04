package cn.itcast.dayweb.demo.demo29ReverseStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
* FileReader可以读取默认编码的文件UTF-8，但是读取GBK的文件就会产生乱码
* */
public class Demo01FileReader {
    public static void main(String[] args) {
        try(FileReader fis = new FileReader("D:\\360安全浏览器下载\\硬笔书法教程及控笔训练.docx");
            BufferedReader fr = new BufferedReader(fis)){
            int len = 0;
            char[] chars = new char[1024];
            while((len = fr.read(chars)) != -1){
                System.out.println(new String(chars,0,len));
            }
            fr.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
