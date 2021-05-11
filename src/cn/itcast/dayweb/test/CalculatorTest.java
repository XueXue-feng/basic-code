package cn.itcast.dayweb.test;

import cn.itcast.dayweb.Junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
* Junit白盒测试：
* 1.定义一个测试类也叫做测试用例，建议测试类名：被测试类+Test,包名xxx.xxx.test
* 2.定义测试方法，建议：参数建议使用空参，返回值建议使用void,方法名：被测试方法名+test
* 3.给方法加@Test注解
* 4.导入Junit依赖环境
* 判定结果：红色表示失败，绿色表示成功
* 一般会使用断言操作来判定结果
* */
public class CalculatorTest {
    /*
    * 一般用于初始化语句：用于资源申请，所以方法在执行之前都执行该方法
    * */
    @Before
    public void init(){
        System.out.println("初始化中...");
    }

    /*
    * 一般用于资源释放类语句,在所有测试方法执行完毕之后都会执行该方法用来释放资源
    * */
    @After
    public void close(){
        System.out.println("完成了...");
    }

    @Test
    public void sumTest(){
        //创建对象
        Calculator cal = new Calculator();
        int result = cal.sum(1, 7);
        //System.out.println(result);在测试用例中一般不会使用输出来判断是否正确一般使用断言第一个参数是断言的结果第二个参数是实际的结果
        Assert.assertEquals(8,result);
    }

    //测试sub方法
    @Test
    public void subTest(){
        //创建对象
        Calculator cal = new Calculator();
        System.out.println("我在测试subTest方法");
        int result = cal.sub(9, 7);
        Assert.assertEquals(2,result);
    }
}
