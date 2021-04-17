package cn.itcast.day04.demo04Array;

/*
* 使用动态初始化的时候，其中的元素将会拥有一个默认值，规则如下：
* 1.整数类型byte,short,int,long 0
* 2.浮点类型：0.0
* 3.如果是字符类型默认为 ‘\u0000’不可见类型
* 4.boolean类型默认为 false
* 5.引用数据类型默认为 null
*
* 注意事项：
* 1.静态初始化也有默认值，只不过系统将默认值替换为大括号中的元素值
* */
public class Demo06ArrayUse {
    public static void main(String[] args) {
        //动态初始化
        int[] arrayA = new int[3];
        System.out.println(arrayA[0]);//0
        System.out.println(arrayA[1]);//0
        System.out.println(arrayA[2]);//0

        System.out.println("==================");
        //将数据123赋值给索引为1的元素
        arrayA[1] = 123;
        System.out.println(arrayA[0]);//0
        System.out.println(arrayA[1]);//123
        System.out.println(arrayA[2]);//0
    }
}
