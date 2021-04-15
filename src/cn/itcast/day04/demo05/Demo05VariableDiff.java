package cn.itcast.day04.demo05;

/*
* 局部变量和全局变量的区别：
* 1.定义的位置不一样，局部变量在方法的内部，成员变量在类中
* 2.作用域不一样，局部变量只有在方法中才能使用，成员变量整个类都可以通用
* 3.默认值不一样，局部变量没有默认值只有手动赋值才能使用，成员变量有默认值
*4.内存的位置不一样，局部变量位于站内存，成员变量在堆内存中
* 5.生命周期不一样：局部变量随着方法进栈诞生，随着方法出栈为消失，成员变量随着对象创建而诞生，随着垃圾回收而消失
* */
public class Demo05VariableDiff {
    String name;//成员变量

    public void methodA() {
        int age;//局部变量
        System.out.println(name);//成员变量在类中都可以使用
    }
    public void methodB(int param) {//方法的参数是局部变量
        //参数在调用的时候必然会被赋值的
        System.out.println(param);
        int num;//局部变量
        System.out.println(name);
    }
}
