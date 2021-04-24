package cn.itcast.dayweb.demo01.demo04StringBuffer;

/*
* java.lang.StringBuilder字符串的缓冲区
* */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        stringBuilderLearning();
        stringBuilderAppend();
    }

    //参数的构造方法
    public static void stringBuilderLearning(){
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.capacity());//出事容量为16

        StringBuilder stringBuilderCapacity = new StringBuilder(17);
        System.out.println(stringBuilderCapacity.capacity());//指定容量的构造方法17

        StringBuilder stringBuilderStr = new StringBuilder("ABD");
        System.out.println(stringBuilderStr.toString() + stringBuilderStr.capacity());//ABD19
    }

    //成员方法append()可以添加任意类型，返回的是对象自身this
    public static void stringBuilderAppend(){
        System.out.println("=================");
        StringBuilder stringBuilderStr = new StringBuilder("ABD");
        StringBuilder stringBuilderStr2 = stringBuilderStr.append(2.09);//ABD2.09
        System.out.println(stringBuilderStr);//ABD2.09
        System.out.println(stringBuilderStr2);//ABD2.09
        System.out.println(stringBuilderStr == stringBuilderStr2);//true两个对象是同一个对象

        //因为返回的对象就是this所以可以链式编程
        stringBuilderStr.append(19).append("abs").append('中');
        System.out.println(stringBuilderStr);//ABD2.0919abs中
    }
}
