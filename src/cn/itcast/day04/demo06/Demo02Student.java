package cn.itcast.day04.demo06;

public class Demo02Student {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student("小米" , 29);
        student.getAge();
        student.getName();
        student.setAge(17);
        student.setName("妈妈");
        System.out.println(student2.getName());
        System.out.println(student.getAge());

        //如果需要改变对象中成员变量的数据内容，就需要使用Setter方法
        student2.setName("小娜");
        System.out.println(student2.getName());
    }

}
