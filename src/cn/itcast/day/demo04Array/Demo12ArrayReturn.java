package cn.itcast.day.demo04Array;

/*
* 一个数组可以有一个或者多个参数，但是只能有一个或者0个返回值
* 如果希望一个方法中产生多个结果可以用数组接受
*
* 任何数据类型都可以作为方法的参数和返回值类型
* 返回值类型是数组返回的是数组的地址值
* */
public class Demo12ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(10,5,48);
        System.out.println("总和是：" + result[0]);
        System.out.println("平均数是：" + result[1]);
    }

    public static int[] calculate(int a , int b,int c){
        //使用动态初始化
        int[] array = new int[2];
        array[0] = a + b +c;
        array[1] = array[0] / 3;

        //使用静态初始化
        int[] arrayB = new int[]{(a + b + c),(a + b + c)/3 };
        return array;
    }
}
