package cn.itcast.day.demo11;

public class Fu {
    int num = 30;
    public void method(){
        System.out.println("我是父类方法");
    }
    public void methodFu(){
        System.out.println("我是父类特有的方法");
    }
    void showNum(){
        System.out.println(num);
    }
}
