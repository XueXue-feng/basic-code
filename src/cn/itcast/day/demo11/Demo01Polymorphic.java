package cn.itcast.day.demo11;

/*
*代码当中体现多态性，就是父类引用指向子类对象
* 格式：父类名称 对象名 = new 子类名称();左父右子
* 或者：接口名称 对象名 = new 实现类名称();左父右子
*
* 访问成员变量的两种方法：
* 1.直接通过对象名访问成员变量，看等号左边是谁就优先调用谁，没有则向上寻找
* 2.间接通过成员方法访问成员变量，就要看方法属于谁，就优先用谁，没有则向上找
* */
public class Demo01Polymorphic {
    public static void main(String[] args) {
        //多态写法,左侧父类的引用指向了右侧子类的对象
        Fu fu = new Zi();
        fu.method();//右边new谁就运行谁，如果没有则向上寻找
        fu.methodFu();//我是父类特有的方法
        System.out.println(fu.num);//30 等号左边是谁就优先调用谁，没有则向上寻找
        //fu.showNum();//30,该方法属于父类，子类没有覆盖重写
        fu.showNum();//20子类进行了覆盖重写，就优先谁new的用谁

    }
}
