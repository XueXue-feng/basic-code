package cn.itcast.day.demo08;

public class Fu {
    int numFu = 10;
    int num = 200;

    public void methodFu(){
        //使用的本类当中的num,不会向下找子类
        System.out.println(num);
    }
}
