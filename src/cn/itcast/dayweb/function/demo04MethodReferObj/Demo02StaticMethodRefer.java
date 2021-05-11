package cn.itcast.dayweb.function.demo04MethodReferObj;

/*
* 通过类名类引用静态方法，使用前提是类已经存在，静态方法也已经存在
* */
public class Demo02StaticMethodRefer {
    //定义一个方法，方法的参数传递整数和函数式接口
    public static int method(int num ,Calcable cal){
        return cal.calculateIntAbs(num);
    }

    public static void main(String[] args) {
        //调用method方法，参数传递一个整数和一个lambda表达式
        int a = method(-100,(int num)->{
            return Math.abs(num);
        });
        System.out.println(a);

        //通过方法的引用来优化Lambda表达式
        int method = method(-890, Math::abs);
        System.out.println(method);//890
    }



}
