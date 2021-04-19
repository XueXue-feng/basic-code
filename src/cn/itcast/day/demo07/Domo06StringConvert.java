package cn.itcast.day.demo07;

import java.nio.charset.StandardCharsets;

/*
*String当中与转换想换二点方法：
* 1.public char[] toCharArray(String str):将当前字符串转换成字符数值
* 2.public char[] getBytes(String str):获得当前字符串底层字节数值
* 3.public String replace(CharSequence oldString,CharSequence newString):
* 将所有出现的老字符串替换成新的字符串
* PS:CharSequence 可以接收字符串类型
* */
public class Domo06StringConvert {
    public static void main(String[] args) {
        String str = "Hello";
        char[] charArray = str.toCharArray();
        System.out.println(charArray.length);
        System.out.println(charArray[0]);

        //转换成字节数组
        byte[] byteArray = "ABC".getBytes(StandardCharsets.UTF_8);
        //System.out.println(byteArray[0]);
        for (int i = 0; i < byteArray.length; i++) {
            System.out.println(byteArray[i]);
        }

        //
    }
}
