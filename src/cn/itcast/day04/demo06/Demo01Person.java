package cn.itcast.day04.demo06;

public class Demo01Person {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);//@75412c2f
        person.name = "王健林";
        person.sayHello("王思聪");
    }
}
