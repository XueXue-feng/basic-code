package cn.itcast.day04.demo08;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
* java.util.Math 是与数学相关的工具类，里面提供了大量的与数学运算相关的静态方法
* public static double abs(double num){}//获取绝对值
* public static double ceil(double num){}//向上取整，12.1的ceil-->13
* public static double floor(double num){}//向下取整
* public static long round(double num){}//四舍五入
*
* //Math.PI(double)是近似的圆周率
* */
public class Demo02Math {
    public static void main(String[] args) {
        //获取绝对值,有多种重载
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(-2.4));

        //向上取整
        System.out.println(Math.ceil(3.0));

        //向下取整
        System.out.println(Math.floor(3.0009));

        //四舍五入
        System.out.println(Math.round(3.67));

        System.out.println(Math.PI);
    }
}
