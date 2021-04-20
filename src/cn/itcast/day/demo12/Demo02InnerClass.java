package cn.itcast.day.demo12;

public class Demo02InnerClass {
    public static void main(String[] args) {
        Outer.Inner outer = new Outer().new Inner();
        outer.method();
    }
}
