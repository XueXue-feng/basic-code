package cn.itcast.day04.demo06;

/*
* 匿名对象：创建对象的标准格式：类名称 对象名 = new 类名称()
*就是只有右边的对象，没有左边的名字和赋值运算符，匿名对象只能使用唯一一次，下次使用必须新创建对象
* 使用建议：如果有一个对象确定只使用唯一一次可以使用匿名对象。
* */
public class Demo04Anonymous {
    public static void main(String[] args) {
        //标准格式 person就是对象的名字
        Person person = new Person();
        person.name = "高圆圆";
        person.showName();
        System.out.println("===============");

        //使用匿名对象
        new Person().name = "赵又廷";
        new Person().showName();//null
    }
}
