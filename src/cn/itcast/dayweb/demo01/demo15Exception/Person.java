package cn.itcast.dayweb.demo01.demo15Exception;

/*
 * 子父类的异常：1.如果父类抛出了多个异常，那么子类在重写父类方法的时候，抛出和父类相同的异常或者是父类异常的子类或者是不抛出异常
 * 2.如果父类方法没有抛出异常，子类重写该方法时也不可抛出异常，此时子类产生异常只能捕获处理，不可抛出
 * 注意：父类异常是什么样子类异常就是什么样
 * */
public class Person {
    public void show01() throws NullPointerException, ClassCastException {

    }

    public void show02() throws IndexOutOfBoundsException {
    }

    public void show03() throws IndexOutOfBoundsException {
    }

    public void show04() {
    }
}
