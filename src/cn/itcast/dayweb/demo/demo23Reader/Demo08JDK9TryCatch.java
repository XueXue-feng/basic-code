package cn.itcast.dayweb.demo.demo23Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* JDK9+的新特性：
* 可以在try的前面定义流对象，在try中引入流对象
* A a = new A();
* try(a){//可能会产生异常的代码}catch(异常类 异常变量名){//异常的处理逻辑}
* */
public class Demo08JDK9TryCatch {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo23Reader\\c.txt");
        try(fileReader){
            int len = 0;
            while((len = fileReader.read()) != -1){
                System.out.println(len);
            }
            //会自动关闭流不用写close()
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
