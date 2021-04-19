package cn.itcast.day.demo08;

/*
* 请使用 Math 相关的API，计算在 -10.8 到 5.9 之间，绝对值大于 6 或者小于 2.1 的整数有多少个？
* */
public class Demo03MathPractise {
    public static void main(String[] args) {
        int[] arrayInt;
        int i = (int)Math.floor(-10.8);
        int a = 0;
        do{
            i = i + 1;
            if(Math.abs(i) > 6 || Math.abs(i) < 2.1){
                System.out.println(i);
                a ++;
            }
        }while(i <= 5.9);
        System.out.println(a);
    }
}
