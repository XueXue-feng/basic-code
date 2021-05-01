package cn.itcast.dayweb.demo.demo10collection;

/*
* 哈希表：是一个十进制的整数，由系统随机给出（就是对象的地址值，但是是逻辑地址值不是实际物理地址值）
* 在Object类有一个方法可以获取对象的hashCode()
* */
public class Demo04HashCode {
    public static void main(String[] args) {
        //object类的hashCode()
        Person person1 = new Person();
        System.out.println(person1.hashCode());

        Person person2 = new Person();
        System.out.println(person2.hashCode());

        //toString()的最后的地址值就是hashcode的16进制
        System.out.println(person1.toString());
        System.out.println(person2.toString());

        /*
        * String类重写了Object类的hashCode(),字符串一样hashcode一样
        * */
        String str1 = "abc";
        String str2 = "abd";
        System.out.println(str1.hashCode());//96354
        System.out.println(str2.hashCode());//96355

    }
}
