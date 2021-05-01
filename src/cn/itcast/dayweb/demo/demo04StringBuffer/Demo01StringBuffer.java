package cn.itcast.dayweb.demo.demo04StringBuffer;

/*
* String类底层是一个被final修饰的常量，进行字符串的相加内存中就会产生多个字符串，
* 占用空间效率低下。
* StringBuilder:底层是一个数组但是没有被final修饰(看成是一个长度可以变化的数组),字符串缓冲区byte[] value长度为16
* StringBuilder在内存中始终是一个数组占用空间少，效率高，如果超出了StringBuilder的容量会自动扩容一倍
* */
public class Demo01StringBuffer {
    public static void main(String[] args) {
        //StringBuilder的reverse()方法可以翻转数组
        StringBuilder stringBuilder = new StringBuilder("hello java");
//        System.out.println(stringBuilder.reverse());//avaj olleh
    }
}
