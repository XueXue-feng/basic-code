package cn.itcast.day.demo05;

/*
* 问题描述：定义person年龄时，无法组织不合理数据的输入
* 解决方案：用private关键字对需要保护的成员变量进行修饰
* 一旦使用了private进行修饰，那么本类中任然可以随时使用，但是超出本类范围之外就不可以直接使用了。
*
* 简介访问private成员变量，就是设置一对儿Getter/Setter方法
* 必须叫setxxx和getxxx
* 而且setxxx参数类型和成员变量的类型相同，返回值类型为void
* getxxx返回值类型和成员变量类型相同，参数列表为空
* */
public class Person {
    private String name;
    private int age;

    public void show(){
        System.out.println("我叫：" + name + "，今年" + age);
    }

    //设置一个成员方法，专门用来给age赋值
    public void setAge(int num){
        if(num < 100 && num >= 0){
            age = num;
        }else{
            System.out.println("数据不合理");
        }

    }
    //设置一个成员方法，专门用来得到age的数据
    public int getAge(){
        return age;
    }

    public void setName(String nameTemp){
        name = nameTemp;
    }
    public String getName(){
        return name;
    }
}
