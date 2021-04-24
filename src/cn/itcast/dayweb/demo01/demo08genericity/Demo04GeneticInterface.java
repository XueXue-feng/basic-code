package cn.itcast.dayweb.demo01.demo08genericity;

/*
* 测试含有泛型的接口
* */
public class Demo04GeneticInterface {
    public static void main(String[] args) {
        GeneticInterfaceImpl geneticInterfaceImpl = new GeneticInterfaceImpl();
        geneticInterfaceImpl.method1("123");
        System.out.println("=======================");

        GeneticInterfaceImpl2<Integer> geneticInterfaceImpl2 = new GeneticInterfaceImpl2<>();
        geneticInterfaceImpl2.method1(123);
    }
}
