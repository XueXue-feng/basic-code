package cn.itcast.day.demo02;

/*
* 有参数：小括号中有内容，当一个方法需要一些数据条件才能完成任务时，就是有参数
* 无参数：小括号中留空，方法不需要任何数据条件就能完成任务PS:一个方法可以打印固定10次Hello World!
* */
public class Demo03MethodParam {
    public static void main(String[] args) {
        System.out.println(method1(3,7));
        method2();
    }

    //有参数
    public static int method1(int a,int b){
        int result = a * b;
        return result;
    }

    //无参数
    public static void method2(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
    }
}
