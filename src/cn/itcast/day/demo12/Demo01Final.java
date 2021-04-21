package cn.itcast.day.demo12;

/*
* final关键字代表最终的，不可改变的
* 四种用法：
* 1.final用来修饰类
* 2.final用来修饰方法
* 3.final用来修饰局部变量
* 4.final用来修饰成员变量
* */
public class Demo01Final {
    public static void main(String[] args) {
        //一旦使用final关键字修饰局部变量，一次赋值终身使用
        final int num = 10;
        //正确写法，只要保证只有唯一一次赋值即可
        final int num2;
        num2 = 20;
        System.out.println("============");
        //不可变：对于基本数据类型来说，不可变指的是变量当中的数值不可改变
        //对于引用数据类型来说，不可变指的得是地址值不变
        final Student student = new Student("赵丽颖");
        student.setName("高圆圆");//地址值不变，但是内容可以变化
        System.out.println(student.getName());
       // student = new Student("赵又廷");错误写法~~~final变量修饰局部变量地址值不可变
        System.out.println("============");
        Teacher teacher = new Teacher("爸爸");
        System.out.println(teacher.getName());
    }
}
