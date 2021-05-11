package cn.itcast.dayweb.reflect.deman;

public class Student {
    private String name;

    //创建成员方法
    void eat(){
        System.out.println("我是学生我会吃");
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }
}
