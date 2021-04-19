package cn.itcast.day.demo03;

/*
* 基本数据类型：byte,short,int,long,float,double,char,boolean
* 引用数据类型String
* 在调用输出语句的时候，pringln其实就是进行了多种方式的重载
* */
public class Demo04OverloadPrint {
    public static void main(String[] args) {
        myPrint(10.90);
        myPrint("Hello");
    }
    public static void myPrint(byte num){
        System.out.println(num);
    }
    public static void myPrint(short num){
        System.out.println(num);
    }
    public static void myPrint(int num){
        System.out.println(num);
    }
    public static void myPrint(long num){
        System.out.println(num);
    }
    public static void myPrint(float num){
        System.out.println(num);
    }
    public static void myPrint(double num){
        System.out.println(num);
    }
    public static void myPrint(char num){
        System.out.println(num);
    }
    public static void myPrint(boolean isTrue){
        System.out.println(isTrue);
    }
    public static void myPrint(String str){
        System.out.println(str);
    }
}
