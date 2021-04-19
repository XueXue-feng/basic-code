package cn.itcast.day.demo07;

/*
* java,lang,String代表字符串类，
* Java 程序中的所有字符串字面值（如 "abc" ）都作为此类的实例实现。
* 程序中所有的""都是String类的对象，无论new不要new
* 特点：
* 1.在java中字符串中的内容永不可变
* 2.正是因为字符串不可改变所以字符串可以共享使用
* 3.字符串效果上相当于char型数组，但是底层原理是byte[]字节数组
*
* 创建字符串的3+1中方式3中构造方法
* 1.public String(){}默认无参构造方法
* 2.pubLic String(char[] array){}//根据char型数组创建字符串
* 3.public String(byte[] array){}//根据byte型数组创建字符串
* 直接创建字符串
* 注意：不管new不new，都在堆里，都是字符串对象
*
* */
public class Demo01String {
    public static void main(String[] args) {
        //使用空参构造
        String str1 = new String();
        System.out.println("第一个字符串是" + str1);

        //根据char字符数组创建
        char[] arrayChar = new char[]{'A','B','C','D'};
        String str2 = new String(arrayChar);
        System.out.println("第二个字符串是" + str2);

        //根据byte型数组创建
        byte[] arrayByte = new byte[]{97,98,99};//a,b,c
        String str3 = new String(arrayByte);
        System.out.println("第三个字符串是" + str3);

        //直接创建
        String str4 = "A,B,C";
        System.out.println("第四个字符串是" + str4);
    }


}
