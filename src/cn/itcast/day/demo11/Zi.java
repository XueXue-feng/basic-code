package cn.itcast.day.demo11;

public class Zi extends Fu{
    int num = 20;
    @Override
    public void method() {
        System.out.println("我是子类方法");
    }

    @Override
    public void showNum(){
        System.out.println(num);
    }

    public void methodZi(){
        System.out.println("我是子类特有的方法");
    }
}
