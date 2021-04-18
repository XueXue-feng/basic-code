package cn.itcast.day04.demo09;

/*
* super的关键字用法：
* 1.在子类的成员方法中访问父类的成员变量
* 2.在子类的成员方法中访问父类的成员方法
* 3.在子类的构造方法中访问父类的构造方法
* */
public class Zi extends Fu {
    int num = 20;

    //方法的覆盖重写发生了
    @Override//注解,安全检查的手段
    public Object method() {
        int num = 30;
        /*System.out.println(num);//30,局部变量
        System.out.println(this.num);//20本类的而成员变量
        System.out.println(super.num);//10父类的成员变量*/
        System.out.println("子类重名方法执行了");
        return null;
    }

    public void methodZi() {
        System.out.println("子类方法执行了");
    }
    public Zi(){
        //通过super来调用父类重载的构造方法
        super(100);
        System.out.println("子类无参构造方法执行了");
    }
}
