package cn.itcast.dayweb.demo.demo25BufferedInputStream;

import java.io.*;

/*
* 用字节流和字节缓冲流实现复制文件
* */
public class Practise {
    public static void main(String[] args) {
        //copyImgUseStream();//8145
        copyImgUseBufferedStream();//600
    }

    //使用字节缓冲流实现复制文件
    private static void copyImgUseBufferedStream() {
        long start = System.currentTimeMillis();
        try(FileInputStream fis = new FileInputStream("D:\\我的电视剧\\Space Force.S01E10.1080P.chs.mp4");
            FileOutputStream fos = new FileOutputStream("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo25BufferedInputStream\\b.mp4",true);
            BufferedInputStream bis = new BufferedInputStream(fis); BufferedOutputStream bos = new BufferedOutputStream(fos)){
            byte[] bytes = new byte[1024];
            int len = 0;
            while((bis.read(bytes)) != -1){
                bos.write(bytes,0,len);
            }
            bos.close();
            bis.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    //使用字节流实现复制文件
    private static void copyImgUseStream() {
        //把图片读取到内存中
        long start = System.currentTimeMillis();
        try(FileInputStream fis = new FileInputStream("D:\\我的电视剧\\Space Force.S01E10.1080P.chs.mp4");
        FileOutputStream fos = new FileOutputStream("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo25BufferedInputStream\\d.mp4",true);)
        {
            byte[] bytes = new byte[1024];
            int len = 0;
            while((len = fis.read(bytes)) != -1){
                fos.write(bytes,0,len);
            }
            //关闭流
            fos.close();
            fis.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
