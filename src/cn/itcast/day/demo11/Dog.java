package cn.itcast.day.demo11;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    public void swimming(){
        System.out.println("狗会游泳");
    }
}
