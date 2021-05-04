package cn.itcast.dayweb.demo.demo21Recurion;

import java.io.File;
import java.util.Locale;

/*
* 调用递归打印多级目录
* */
public class DiGuiPrintDir2 {
    public static void main(String[] args) {
        File file = new File("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code");
        printDir(file);
    }

    //打印多级目录的全部文件
    /*
    * listFiles一个做了三件事：1.listFiles会对构造方法中的参数进行遍历，并把遍历得到的每一个参数封装为一个File对象
    * 2.listFiles会调用实现类中的accept方法
    * 3、会把遍历得到的File对象传递给pathname
    * 如果accept返回true:就会把File对象保存在files数组中。否则反之
     * */
    public static void printDir(File file){
        File[] files = file.listFiles(new FileFilterImpl());
        for (File file1 : files) {

            if(file1.isDirectory()){
                printDir(file1);
            }
            if(file1.isFile()){
                System.out.println(file1);
            }
        }

    }
}
