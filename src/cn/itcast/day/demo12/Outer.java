package cn.itcast.day.demo12;

/*
* 如果出现了重名现象：
* 格式：外部类名.this.外部类成员变量名
* */
public class Outer {//外部类
    int num = 10;//外部类的成员变量
    public class Inner{//内部类
        int num = 20;//内部类的成员变量
        public void method(){
            int num = 30;//内部类方法的局部变量
            System.out.println(num);//30
            System.out.println(this.num);//20
            System.out.println(Outer.this.num);//10
        }
    }
}
