package cn.itcast.day.demo07;

/*
* 从一个大字符串中截取一个新的小字符串出来
* public String subString(int index){}//截取从参数位置一直到字符串末尾，返回值新字符串
* */
public class Demo05SubString {
    public static void main(String[] args) {
        String str = "Hello,World!I love you";
        String subString = str.substring(5);
        //截取开始到末尾，原字符串不变，返回一个新字符串
        System.out.println(subString);
        //截取一个范围包含左边不包含右边
        String subString2 = str.substring(7,10);//orl
        System.out.println(subString2);

        /*
        * 下面这种情况strA的内容仍没有发生变化，前后的地址值发生了变化，""相当于新new的字符串
        * 变化的是strA的地址值
        * */
        String strA = "Hello";
        System.out.println(strA);//Hello
        strA = "Java";
        System.out.println(strA);//Java

        String strB = "How do you do";
        String strC = strB.replace('o','*');
        System.out.println(strC);

    }
}
