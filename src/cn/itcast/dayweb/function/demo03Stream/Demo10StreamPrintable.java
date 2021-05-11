package cn.itcast.dayweb.function.demo03Stream;

/*
* 双冒号::被称之为引用运算符，所在的表达式被称之为方法的引用
* */
public class Demo10StreamPrintable {
    public static void main(String[] args) {
        print((str)->{
            System.out.println(str);
        });
        print(System.out::println);//Hello World
    }

    public static void print(Printable p){
        p.printString("Hello World");
    }
    /*
    * Lambda表达式的目的就是把参数str打印输出
    * 把参数s传递给了System.out对象S，然后再调用out方法中的println()方法打印输出
    * 注意：1.System.out对象和println()方法都是存在的，我们可以使用方法的引用来优化Lambda表达式，
    * 我们可以直接用System.out对象来引用（调用）println()方法
    * */

}
