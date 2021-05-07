package cn.itcast.dayweb.demo.demo30ObjectOutputStream;

import java.io.*;
import java.util.ArrayList;

public class SerTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serMethod();

    }
    //序列化
    public static void serMethod() throws IOException{
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person("小米",19));
        arrayList.add(new Person("小名",49));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream
                ("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo30ObjectOutputStream\\b.txt"));
        oos.writeObject(arrayList);
        oos.close();
    }
    //反序列化
    public static void serMethod2() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream
                ("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo30ObjectOutputStream\\b.txt"));
        ArrayList<Person> arrayList = (ArrayList<Person>)ois.readObject();
        for (Person person : arrayList) {
            System.out.println(person);
        }
        ois.close();
    }
}
