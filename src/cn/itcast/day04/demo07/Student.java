package cn.itcast.day04.demo07;

public class Student {
    private int id;//学号
    private  String name;//学生的姓名
    private  int age;//学生年龄
    static String room;//所在教室
    static private int idCounter = 1;//学号计数器
    //无参构造
    public Student(){
        this.id = idCounter++;
    }

    //全参构造
    public Student(String name,int age){
        this.name = name;
        this.age = age;
        this.id = idCounter++;
    }
    //name的Setter方法
    public void setName(String name){
        this.name = name;
    }
    //name的Getter方法
    public String getName(){
        return name;
    }
    //age的Setter方法
    public void setAge(int age){
        this.age = age;
    }
    //age的Getter方法
    public int getAge(){
        return age;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
