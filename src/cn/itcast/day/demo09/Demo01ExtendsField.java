package cn.itcast.day.demo09;

/*
* 局部变量：直接写局部变量名
* 子类的成员变量：this.成员变量名
* 父类的成员变量：super.成员变量名
* 在访问父子类的重名方法：
* 1.创建的对象是谁就优先用谁，如果没有则向上找
* 注意实现：无论是成员方法还是成员变量都是向上找父类，不向下找子类
*
* 重写(override):在继承关系中，方法的名称和方法的参数列表都相同
* 重写(overload)：方法的参数列表不一样，方法名一样,方法的覆盖
* 重载(override)：发生在继承关系中，方法的名称和方法的参数列表都相同
*
* 特点：创建的是子类对象则优先用子类方法
* 1/@Override:写在方法前面用来检测方法是否正确的重写，这个注解即使不写也是正确的方法的重写
* 2.子类的方法的返回值必须小于等于父类返回值的范围，java.lang.Object是所有类的最高公共父类（祖宗类）
* 3.修饰符：权限，子类方法的权限必须大于等于父类的权限修饰符
* pubLic > protected > (default不是关键字而是留空) > private
* */
public class Demo01ExtendsField {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodFu();
        zi.methodZi();
        //new的是zi所以用子类的方法
        zi.method();
    }
}
