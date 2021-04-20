package cn.itcast.day.demo11;

/*
* 在多态的代码中，成员方法的访问规则是：1.谁new的就优先用谁，没有则向上寻找
* 注意：编译看左，运行看右
* 成员方法：编译看左，运行看右
* 成员变量：编译看左，运行还看左
* */
public class Demo02MultiMethod {
    public static void main(String[] args) {
        Fu obj = new Zi();

        //访问父类特有的方法
        obj.methodFu();

        //访问父类和子类重名的方法new 的是Zi所以优先用子
        obj.method();//我是子类方法

        //访问子类特有的方法
        //编译看左，左边是Fu，父类当中没有methodZi方法所以编译报错
        //obj.methodZi();错误写法程序不会向下寻找
    }
}
