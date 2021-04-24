package cn.itcast.dayweb.demo01.demo08genericity;

public class TestDemo02Genetic {
    public static void main(String[] args) {
        //使用泛型
        Demo02Generic<String> str = new Demo02Generic<>();
        str.setName("小米");
        System.out.println(str.getName());

        //不使用泛型，默认为Object类型
        Demo02Generic in = new Demo02Generic();
        in.setName(123);
        System.out.println(in.getName());
    }
}
