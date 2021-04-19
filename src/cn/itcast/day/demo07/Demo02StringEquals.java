package cn.itcast.day.demo07;

/*
*==是进行地址值的比较，内容比较public boolean equals(Object obj){};参数可以是任何对象
* 任何对象都可以用Object接收，只有参数是一个字符串并且内容相同才会返回true
* 注意事项：
* 1.equals具有对称性，a.equals =
* 2.如果比较对象一个常量一个变量，推介把常量写在前面
* 推介"abc".equals(str) 不推介str.equals("abc");
*
* public boolean equalsIgnoreCase(String str){}
* 忽略大小写
* * */
public class Demo02StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] array = new char[]{'H','e','l','l','o'};
        String str3 = new String(array);
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println(str2.equals(str3));//true
        System.out.println(str3.equals("Hello"));//true

        String str4 = "hello";
        System.out.println(str4.equals(str3));//false
        System.out.println(str4.equalsIgnoreCase(str2));//true

        String str5 = null;
        System.out.println("abc".equals(str5));//推介写法  false
        //System.out.println(str5.equals("abc"));//不推介写法 空指针异常
    }
}
