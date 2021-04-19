package cn.itcast.day.demo08;

/*
*在继承的关系中，“子类就是一个父类”，也可以说子类可以当作父类看待
* 例如父类是员工，子类是讲师类，“讲师就是一个员工” is-a
* 定义父类的格式（就是一个普通类）
* public class 父类名称{方法体}
* 定义一个子类的格式
* public class 子类名称 extends 父类名称{}
* */
public class Demo04Extends {
    public static void main(String[] args) {
        //Teacher虽然什么都没写，但是会继承父类的method()方法
        Teacher teacher = new Teacher();
        teacher.method();

        //定义了员工的另一个子类，也会继承父类的method()方法，达到了代码复用的效果
        Assistant assistant = new Assistant();
        assistant.method();;
    }

}
