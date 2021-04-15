package cn.itcast.day04.demo05;

public class Demo06Person {

    public static void main(String[] args) {
        Person person = new Person();
        //person.age = 18; 直接给private变量赋值错误
        person.setAge(-18);
        //person.name = "小米";
        person.setName("小米");
        person.show();
    }


}
