package cn.itcast.dayweb.function.demo04MethodReferObj;

/*
* 通过对象名引用成员方法
* 前提：对象名和成员方法都是存在的
* */
public class Test {
    public static void main(String[] args) {
        printStr((String s)->{
            //创建MethodReferObj对象
            MethodReferObj mro = new MethodReferObj();
            mro.printToUpper(s);//HELLO WORLD
        });

        /*
        * 可以使用对象名引用方法来优化Lambda表达式
        * */
        //创建MethodReferObj对象
        MethodReferObj mro = new MethodReferObj();
        printStr(mro::printToUpper);
    }

    //参数是一个函数式接口可以使用Lambda
    public static void printStr(Printable p){
        p.printStr("Hello World");
    }

}
