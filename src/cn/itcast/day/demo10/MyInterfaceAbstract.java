package cn.itcast.day.demo10;

/*
* 1.在任何版本的jdk中都能定义抽象方法 public abstract 返回值类型 方法名(参数列表);
* 注意事项：1.在接口中方法的修饰符必须是固定的两个public abstract
* 2.这两个关键字修饰符可以选择性的省略
*
* 使用步骤：
* 1.接口不能直接使用，必须有一个实现类来实现该方法 public class 实现类名称 implements 接口名{...}
* 2.接口的实现类，必须覆盖重写接口的所有抽象方法 public void 方法名(){...}去掉abstract加上大括号和方法体
* 3.创建实现类的对象进行使用
*
* 注意事项：
* 1.如果接口的实现类并没有覆盖重写所有的抽象方法，那么这个实现类就必须是抽象类
* */
public interface MyInterfaceAbstract {
    //抽象方法,以下都正确，方法的三要素可以随意定义
    public abstract void methodAbs1();

    abstract void methodAbs2();

    public void methodAbs3();

    void methodAbs4();
}
