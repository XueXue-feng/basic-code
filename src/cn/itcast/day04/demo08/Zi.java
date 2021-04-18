package cn.itcast.day04.demo08;

public class Zi extends Fu{
    int numZi = 20;
    int num = 100;

    public void methodZi(){
        //会优先使用本类的num，不会向上找父类的num,有的话用自己的num
        System.out.println(num);
    }
}
