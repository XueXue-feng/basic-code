package cn.itcast.day.demo04Array;

/*
* 使用静态初始化的时候：
* 省略格式：
* 数据类型[] 数组名 = new 数据类型[]{元素1，元素2...};
* 数据类型[] 数组名 = {元素1，元素2...};
* 注意事项：
* 1.可以通过元素推算出静态初始化数组的长度
* 2.可以拆分成两个步骤静态初始化标准格式；
* 3.动态初始化也可以拆分成两个步骤
* 4.一旦使用静态初始化的省略格式就不能拆分
*
* 如果不确定数组的内容使用动态初始化，否则使用静态初始化
 * */
public class Demo03Array {
    public static void main(String[] args) {
        int[] arrayA = {10,30,78};

        //静态标准格式拆分
        int[] arrayB;
        arrayB = new int[]{9,7};

        //动态初始化拆分
        //int[] arrayC = new int[8];
        int[] arrayC;
        arrayC = new int[8];

        //静态初始化的省略格式不饿能进行拆分
        int[] arrayD;
       // arrayD = {9,7,60}; 错误写法！！

    }
}
