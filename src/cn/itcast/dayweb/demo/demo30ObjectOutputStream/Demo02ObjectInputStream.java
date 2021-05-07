package cn.itcast.dayweb.demo.demo30ObjectOutputStream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
* java.io.ObjectInputStream extends InputStream对象的反序列化流作用：把文件中保存的对象以流的方法读取出来使用
* 构造方法：传递一个字节输入流，特有的成员方法：Object readObject()从 ObjectInputStream 读取对象。
* readObject()的使用前提：1.类必须进行序列化 2.必须进行序列化文件才能进行法案序列化操作
* */
public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream
                ("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo30ObjectOutputStream\\a.txt"));
        //当抛出EOFException异常的时候说明文件已经读完
        while (true){
            try{
                System.out.println(ois.readObject());
            }catch (EOFException e){
                break;
            }
        }

        ois.close();
    }
}
