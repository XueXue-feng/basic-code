package cn.itcast.dayweb.demo01.demo04StringBuffer;

/*
* String和StringBuilder互相转换：
*   String-->StringBuilder可以使用StringBuilder的有参构造方法
*   StringBuilder-->String可以使用StringBuilder的toString()方法
* */
public class Demo03StringBuilder {
    public static void main(String[] args) {
        //String-->StringBuilder
        String str = "Hello World";
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder);//Hello World

        //StringBuilder-->String
        String str2 = stringBuilder.toString();
        System.out.println(str2);//Hello World
    }
}
