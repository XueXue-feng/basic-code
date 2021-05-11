package cn.itcast.dayweb.Junit;

public class CalculatorTest {
    public static void main(String[] args) {
        //创建对象
        Calculator cal = new Calculator();
        System.out.println(cal.sum(1 ,2));
        System.out.println(cal.sub(2,1));
    }
}
