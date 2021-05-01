package cn.itcast.dayweb.demo.demo20File;

import java.io.File;

/*
* File类遍历文件夹：
* public String[] list(){}
* public File listFile(){}
*
* 注意事项：1.list()和listFile()遍历的是构造方法中给的目录/文件夹
* 2.如果给的的文件夹不存在或者不是一个文件夹会抛出空指针异常
* */
public class Demo06File {
    public static void main(String[] args) {
        File file = new File("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo20File");
        String[] list = file.list();
        for (String str:list) {
            System.out.println(str);
        }
        File[] files = file.listFiles();
        for(File f:files){
            System.out.println("----->" +f.getName());
        }


    }
}
