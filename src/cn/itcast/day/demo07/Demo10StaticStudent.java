package cn.itcast.day.demo07;

public class Demo10StaticStudent {
    public static void main(String[] args) {
        Student.room = "北京101教室";

        Student one = new Student("郭靖",20);
        System.out.println("one的姓名是：" + one.getName());
        System.out.println("one的年龄是：" + one.getAge());
        System.out.println("one的教室是：" + Student.room);
        Student two = new Student("黄蓉",18);
        System.out.println("two的姓名是：" + two.getName());
        System.out.println("two的年龄是：" + two.getAge());
        System.out.println("two的教室是：" + Student.room);
    }
}
