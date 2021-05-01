package cn.itcast.dayweb.demo.day02Data;

import java.util.Date;

/*
* java.util.Date表示日期和时间的类，精确到毫秒 1000 ms = 1s
* 毫秒值的左右：可以对时间和日期进行计算
* 2014-09-21 到 2099-04-30一共有多少天，可以把日期转换为毫秒进行计算。计算完毕再把毫秒转换为日期
* 1.日期-->毫秒：当前的日期：2021-04-21 16：25：50
* 时间的原点：1970 年 1 月 1 日 00:00:00表示0毫秒
* 注意：中国属于东八区 时间应该是：1970 年 1 月 1 日 08:00:00表示0毫秒
* 就是计算当前日期到时间原点之间经历了多少时间
* 2.把毫秒-->日期 1 天 = 24 × 60 × 60 = 86400 * 1000 = 86400,000毫秒
*
 * */
public class Demo01Date {
    public static void main(String[] args) {
        //1618993665683Long类型
        System.out.println(System.currentTimeMillis());//获取当前系统到1970 年 1 月 1 日 00:00:00
        dateExp1();
        dateExp2();
        dateExp3();
    }

    /*
    * Date类的空参数构造方法：分配 Date 对象并初始化此对象，以表示分配它的时间（精确到毫秒）。
    * 当前系统的日期和时间
    * */
    public static void dateExp1(){
        Date date = new Date();
        System.out.println(date);//Wed Apr 21 16:35:34 CST 2021
    }

    /*
    * Date(long date)传递毫秒-->日期
          分配 Date 对象并初始化此对象，以表示自从标准基准时间
          * （称为“历元（epoch）”，即 1970 年 1 月 1 日 00:00:00 GMT）以来的指定毫秒数
    * */
    public static void dateExp2(){
        Date date = new Date(0L);
        System.out.println(date);//Thu Jan 01 08:00:00 CST 1970东八区
    }

    /**
     * Date的成员方法
     * getTime() 返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
     *相当于System.currentTimeMillis()
     */
    public static void dateExp3(){
        Date date = new Date();
        System.out.println(date.getTime());//1618994911190
    }
}
