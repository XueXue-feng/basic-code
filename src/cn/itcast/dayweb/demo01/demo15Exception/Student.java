package cn.itcast.dayweb.demo01.demo15Exception;

public class Student extends Person {
    //子类在重写父类方法时，可以抛出和父类相同的异常
    @Override
    public void show01() throws NullPointerException, ClassCastException {
        super.show01();
    }

    //子类在重写父类方法时，可以抛出异常的子类
    @Override
    public void show02() throws ArrayIndexOutOfBoundsException {
        super.show02();
    }

    //子类在重写父类方法时，可以不抛出异常
    @Override
    public void show03()  {
        super.show03();
    }

    //子类在重写父类方法时，父类不抛出异常,子类也不能抛出异常只能捕获处理，理论不能加会报错但是我的就没有报错seeing
    @Override
    public void show04(){
        super.show04();
        System.out.println("我是父类的重写方法");
        try {
            throw new NullPointerException("我是编译期异常");
        }catch(NullPointerException e){
            e.toString();
        }
    }
}
