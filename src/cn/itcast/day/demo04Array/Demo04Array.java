package cn.itcast.day.demo04Array;

/*
* 数组：和变量差不多，是一种容器可以同时存放多个数据值
* 特点：
* 1.是一种引用数据类型
* 2.多个数据类型必须统一
* 3.数组的长度在程序运行期间不可改变
*
* 数组的初始化：在内存中创建一种数组，并向其赋予一些内容
* 动态初始化：只指定数组的长度 格式：数据类型[] 数组名 = new 数据类型[数组长度]
* 静态初始化：指定内容
*
* 含义解析：
* 数据类型：数组中保存的数据都是什么类型的
* [],表示他是一个数组，为其在内存中开辟一定的空间
* 数组名
* new:代表创建数组的动作
* 数据类型：必须和左侧的数据类型相同
* 数组长度：int类型
* */
public class Demo04Array {
    public static void main(String[] args) {
        int score1 = 90;
        int score2 = 100;
        int score3 = 70;
        System.out.println(score1);
        score1 = 39;
        System.out.println(score1);
        //创建一个数组能存放10个int类型的数据
        int[] score = new int[10];
        //创建一个数组能存放10个double类型的数据
        double[] arrayB = new double[10];
        //创建一个数组能存放5个字符串
        String[] arrayC = new String[5];
    }
}
