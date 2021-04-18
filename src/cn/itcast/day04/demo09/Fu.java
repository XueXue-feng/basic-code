package cn.itcast.day04.demo09;

public class Fu {
    int num = 10;
    public void methodFu(){
        System.out.println("父类方法执行了");
    }
    public Object method(){
        int num = 30;
        //System.out.println(num);//30,局部变量
        //System.out.println(this.num);//20本类的而成员变量
        //System.out.println(super.num);//10父类的成员变量
        System.out.println("父类重名方法执行了");
        return null;
    }
    public Fu(){
        System.out.println("父类无参构造方法执行了");
    }
    public Fu(int num){
        System.out.println("父类有参构造方法执行了");
    }
}
