package cn.itcast.dayweb.demo01.day02Data;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
* 计算一个人活了多少天
* */
public class DatePractise {
    public static void main(String[] args) throws ParseException{
       String str = systemPrint();
        datePassing(str);
    }

    //该方法为输入一个人的出生日期，输出活了多少天
    public static long datePassing(String date) throws ParseException {
        //将字符串换算成日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dateParse = sdf.parse(date);
        //将日期转换成毫秒值
        long millionSeconds1 = dateParse.getTime();
        long millionSeconds2 = System.currentTimeMillis();
        //天数为：
        long day = (millionSeconds2 - millionSeconds1) / (1000 * 60 * 60 * 24);
        System.out.println(day);
        return day;
    }
    //获取从键盘输入的字符串
    public static String systemPrint(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入出生日期，格式为yyyy-MM-dd HH:mm:ss :");
        String str = scanner.nextLine();
        return str;
    }
}
