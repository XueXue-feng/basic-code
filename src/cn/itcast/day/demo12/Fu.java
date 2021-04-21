package cn.itcast.day.demo12;

/*
* 当final关键字修饰方法的时候，这个方法就是最终方法，不能被重写，覆盖
* 格式：pubic final 返回值类型 方法名称(参数列表){...}
* 注意事项：对于类和方法来说abstracts和final是矛盾的
* */
public abstract class Fu {
    public final void method(){
        System.out.println("父类方法执行了");
    }

    //final关键字和abstract矛盾不能同时使用
    public abstract /*final*/ void methodAbstract();
}
