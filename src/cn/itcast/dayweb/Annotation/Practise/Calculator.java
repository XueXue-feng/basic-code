package cn.itcast.dayweb.Annotation.Practise;

/**
 * @ProjectName: basic-code
 * @Package: cn.itcast.dayweb.Annotation.Practise
 * @ClassName: Calculator
 * @Author: XueXue-Li
 * @Description: 小明自定义的计算机类
 * @Date: 2021/5/10 21:08
 * @Version: 1.0
 */
public class Calculator {
    //加法
    @Check
    public void add(){
        String str = null;
        str.toString();
        System.out.println("1 + 2 = " +  (1 + 2));
    }

    //减法
    @Check
    public void sub(){
        System.out.println("1 - 2 = " +  (1 - 2));
    }

    //乘法
    @Check
    public void mul(){
        System.out.println("1 * 2 = " +  (1 * 2));
    }

    //除法
    @Check
    public void div(){
        System.out.println("1 / 0 = " +  (1 / 0));
    }

    public void show(){
        System.out.println("永远不会出现Bug的代码");
    }
}
