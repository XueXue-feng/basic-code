package cn.itcast.day.demo02;
/*
* 方法其实就是若干功能的集合
* 方法好比就是一个工厂
*
* 参数：（原料）就是进入方法的数据
* 返回值：就是从方法中出来的数据
*
* 方法的格式：
* 修饰符 返回值类型 方法名（参数类型 参数名,......）{
* 方法体；
* return 返回值；
* }
* 修饰符：现阶段就是public static
* 返回值类型：方法最终产生的数据类型
* 方法名：方法的名字，规则和变量名一样是小驼峰式
* return : 1.停止当前方法
* 2.将后面的结果数据（返回值）还给调用处
*
* 注意事项：
* 1.返回值必须和返回值类型一样；
* 三要素：返回值类型，方法名，参数列表
*
* 方法的三种调用格式：
* 1.单独调用：方法名（参数）；
* 2.打印调用：System.out.println(方法名（参数）);
* 3.赋值调用：数据类型 变量名 = 方法名（参数）；
*
* 注意事项：
* 此前学习的返回值为void的方法，只能单独调用，不能打印调用或者赋值调用
* * */
public class Domo02MethodDefine {
    public static void main(String[] args) {
        //单独调用
        sum(10,20);
        System.out.println("==================");

        //打印调用
        System.out.println(sum(2,3));
        System.out.println("==================");

        //赋值调用
        int sumValue = sum(4,5);
    }

    public static int sum(int a,int b){
        System.out.println("方法执行啦");
        int result = a + b;
        return result;
    }
}
