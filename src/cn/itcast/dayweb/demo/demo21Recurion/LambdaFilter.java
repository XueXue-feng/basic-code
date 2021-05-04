package cn.itcast.dayweb.demo.demo21Recurion;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Locale;

public class LambdaFilter {
    public static void main(String[] args) {
        File file = new File("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo");
        getFileEndWithJava(file);
    }
    public static void getFileEndWithJava(File file){
        /*File[] files = file.listFiles((File pathname)-> {
                if(pathname.isDirectory()){
                    return true;
                }
                return pathname.getName().toLowerCase(Locale.ROOT).endsWith(".java");

        });*/
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory() || name.toLowerCase(Locale.ROOT).endsWith(".java");
            }
        });
        for (File file1 : files) {
            if(file1.isDirectory()){
                getFileEndWithJava(file1);
            }
            if(file1.isFile()){
                System.out.println(file1);
            }
        }
    }
}
