package cn.itcast.dayweb.demo.demo08genericity;

/*
* 含有泛型的方法：定义在修饰符合返回值类型之间
* 格式：修饰符 <E> 返回值类型 方法名(参数列表){}
* 在调用方法的时候确定泛型的类型
* */
public class GeneticMethod <M>{
    //可以使用任意字母
    public <M> void methodUseE(M m){
        System.out.println(m);
    }

    //定义含有泛型的静态方法
    public static <M> void staticMethodUseE(M m){
        System.out.println(m);
    }

    //定义含有泛型的静态代码块
    static{
            System.out.println("我是静态代码块");

    }
}
