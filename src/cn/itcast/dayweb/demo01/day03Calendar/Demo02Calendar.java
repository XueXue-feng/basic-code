package cn.itcast.dayweb.demo01.day03Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

/*
* 日历类的字段：int field 可以使用Calendar类的静态成员变量
*     public static final int YEAR = 1;
    * public static final int MONTH = 2;
    * public static final int DATE = 5;
    * public static final int DAY_OF_MONTH = 5;
    * public static final int HOUR = 10;
    *  public static final int MINUTE = 12;
    * public static final int SECOND = 13;
* */
public class Demo02Calendar {
    public static void main(String[] args) {
        //getCalendar();
        setCalendar();
    }

    /*
    * public int get(int field){...}
    * 参数传递的是静态成员变量YEAR,MOUTH
    * 返回值：日历字段代表的具体的值
    * */
    public static void getCalendar(){
        //YEAR
        int year = Calendar.getInstance().get(Calendar.YEAR);//2021
        System.out.println(year);

        //MOUTH西方的日历为0~11月换算成中国的要加1
        int mouth = Calendar.getInstance().get(Calendar.MONTH) + 1;//3
        System.out.println(mouth);

        //DAY
        int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);//22
        System.out.println(day);

        //HOUR
        int hour = Calendar.getInstance().get(Calendar.HOUR);//6
        System.out.println(hour);

        //MINUTE
        int minute = Calendar.getInstance().get(Calendar.MINUTE);//56
        System.out.println(minute);

        //SECOND
        int second = Calendar.getInstance().get(Calendar.SECOND);//52
        System.out.println(second);
    }

    //将给定日历字段设置
    public static void setCalendar(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,2021);

        //打印年月日
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);//2021年

        //add方法给指定的字段加想要的值
        calendar.add(Calendar.YEAR,89);

        int year1 = calendar.get(Calendar.YEAR);
        System.out.println(year1);//2021年

    }


}
