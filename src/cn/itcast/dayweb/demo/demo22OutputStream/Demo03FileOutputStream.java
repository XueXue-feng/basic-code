package cn.itcast.dayweb.demo.demo22OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
* 数据的追加写和换行写
    * FileOutputStream(File file, boolean append)
          创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
     * FileOutputStream(String name, boolean append)
          创建一个向具有指定 name 的文件中写入数据的输出文件流。
 加上换行符号即可实现换行：window:\r\n,Linux:\n;Mac:\r
* */
public class Demo03FileOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo22OutputStream\\c.txt",true);
        //追加写
        String  str = "你好啊";
        fos.write(str.getBytes(StandardCharsets.UTF_8));
        //换行写
       String str2 = "你好呀！！！" + System.getProperty( "line.separator" );
       fos.write(str2.getBytes());



    }
}
