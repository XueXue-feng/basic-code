package cn.itcast.day.demo08;

/*
* 在父子类的继承关系时，如果成员变量重名时，访问子类时的两种规则：
* 1.直接通过子类的对象访问成员变量：等号左边是谁就优先用谁，如果没有则想上找
* 2.间接通过成员方法访问成员变量，就要看方法属于谁，就优先用谁，没有则向上找
*
*
* */
public class Demo05ExtendsField {
    public static void main(String[] args) {
        //只能使用父类的对象，不能使用子类的对象
        Fu fu = new Fu();
        System.out.println(fu.numFu);

        System.out.println("===============");
        Zi zi  = new Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);
        System.out.println("===============");

        //直接通过子类的对象访问成员变量,等号左边是谁就优先用谁 Zi zi  = new Zi();
        int num = zi.num;
        System.out.println(num);//100子类的num
        System.out.println("===============");

        //这个方法是子类的优先用子类的，如果没有再想上找
        zi.methodZi();//100
        //这个方法是谁的，这个方法是父类的
        zi.methodFu();//200
    }
}
