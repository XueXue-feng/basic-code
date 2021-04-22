package cn.itcast.dayweb.demo01.day03Calendar;

import java.util.Calendar;

/*
* java.util.Calendar 日历类
* Calendar是一个抽象类，里面提供了很多操作日历的字段
* public static Calendar getInstance(Locale aLocale)
* 使用默认时区和指定语言环境获得一个日历。返回的 Calendar 基于当前时间，使用了默认时区和给定的语言环境。
* java.util.GregorianCalendar[time=1619080330093,areFieldsSet=true,areAllFieldsSet=true,
* lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,
* dstSavings=0,useDaylight=false,transitions=19,lastRule=null],firstDayOfWeek=1,
* minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=3,WEEK_OF_YEAR=17,WEEK_OF_MONTH=4,
* DAY_OF_MONTH=22,DAY_OF_YEAR=112,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=4,
* HOUR_OF_DAY=16,MINUTE=32,SECOND=10,MILLISECOND=93,ZONE_OFFSET=28800000,DST_OFFSET=0]
* */
public class Demo01Calendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();//多态写法：GregorianCalendar是Calendar的子类
        System.out.println(calendar);
    }
}
