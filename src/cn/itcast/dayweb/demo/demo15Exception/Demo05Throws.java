package cn.itcast.dayweb.demo.demo15Exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
* throws是异常处理的第一种方式，交给调用者处理,自己不处理交给别人处理最终交给JVM处理
* 在声明时使用格式：修饰符 返回值类型 方法名(参数列表) throws AAAException,BBBException{
*    throw new AAAException("");
*    throw new BBBException("");
* 注意：1.必须卸载方法声明出
* 2.声明的对象必须是Exception
* 3.如果方法的内部抛出了多个异常那么throws也必须声明多个异常，如果声明的对象有字符类关系那么直接声明父类异常即可
* 4.调用了一个声明抛出异常的方法，那么就必须处理异常，要么继续使用Throws 抛出交给方法的调用者最终交给JVM要么try...catch
* 缺陷：throws之后的代码不会执行，因为throws最终会交给JVM处理，JVM会进行中断处理所以之后的代码不会执行
*   }
* */
public class Demo05Throws {
    public static void main(String[] args) throws NullPointerException, ArrayIndexOutOfBoundsException, ParseException, IOException {
        int[] array = {1,2,3,4,5};
        method1(array,4,"C:\\a.txt");
    }
    public static void method1(int[] array,int index,String fileName) throws ParseException, IOException {
        if(array == null){
            throw new NullPointerException("空指针异常发生了");
        }
        if(index < 0 || index > array.length){
            throw new ArrayIndexOutOfBoundsException("数组越界异常发生了");
        }
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            date.parse("1234-99-89");
            if(!fileName.equalsIgnoreCase("C:\\a.txt")){
                throw new FileNotFoundException("文件不存在");//你是编译异常就必须处理可以使用throws抛出
            }
            if(fileName.endsWith(".txt")){
                throw new IOException("文件的结尾不对");
            }
                System.out.println("我真好看");


    }
}
