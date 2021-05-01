package cn.itcast.dayweb.demo.demo08genericity;

public class GeneticInterfaceImpl2 <M> implements GeneticInterface <M>{

    @Override
    public void method1(M m) {
        System.out.println(m);
    }
}
