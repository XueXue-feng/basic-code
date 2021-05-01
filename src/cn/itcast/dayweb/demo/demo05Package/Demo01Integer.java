package cn.itcast.dayweb.demo.demo05Package;

/*
* 装箱：把基本数据类型转换为包装类 1.构造方法（已过时）2.Integer.valueOf()方法
* 拆箱：把包装类转换为基本数据类型，在包装类中取出基本数据类型 1.intValue()
* */
public class Demo01Integer {
    public static void main(String[] args) {
        integerPackage(90);
        integerDevan(Integer.valueOf("1235"));//1235
    }

    //装箱
    public static void integerPackage(int num){
        Integer integerNum = Integer.valueOf(num);
        System.out.println(integerNum);//90

        Integer integerStr = Integer.valueOf("1234");
        System.out.println(integerStr);//1234
    }
    //拆箱
    public static void integerDevan(Integer integer){
        System.out.println("================");
        int num = integer.intValue();
        System.out.println(num);
    }
}
