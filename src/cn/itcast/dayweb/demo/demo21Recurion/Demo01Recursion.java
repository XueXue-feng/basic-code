package cn.itcast.dayweb.demo.demo21Recurion;

/*
* 递归：直接递归：自己调用自己
* 间接递归：A方法调用B方法，B方法调用C方法，C方法调用A方法
* 注意事项：1.构造方法禁止递归
* 2.递归要有一定的条件限定保证递归可以停下来，防止发生栈内存溢出
* 3.递归次数不能太多否则也会发生栈内存溢出
* 使用前提：当调用方法的时候，方法的主体不变但是每次的参数不同
* A()方法会一直调用A()，栈内存中会有无数的A方法，超出了栈内存的大小就会导致栈内存溢出
* 注意;当一个方法调用其他方法的时候，会一直等着被调用的方法执行完毕才会继续
* */
public class Demo01Recursion {
    public static void main(String[] args) {
        //A();//java.lang.StackOverflowError栈内存溢出
        B(1);
    }

    // 递归次数不能太多否则也会发生栈内存溢出
    private static void B(int i) {
        System.out.println(i);
        if(i == 20000){
            return;//停止方法的作用
        }
        i += 1;
        B(i);
    }

    private static void A() {
        System.out.println("调用A方法");
        A();
    }
}
