package cn.itcast.dayweb.demo.demo05Package;

/*
* 基本数据类型和字符串之间的转换：
* int-->String:1.基本数据类型 + ""; 2.包装类中的toString() 3.使用String中的静态方法valueOf(int i)
* String-->int parseInt(String s)
* */
public class Demo03IntegerToString {
    public static void main(String[] args) {
        //int-->String
        String str1 = 12 + "";
        String str2 = Integer.toString(12);
        String str3 = String.valueOf(12);

        //String-->int
        int num = Integer.parseInt(str2);
        System.out.println(num);//12
    }
}
