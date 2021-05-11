package cn.itcast.dayweb.reflect.deman;

public class Person {
    private String name;
    private int age;
    public String str;

    //定义成员方法
    public void sleep(){
        System.out.println("我是人类我需要睡觉");
    }

    public void eat(String foodName){
        System.out.println("我是人类我需要吃饭饭" + foodName);
    }
    public static void methodStatic(){
        System.out.println("我是静态方法");
    }
    void methodDefault(){
        System.out.println("我是默认方法");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", str='" + str + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}
