package cn.itcast.day.demo10;

/*
* 问题描述：我们需要抽取一个公共的方法来解决默认方法之间代码重复的问题，
* 但是这个共有方法不应该让实现类使用，应该是私有化的。
* 解决方法：从java9.0开始允许接口中定义私有方法。
* 1.普通私有方法：解决默认方法中代码重复的问题 private 返回值类型 方法名(参数列表){}
* 2.静态私有方法：解决多个静态方法中代码重复的问题 private static 返回值类型 方法名(参数列表){}
* */
public interface MyInterfacePrivate {

    //接口的默认方法
    public default void methodDefaultA(){
        System.out.println("这是接口的默认方法A");
        methodCommon();
    }
    public default void methodDefaultB(){
        System.out.println("这是接口的默认方法B");
        methodCommon();
    }
    public default void methodDefaultC(){
        System.out.println("这是接口的默认方法C");
        methodCommon();
    }
    //默认方法的私有化
    private void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

    public static void methodStaticA(){
        System.out.println("接口的静态方法A");
        methodStatic();
    }
    public static void methodStaticB(){
        System.out.println("接口的静态方法A");
        methodStatic();
    }
    private static void methodStatic(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
