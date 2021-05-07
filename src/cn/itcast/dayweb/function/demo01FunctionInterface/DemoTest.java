package cn.itcast.dayweb.function.demo01FunctionInterface;

/*
 * 函数式接口的使用，一般可以作为参数的返回值和参数
 * */
public class DemoTest {
    public static void main(String[] args) {
        //使用匿名内部类
        show01(new MyFunctionInterface() {
            @Override
            public void method() {
                System.out.println("我是匿名内部类重写接口中的抽象方法");
            }
        });

        //方法的参数是一个函数式接口所以可以使用Lambda表达式
        show01(() ->
                System.out.println("我是Lambda表达式实现的抽象方法")
        );

    }

    public static void show01(MyFunctionInterface myInter) {
        myInter.method();
    }

}
