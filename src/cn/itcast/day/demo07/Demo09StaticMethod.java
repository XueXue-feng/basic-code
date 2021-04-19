package cn.itcast.day.demo07;

/*
* static修饰成员方法
* 一旦使用static修饰方法那么就成为了静态方法，静态方法不属于对象而是属于类
* 如果没有static关键字就得创建对象才能使用，如果有static直接通过类名称来调用
* 无论是成员变量还是成员方法，都推介使用类名称来调用。
* 类名称.静态变量
* 类名称.静态方法名
*
* 1.静态只能直接访问静态，静态不能直接访问非静态
* 因为：在内存中是先有的静态内容，后有的非静态
* 先人不知道后人，后人知道先人，习大大知道前面的主席是谁，秦始皇不知道习大大是谁
* 2.静态方法中不能用this关键字
* 原因：this代表谁调用的当前对象，谁就是this，静态与对象无关
* */
public class Demo09StaticMethod {
    public static void main(String[] args) {
        //首先创建对象才能使用没有static修饰的成员方法
        MyClass obj = new MyClass();
        obj.method();
        //对于静态方法来说可以通过对象来调用，也可以通过类名称来调用
        obj.methodStatic();//正确，不推荐，会误以为是成员方法，这种写法在被javac编译之后也会被翻译成为类名称.静态方法名
        MyClass.methodStatic();//正确，推荐

        //对于本类当中的静态方法可以省略类名,完全等效
        Demo09StaticMethod.myMethod();
        myMethod();
    }
    public static void myMethod(){
        System.out.println("这是我自己的方法！！！");
    }


}
