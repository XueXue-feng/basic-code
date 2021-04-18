package cn.itcast.day04.demo09;

/**
在继承关系中，父子类构造方法的访问特点：
 1.子类构造方法中有一个默认隐含的super();调用,什么都不写则默认调用，先执行的父类构造
 2.可以通过super关键字子类调用父类重载的构造方法。
 3.[super的父类重载调用，必须是子类构造方法的第一个语句]
 4.子类必须调用父类构造刚发，不写则赠送super()，写则用写的
*
 */
public class Demo02Constructor {
    public static void main(String[] args) {
        /**父类无参构造方法执行了
        子类无参构造方法执行了
         先打印父类构造方法，在打印子类的构造方法
         */
        Zi zi = new Zi();
    }
}
