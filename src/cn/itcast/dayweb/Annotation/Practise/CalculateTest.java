package cn.itcast.dayweb.Annotation.Practise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ProjectName: basic-code
 * @Package: cn.itcast.dayweb.Annotation.Practise
 * @ClassName: CalculateTest
 * @Author: XueXue-Li
 * @Description: 用于测试计算机类的代码
 * @Date: 2021/5/10 21:14
 * @Version: 1.0
 * <p>
 * 简单的测试框架：当主方法执行时会自动执行被检查的方法（加了Check的方法）
 */
public class CalculateTest {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        //获取注解的类
        Class<Calculator> calculatorClass = Calculator.class;
        //获取需要测试的类
        String className = calculatorClass.getName();
        Annotation annotation = calculatorClass.getAnnotation(Check.class);
        //创建该类的对象
        Constructor<Calculator> constructor = calculatorClass.getConstructor();
        Calculator calculator = constructor.newInstance();

        //获取类中的方法
        Method[] declaredMethods = calculatorClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.getAnnotation(Check.class) != null) {
                try {
                    declaredMethod.invoke(calculator);
                }  catch (Exception e) {
                    //如果发生了此异常则创建一个文件，将Bug日志输出到文件中
                    try (
                         FileOutputStream fos = new FileOutputStream("D:\\IntelliJ-IDEA-2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\Annotation\\Practise\\bug.txt", true);
                    ) {
                        //异常的名称
                        String str = e.getCause().getClass().getSimpleName();
                        //产生异常的方法名
                        String methodName = declaredMethod.getName();
                        //异常的原因
                        String str2 = e.getCause().toString();
                        fos.write(methodName.getBytes(),0,methodName.length());
                        fos.write("\r\n".getBytes());
                        fos.write(str.getBytes(),0,str.length());
                        fos.write("\r\n".getBytes());
                        fos.write(str2.getBytes(),0,str2.length());
                        fos.write("\r\n".getBytes());
                        fos.write("==========================".getBytes());
                        fos.write("\r\n".getBytes());
                        //关闭流
                        fos.close();


                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }


            }

        }

    }

}

