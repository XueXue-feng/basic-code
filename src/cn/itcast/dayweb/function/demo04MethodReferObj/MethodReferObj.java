package cn.itcast.dayweb.function.demo04MethodReferObj;

import java.util.Locale;

/*
*
* */
public class MethodReferObj {
    //定义一个方法把传递的字符串变成大写输出
    public void printToUpper(String str){
        System.out.println(str.toUpperCase(Locale.ROOT));
    }
}
