package cn.itcast.dayweb.demo.demo29ReverseStream;

import java.io.*;

/*
* 指定GBK编码的转换流，读取文本文件
* 指定UTF-8编码的转换流，写出文本文件
* */
public class TransDemo {
    public static void main(String[] args) {
        //readFile(new File("D:\\新建文件夹\\我是UTF-8文件.txt"));
        writeFile();
    }

    //指定GBK编码的转换流，读取文本文件
    public static void readFile(File file){
        try( InputStreamReader isr = new InputStreamReader(new FileInputStream(file),"UTF-8")){
           int len = 0;
           while((len = isr.read()) != -1){
               System.out.println((char)len);
           }
           isr.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //指定UTF-8编码的转换流，写出文本文件
    public static void writeFile(){
        try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream
                ("D:\\\\新建文件夹\\\\我是GBK编码文件"),"GBK")) {
            osw.write("我是你，你是谁");
            osw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
