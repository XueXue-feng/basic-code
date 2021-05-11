package cn.itcast.dayweb.function.demo04MethodReferObj;

public class Demo03Test {
    //定义一个方法调用函数式接口PersonBuilder
    public static void method(String name,Demo03PersonBuilder personBuilder){
        System.out.println(personBuilder.personBuilder(name).getName());
    }

    public static void main(String[] args) {
        method("迪丽热巴",(name)->{
            return new Demo03Person(name);
        });
        //使用方法引用来优化Lambda表达式
        /*
        * 构造方法一致Demo03Person
        * 构造对象new已知
        * */
        method("古力娜扎",Demo03Person::new);
    }
}
