package cn.itcast.dayweb.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ProjectName: basic-code
 * @Package: cn.itcast.dayweb.Annotation
 * @ClassName: MyAnnotation
 * @Author: XueXue-Li
 * @Description: 自定义注解
 * @Date: 2021/5/10 19:21
 * @Version: 1.0
 */
@Target(ElementType.TYPE)//表示这个注解可以被作用在类上
@Retention(RetentionPolicy.RUNTIME)//可以被保留到运行阶段
public @interface MyAnnotation {
    String className();
    String methodName();
}
