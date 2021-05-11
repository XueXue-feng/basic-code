package cn.itcast.dayweb.Annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @ProjectName: basic-code
 * @Package: cn.itcast.dayweb.Annotation
 * @ClassName: ReflectPractiseUseAnnotation
 * @Author: XueXue-Li
 * @Description: 利用注解简化反射操作
 * @Date: 2021/5/10 19:20
 * @Version: 1.0
 */
@MyAnnotation(className = "cn.itcast.dayweb.Annotation.Person",methodName = "eat")
public class ReflectPractiseUseAnnotation {
    public static void main(String[] args) throws Exception{
        //获取ReflectPractiseUseAnnotation的Class对象
        Class<ReflectPractiseUseAnnotation> clsRef = ReflectPractiseUseAnnotation.class;
        //获取注解这行代码其实就是在内存中生成了注解接口的实现类对象
        MyAnnotation annotation = clsRef.getAnnotation(MyAnnotation.class);

        //获取类名和方法名
        String className = annotation.className();
        String methodName = annotation.methodName();
        //获取类

        Class cls = Class.forName(className);

        //使用cls创建对象
        Constructor constructor = cls.getConstructor();
        constructor.setAccessible(true);
        Object obj = constructor.newInstance();

        //使用cls获取方法
        Method method = cls.getMethod(methodName);
        method.setAccessible(true);
        method.invoke(obj);

    }
}
