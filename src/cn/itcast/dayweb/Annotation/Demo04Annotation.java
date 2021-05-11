package cn.itcast.dayweb.Annotation;

import java.lang.annotation.*;

/**
 * @ProjectName: basic-code
 * @Package: cn.itcast.dayweb.Annotation
 * @ClassName: Demo04Annotation
 * @Author: XueXue-Li
 * @Description:
 * @Date: 2021/5/10 18:50
 * @Version: 1.0
 *
 *  * 元注解：用于描述注解的注解
 *  * @Target: 用于描述注解能够作用的范围。方法上还是类上还是等等ElementType的取值TYPE类METHOD:方法FIELD：成员变量
 *  * @Documented: 用于描述注解是否可以被抽取到API中
 *  * @Retention: 描述注解能够被保存的阶段，源码，Class阶段，Runtime阶段
 *  * @Inherited: 描述注解是否能被继承
 *
 *  1.获取这届定义位置的对象class.method,filed.getAnnotation()
 *  2.利用返回的注解的对象获取其中的属性
 *  3.操作属性
 */
@Target(value = {ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})//表示该注解只能作用与类(接口)上,方法，成员变量
@Retention(RetentionPolicy.RUNTIME)//一般都写保留到运行时阶段保留到class文件并被JVM虚拟机读取到，如果是CLASS则不会被JVM读取到
@Documented//如何加上这个注解则不会被抽取到API文档中
@Inherited
public @interface Demo04Annotation {
    public abstract int show();
}
