package cn.itcast.dayweb.demo.demo23Reader;

import java.io.FileWriter;
import java.io.IOException;

/*
* JDK7+之后的新特性：try之后加一个括号，括号中可以定义流对象，就不用再写finally了
* 格式try(流对象;....){//可能会产生异常的代码}catch(异常类 异常类变量){异常的处理逻辑}
* */
public class Demo07JDK7TryCatch {
    public static void main(String[] args) {
        //字符的输入流
        try (FileWriter fw =  new FileWriter("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo23Reader\\c.txt")){
            fw.write("你是猪");
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
