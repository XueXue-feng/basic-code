package cn.itcast.dayweb.demo.demo20File;

import java.io.File;
import java.io.IOException;

public class Demo05File {
    public static void main(String[] args) {
        mkFile();
        //mkFileJia();
        //deleteFile();
    }

    /*
    * delete(0此方法既可以删除文件又可以删除文件夹注意：1.delete()是直接删除的不走回收站所以要谨慎删除
    * */
    private static void deleteFile() {
        File file1 = new File("D:\\IntelliJ IDEA 2020.3.3\\code\\1.txt");
        System.out.println(file1.delete());
    }

    //创建文件夹
    private static void mkFileJia() {
        File file1 = new File("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo20File\\a.txt");
        System.out.println(file1.mkdir());//如果已经存在则返回false
        System.out.println(file1.mkdirs());//false

        File file2 = new File("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo20File\\新建文件夹");
        System.out.println(file2.mkdir());//true
        System.out.println(file2.mkdirs());//false

        File file3 = new File("D:\\新建文件夹\\测试");
        System.out.println(file3.mkdir());//false
        System.out.println(file3.mkdirs());//true
    }

    //创建一个空文件1.如果文件存在则返回false不会新创建/*code\day04-code\*/
    public static void mkFile(){
        File file = new File("day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo20File\\1.txt");//D:\IntelliJ IDEA 2020.3.3\code\1.txt
        if(!file.exists()){
            try {
                System.out.println(file.createNewFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
