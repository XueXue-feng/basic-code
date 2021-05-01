package cn.itcast.dayweb.demo.demo08genericity;

public class GeneticInterfaceImpl implements GeneticInterface<String>{
    @Override
    public void method1(String str) {
        System.out.println(str);
    }
}
