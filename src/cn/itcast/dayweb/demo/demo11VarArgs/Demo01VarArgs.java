package cn.itcast.dayweb.demo.demo11VarArgs;

/*
* 当方法的参数的数据类型一样但是个数不确定的时候就可以使用JDK1.5+
* 格式：修饰符 返回值类型 方法名(参数类型... 变量名){}
* 原理：底层就是一个数组根据传递的参数个数不同会创建不同类型的数组来存储这些参数，存储的个数可以是0,1,2...
* 注意：1.一个方法的可变参数只能有一个 2.如果方法有多个参数，可变参数必须写在末尾
* */
public class Demo01VarArgs {
    public static void main(String[] args) {
      //System.out.println(sumN(1,2,3,4,5));//15
        System.out.println(sumA(100,1,2,3,4,5,6,7,8,9));//145
    }

    //定义计算0~n个的和
    public static int sumN(int...array){
        System.out.println(array);//底层是一个长度
        int sum = 0;
        for(int a:array){
            sum = sum + a;
        }
        return sum;
    }
    //定义一个方法计算两个int类型的和
    public static int sun(int a,int b){
        return  a + b;
    }
    //定义某几个int类型的数据与int a的和
    public static int sumA(int a,int...array){
        int sum = 0;
        for(int i:array){
            sum = sum  + i;
        }
        return sum + a;
    }
}
