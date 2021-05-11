package cn.itcast.dayweb.function.demo04MethodReferObj;

public class Demo03Person {
    private String name;

    @Override
    public String toString() {
        return "Demo03Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Demo03Person(String name) {
        this.name = name;
    }

    public Demo03Person() {
    }
}
