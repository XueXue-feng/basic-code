package cn.itcast.day.demo05;

/*
* 当一个类的对象作为参数，传递到方法的时候，实际上传递的是对象的地址值；
* 任何数据类型都可以作为 g
* */
public class Demo03Student {
    public static void main(String[] args) {
        Student one = new Student();
        one.name = "小明";
        one.age = 18;
        method(one);//传递进去的是one的地址值
    }

    public static void method(Student student){
        System.out.println(student.age);
        System.out.println(student.name);
    }
}
