package cn.itcast.dayweb.Annotation;

/**
 * @ProjectName: basic-code
 * @Package: cn.itcast.dayweb.Annotation
 * @ClassName: Demo03Annotation
 * @Author: XueXue-Li
 * @Description: 自定义注解
 * @Date: 2021/5/10 17:22
 * @Version: 1.0
 *
 * javap MyAnnotation.class反编译注解本质上就是一个接口该接口默认继承java.lang.annotation.Annotation
 * 自定义注解：格式
 * 元注解
 * public @interface 注解名称{属性列表};
 * public interface MyAnnotation extends java.lang.annotation.Annotation {}
 * 本质上就是一个接口，接口中可以定义什么，在注解接口中就可以定义什么，
 * 属性：在接口中定义的变量和抽象方法
 * 要求：1.方法属性的返回值类型：1.基本数据类型 2.字符串 3.枚举 4.注解 5.以上类型的数组
 * 2.在使用属性时需要给属性赋值,1.如果定义属性时使用default给属性初始化值则不用赋值了
 * 2.如果注解中只有一个属性而且名字叫做value则value可以省略直接定义值即可数组赋值时候，值需要用{}包裹，如果
 * 数组只有一个元素，则{}可以省略
 *
 * 元注解：用于描述注解的注解
 * @Target: 用于描述注解能够作用的范围。方法上还是类上还是等等
 * @Documented: 用于描述注解是否可以被抽取到API中
 * @Retention: 描述注解能够被保存的阶段，源码，Class阶段，Runtime阶段
 * @Inherited: 描述注解是否能被继承
 */
public @interface Demo03Annotation {
    public abstract String show();//在使用的时候需要给show赋值@Demo03Annotation(show = "string")
    //不允许定义返回值类型为void类型
    //void show02();
     public abstract int age() default 12;//不定义值则默认12

}
