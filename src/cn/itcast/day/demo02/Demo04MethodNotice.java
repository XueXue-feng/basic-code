package cn.itcast.day.demo02;

/*
* 使用方法注意事项
* 1.方法应该定义在类中
* 2.方法定义不会执行，要想使用就要调用。单独调用，打印调用
* 3.如果方法有返回值必须写return ;
* 4.return的返回值类型必须和返回值类型一样
* 5.对于void的方法不能写return 后面的返回值类型只能return自己
* 6.方法定义的先后顺序无所谓
* 7.一个方法中可以有多个return语句，但是必须保证同时只有一个会被执行到,两个return不能连写
* */
public class Demo04MethodNotice {

    public static void method(){
        return;//没有返回值，只是表示方法结束而已
    }

    public static int getMax(int a,int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
}
