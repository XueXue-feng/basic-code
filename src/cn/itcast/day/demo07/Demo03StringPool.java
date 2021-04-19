package cn.itcast.day.demo07;

/*
*字符串常量池：程序中直接用双引号写上的就在字符串常量池中，在堆中
*       对于基本数据类型来说是数值的比较
*       引用数据类型是对其地址值的比较
* 注意：对于引用数据类型对其地址值的比较，双引号直接写的在常量池中，new的不在
* */
public class Demo03StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        //自己new String不在常量池中
        char[] array = new char[]{'a','b','c'};
        String str3 = new String(array);

        System.out.println(str1 == str2);//true
        System.out.println(str2 == str3);//false
        System.out.println(str1 == str3);//false
    }
}
