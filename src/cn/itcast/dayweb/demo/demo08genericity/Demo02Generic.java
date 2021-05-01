package cn.itcast.dayweb.demo.demo08genericity;

/*
* 定义一个含有泛型的类，泛型可以接收任意数据类型Integer,String....
* 在创建对象的时候确定泛型的类型
* 含有泛型的接口的第一种实现方法：定义接口的实现类指定泛型
* Scanner类实现了Iterator接口并指定了泛型为String
* 第二种实现方法：在实现类中依旧使用泛型，在创建对象的时候指定泛型
* */
public class Demo02Generic<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
