package cn.itcast.day04.demo09;

/*
* super的关键字用法：
* 1.在子类的成员方法中访问父类的成员变量
* 2.在子类的成员方法中访问父类的成员方法
* 3.在子类的构造方法中访问父类的构造方法
*
* super关键字用来访问父类的内容，而this关键字访问本类的内容
* this关键字的用法：
* 1.在本类的成员方法中，访问本类的成员变量
* 2.在本类的成员方法中访问本类的另一个成员方法
* 3.在本类的构造方法中访问本类中另一个构造方法,也必须是第一个语句
* super和this两种构造调用不能同时使用，因为都必须是唯一的第一行。
* */
public class Zi extends Fu {
    int num = 20;

    //方法的覆盖重写发生了
    @Override//注解,安全检查的手段
    public Object method() {
        int num = 30;
        /**System.out.println(num);//30,局部变量
        System.out.println(this.num);//20本类的而成员变量
        System.out.println(super.num);//10父类的成员变量*/
        System.out.println("子类重名方法执行了");
        return null;
    }

    public void methodZi() {
        System.out.println("子类方法执行了");
    }
    public Zi(){
        this(100);
        System.out.println("子类无参构造方法执行了");
    }
    public Zi(int num){
        //通过super来调用父类重载的构造方法
        super(100);
        System.out.println("子类有参构造方法执行了");
    }

    public void methodA(){
        System.out.println("AAA");
    }
    public void methodB(){
        this.methodA();;
        System.out.println("BBB");
    }
}
