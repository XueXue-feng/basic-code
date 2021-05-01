package cn.itcast.dayweb.demo.demo15Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* java.lang.Throwable类是java语言所有村务或者是异常的超类
* Exception:编译期异常RunTimeException运行期异常--java运行期间出现的异常
* Error:错误
* */
public class Demo01Exception {
    public static void main(String[] args) /*throws ParseException*/ {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parse = sdf.parse("2021-0421");
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
