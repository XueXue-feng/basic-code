package cn.itcast.dayweb.function.demo02Lambda;

import java.util.function.Supplier;

/*
常用的函数式接口，
* java.util.Function.Supplier函数式接口，生产型接口
接口仅包含一个无参的方法get,用来获取一个泛型参数指定类型的数据对象
指定接口的泛型是什么类型，get方法就会生产什么类型的数据
* */
public class Demo04Supplier {
    public static void main(String[] args) {
        //方法的参数是函数式接口所以可以使用Lambda表达式
        String str = getString(new Supplier<String>() {
            @Override
            public String get() {
                return "刘亦菲";
            }
        });
        System.out.println(str);

    }
    public static String getString(Supplier<String> sup){
        return sup.get();
    }
}
