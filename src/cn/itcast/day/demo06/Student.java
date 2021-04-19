package cn.itcast.day.demo06;

/*
* 构造方法是专门用来创建对象的方法，当我们通过关键字new来创建对象的时候，其实就是在调用构造方法
* 格式：
* public 类名(参数类型 参数名){
*  方法体；
*  }
* 1、构造方法的名称必须和类的名称一样大小写也要保持一样
* 2.构造方法不要写返回值类型连void也不写
* 3.构造方法不能return一个返回值
* 4.如果没有编写任何构造方法，那么编译器将会默认构造一个构造参数,没有参数，没有方法体
* public Student(){}
* 5.一旦编写了至少一个构造方法，那么编译器将不会赠送
*构造方法也是可以进行重载的，
* 重载：方法名称相同，参数列表不同
* */
public class Student {
    //成员变量
    private String name;
    private int age;
    //无参构造方法
    public Student(){
        System.out.println("无参构造方法执行了！");
    }
    //全参构造方法
    //  可以直接对student进行赋值不用使用getter/setter方法了
    public Student(String name, int age){
       this.name = name;
       this.age = age;
        System.out.println("有参构造方法执行了！");
    }
    //Getter、Setter方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
