package cn.itcast.dayweb.demo.demo30ObjectOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
* java.io.ObjectOutputStream extends OutputStream对象的序列化
* 把对象以流方法保存到文件中
* 1.字节输出流
* 特有的成员方法:writeObject(Object obj)  将指定的对象写入 ObjectOutputStream。
* */
public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo30ObjectOutputStream\\a.txt"));
        oos.writeObject(new Person("小米",19));
        oos.writeObject(new Person("小明",59));
        oos.close();
    }
}
