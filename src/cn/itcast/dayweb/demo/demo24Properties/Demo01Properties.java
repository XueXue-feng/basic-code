package cn.itcast.dayweb.demo.demo24Properties;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/*
 * java.util.Properties extends HashTable implements Map
 * Properties 类表示了一个持久的属性集。Properties 可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串。
 * 是唯一和IO流相关的流，可以使用Properties中的store方法把内存中集合中的临时数据写入到硬盘中
 * load()把硬盘中保存的文件（键值对）写入到内存集合中使用
 * Properties是一个双列集合key和value默认都是String
 * 注意事项：1.在文件中可以使用#进行注意，用#进行注释的键值对将不会读取
 * 2.默认是字符串，不用再加引号
 * */
public class Demo01Properties {
    public static void main(String[] args) {
        //show01();
        show02();
    }

    //load()方法把硬盘中的键值对数据读取到集合中使用
    public static void show02() {
        try(FileReader fr = new FileReader("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo24Properties\\a.txt");)
        {
            Properties properties = new Properties();
            properties.load(fr);
            //遍历集合
            Iterator<String> iterator = properties.stringPropertyNames().iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
                System.out.println(properties.getProperty(iterator.next()));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //存储数据遍历去除集合中的数据
    private static void show01() {
        Properties properties = new Properties();
        properties.setProperty("1","我是胖胖1");
        properties.setProperty("2","我是胖胖2");
        properties.setProperty("3","我是胖胖3");
        //遍历properties  Set<String> stringPropertyNames() 返回此属性列表中的键集，其中该键及其对应值是字符串
        Set<String> strings = properties.stringPropertyNames();
        Iterator<String> iterator = strings.iterator();
        while(iterator.hasNext()){
            System.out.println(properties.getProperty(iterator.next()));
        }

        //字节输出流不能传递中文，字节可以传递中文，comments一般使用空字符串
        try(FileWriter fileWriter = new FileWriter("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo24Properties\\a.txt");){
            char[] chars = new char[1024];
            fileWriter.write(chars);
            properties.store(fileWriter,"我是备注");
            fileWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
