package cn.itcast.day.demo12;

/*
* 对于成员变量来说，如果使用final关键字修饰，那么这个变量也是不可变的。
* 1.由于成员变量具有默认值，所以一旦使用final关键字修饰，就必须进行手动赋值。
* 2.对于final的成员变量，要么使用直接赋值，要么使用构造方法赋值。
* 3.必须保证类当中所以的重载的构造方法，都会对final修饰的成员变量赋值。
* */
public class Teacher {
    final private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher() {
        name = "鹿晗";
    }

    public String getName() {
        return name;
    }

}
