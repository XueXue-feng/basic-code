package cn.itcast.dayweb.reflect;

import cn.itcast.dayweb.reflect.deman.Student;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/*
* 写一个框架可以帮我们创建任意类的对象，并且执行其中任意的方法
* */
public class Demo05ReflectPractise {
    public static void main(String[] args) throws Exception {
        //1.创建配置文件，在配置文件中定义类和方法
        Properties pro = new Properties();
        ClassLoader classLoader = Demo05ReflectPractise.class.getClassLoader();
        InputStream resourceAsStream = classLoader.
                getResourceAsStream("cn/itcast/dayweb/reflect/pro.properties");
        //把配置文件加载进内存
        pro.load(resourceAsStream);

        //获取配置文件中的信息
        String methodName = pro.getProperty("methodName");
        String className = pro.getProperty("className");

        //利用反射获取类
        Class<?> aClass = Class.forName(className);
        Constructor<?> constructor = aClass.getConstructor();//无参构造方法
        constructor.setAccessible(true);
        Object o = constructor.newInstance();//创建无参对象
        //获取对象的方法
        Method method = aClass.getDeclaredMethod(methodName);
        method.setAccessible(true);
        method.invoke(o);



    }
}
