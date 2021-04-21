package cn.itcast.day.demo12;

/*
* 局部内部类，如果希望局部内部类的成员方法访问外部类的局部变量了，那么这个局部变量必须是有效final的
* PS:从JAVA 8+开始，只要局部变量事实不变，那么final关键字可以省略。生命周期不一样
* 原因：
* 1.new出来的对象在堆内存中
* 2.局部变量是跟着方法走的，是在栈内存中
* 3.方法运行结束之后会立刻出栈
* 4.但是new出来的对象不会消失直到垃圾回收为止。
* */
public class OuterFinal {
    public void method(){
        final int num = 10; //所在方法的局部变量
        class InnerFinal{
            public void methodInnerFinal(){
                System.out.println(num);
            }
        }
    }
}
