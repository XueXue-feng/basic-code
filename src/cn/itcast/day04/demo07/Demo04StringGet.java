package cn.itcast.day04.demo07;

/*
*String当中与获取相关的方法：
* public int length(){}//获取字符串当中含有的字符个数
* Public String concat(String str){};//将当前字符串和参数字符串拼接成一个新字符串
* public char charAt(int index){}//获取指定索引位置的字符，索引从0开始
* public int indexOF(String str){}//查找参数字符串在本字符串中首次出现的位置，如果没有则返回-1
* */
public class Demo04StringGet {
    public static void main(String[] args) {
        String str1 = "Hello,World";
        System.out.println(str1.length());//11

        System.out.println(str1.concat("!!!"));
        System.out.println(str1);

        System.out.println(str1.charAt(7));

        System.out.println(str1.indexOf("or"));

    }
}
