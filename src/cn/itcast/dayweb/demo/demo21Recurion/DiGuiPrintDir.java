package cn.itcast.dayweb.demo.demo21Recurion;

import java.io.File;
import java.util.Locale;

/*
* 调用递归打印多级目录
* */
public class DiGuiPrintDir {
    public static void main(String[] args) {
        File file = new File("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code");
        printDir(file);
    }

    //打印多级目录的全部文件
    public static void printDir(File file){
        File[] files = file.listFiles();
        for (File file1 : files) {
            //System.out.println(file1);
            if(file1.getName().toLowerCase(Locale.ROOT).endsWith("java")){
                //System.out.println("我找到了DiGuiPrintDir.java,他在" + file.getPath() + "。真开心");
                System.out.println(file1);
            }
            if(file1.isDirectory()){
                printDir(file1);
            }
            if(file1.isFile()){
                System.out.println(file1);
            }
        }

    }
}
