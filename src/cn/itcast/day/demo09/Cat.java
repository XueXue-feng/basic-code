package cn.itcast.day.demo09;


public class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {

    }

    public Cat(){
        System.out.println("子类构造方法执行了");
    }
}
