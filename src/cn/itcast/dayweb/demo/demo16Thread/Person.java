package cn.itcast.dayweb.demo.demo16Thread;

public class Person {
    private String name;
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println(name + i);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }
}
