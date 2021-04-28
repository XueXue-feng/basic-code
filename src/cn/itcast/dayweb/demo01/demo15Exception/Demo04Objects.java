package cn.itcast.dayweb.demo01.demo15Exception;

import java.util.Objects;

/*
*
* */
public class Demo04Objects {
    public static void main(String[] args) {
        method1(null);
    }

    public static void method1(Object obj){
        /*if(obj == null){
            throw  new NullPointerException("传递的参数为null");
        }*/
        //Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"传递的参数为null");
    }
}
