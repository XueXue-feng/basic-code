package cn.itcast.day04.demo06;

/*
 * 一个标准的类通常要满足一下四个部分：
 * 1.成员变量：所有成员变量都要使用private关键字修饰
 * 2.成员方法：
 * 3.构造方法：有参数，全参数
 * Getter/Setter方法：获取成员变量
 *
 * 这样的标准类也叫做Java Bean
 * */
public class Teacher {

    private String name;
    private int age;

    public Teacher() {

    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
