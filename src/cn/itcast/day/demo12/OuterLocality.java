package cn.itcast.day.demo12;

/*
* 局部内部类：如果一个类是定义在方法内部的，那么这就是一个方法的局部内部类
* 局部：只有当前所属的方法才能使用他，出来方法就不能使用了
* 定义格式：修饰符 class 外部类名称{
*   修饰符 返回值类型 外部方法名(参数列表){
*       class 局部类名称{
*           ....
*           }
*       }
*   }
* 小结一下权限修饰符：public > protected > (default) > private
* 外部类：public,(default)
* 成员内部类：public protected,(default),private
* 局部内部类：什么都不能写
* */
class OuterLocality {
    public void method(){//外部类
        System.out.println("我是外部类的方法");
        class InnerLocality{//内部类
            int num = 10;
            public void method(){//该方法只能在外部类method方法中使用
                System.out.println("我是内部类的方法");
            }
        }
        InnerLocality innerLocality = new InnerLocality();
        System.out.println(innerLocality.num);
    }
}
