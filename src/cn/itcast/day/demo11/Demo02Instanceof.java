package cn.itcast.day.demo11;

/*
如何才能直到一个父类的引用对象，本来是什么子类？
格式：
* 父类对象 instanceof 子类
返回一个boolean对象，也就是判断前面的对象能不能转成后面的类
* */
public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal = new Cat();
        //向上转型只能调用子父类共有的方法
        animal.eat();//猫吃鱼
        //想要调用子类特有的方法只能向下转型
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.swimming();
        }
        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
