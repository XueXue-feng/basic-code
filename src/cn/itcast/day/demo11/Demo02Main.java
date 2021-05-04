package cn.itcast.day.demo11;

/*
* 子类向上转型为父类，一定是安全的，正确的，但是也有一定的弊端：对象一旦转型为父类就无法调用
* 子类原有的特有的方法
* 对象的向下转型：其实是一个还原的动作 格式：子类对象 子类名称 = (子类名称)父类对象 强制类型转换
* 含义：将父类对象还原为原本的子类对象
* */
public class Demo02Main {
    public static void main(String[] args) {
        //对象的向上转型
        Animal animal = new Cat();
        animal.eat();//猫吃鱼

        //对象的向下转型，进行还原动作
        Cat cat = (Cat)animal;
        cat.catchMouse();

        //Dog dog = (Dog)animal;//错误写法 本来是猫不能转换为狗 ClassCastException
        //dog.swimming();
    }
}
