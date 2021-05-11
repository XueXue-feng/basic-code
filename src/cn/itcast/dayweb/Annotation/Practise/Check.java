package cn.itcast.dayweb.Annotation.Practise;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ProjectName: basic-code
 * @Package: cn.itcast.dayweb.Annotation.Practise
 * @ClassName: Check
 * @Author: XueXue-Li
 * @Description: 测试注解
 * @Date: 2021/5/10 21:12
 * @Version: 1.0
 *
 * 小结：大多数的时候会使用注解而不是定义注解，
 * 注解给谁用：编译器，解析程序用
 * 注解不是程序的一部分，可以理解为一个标签
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Check {
}
