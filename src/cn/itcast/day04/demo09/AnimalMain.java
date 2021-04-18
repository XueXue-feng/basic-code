package cn.itcast.day04.demo09;

public class AnimalMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();  //抽象父类构造方法执行了
                    //子类构造方法执行了
                    // 猫吃鱼
        ErHaDog erHaDog = new ErHaDog();
        erHaDog.sleep();//public abstract void eat();
        erHaDog.eat();
    }
}
