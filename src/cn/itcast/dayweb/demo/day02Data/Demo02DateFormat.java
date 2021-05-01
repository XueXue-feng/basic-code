package cn.itcast.dayweb.demo.day02Data;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* java.text.Format.DataFormat是一个抽象类，直接实现类SimpleDateFormat
* 日期/时间格式化子类（如 SimpleDateFormat）允许进行格式化（也就是日期 -> 文本）、
* 解析（文本-> 日期）和标准化。
* 成员方法：String format(Date date) 将一个 Date 格式化为日期/时间字符串。
* Date parse(String source) 从给定字符串的开始解析文本，以生成一个日期。
* public SimpleDateFormat(String pattern)
参数：
pattern - 描述日期和时间格式的模式
 * */
public class Demo02DateFormat {
    public static void main(String[] args) throws ParseException {
        dateFormat();
        dateParse();
    }

    //DateFormat的format方法将一个 Date 格式化为日期/时间字符串
    public static void dateFormat(){
        String patten = "yyyy-MM-dd HH:mm:ss";
        //创建多态的DataFormat对象
        DateFormat date = new SimpleDateFormat(patten);
        String txt = date.format(System.currentTimeMillis());
        System.out.println(txt);
    }

    /*
    * public Date parse(String source) throws ParseException{...}
    * parse声明了一个ParseException解析异常，当字符串和构造方法中的模式不一样就会报此异常，
    * 如果调用了一个抛出异常的方法，那么这个方法也应该处理这个异常（要么抛出，要么try....catch处理）
    * */
    public static void dateParse() throws ParseException {
        String patten = "yyyy-MM-dd HH:mm:ss";
        //创建多态的DataFormat对象
        DateFormat date = new SimpleDateFormat(patten);
        Date parse = date.parse("2021-04-21 22:25:53");
        //Date parse = date.parse("Wed Apr 21 22:25:53 CST 2021");//ParseException
        System.out.println(parse);
    }
}
