package cn.itcast.dayweb.demo01.demo19Lambda;

public class Test3 {
    public static void main(String[] args) {

        invokeCalc(new Calculator() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        },120,130);

        System.out.println(invokeCalc(((int a,int b)->{ return a + b;}),120,130));

        //优化省略Lambda
        System.out.println(invokeCalc((( a, b)-> a + b),120,130));
    }


    public static int invokeCalc(Calculator calculator,int a ,int b){
        return calculator.sum(a , b);
    }
}
