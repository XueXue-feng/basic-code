package cn.itcast.dayweb.demo.demo21Recurion;
import java.io.File;
import java.io.FileFilter;
import java.util.Locale;

/*
*   java.io Interface FileFilter文件过滤器，用于listFiles(FileFilter fileFilter)
* 抽象方法:accept(File pathname) 测试指定的抽象路径名是否应包含在路径名列表中。
*
* java.io Interface FilenameFilter 用于实现此接口的类的实例用于过滤文件名。
* accept(File dir, String name) 测试指定文件是否应包含在文件列表中。
注意：两个过滤器是没有实现类的需要我们自己重写accept()方法
* 规则;在accept方法中判断File对象是否以.java结尾的是的话就返回true
 * */
public class FileFilterImpl implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        if (pathname.isFile() && pathname.getName().toLowerCase(Locale.ROOT).endsWith(".java")) {
            return true;
        }
        if(pathname.isDirectory()){
            return true;
        }
        return false;
    }
}
