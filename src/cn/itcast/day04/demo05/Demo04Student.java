package cn.itcast.day04.demo05;

public class Demo04Student {
    public static void main(String[] args) {
        Student student = method();
        System.out.println(student.name);
    }

    public static Student method(){
        Student student = new Student();
        student.age = 17;
        student.name = "小明";
        student.eat();
        return  student;

    }
}
