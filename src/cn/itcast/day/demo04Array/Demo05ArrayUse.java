package cn.itcast.day.demo04Array;

/*
* [I@50cbc42f [代表数组类型，I int类型数组 @50cbc42f 16进制的内存地址哈希值
* 二进制：0，1
* 十进制：0123456789
* 16进制：0123456789abcdef f-->15
* 反复问数组元素的格式：数组名称[索引值]
* 索引值：就是一个int数字，代表数组元素所在的编号，索引值从0开始直到数组长度-1为止
* */
public class Demo05ArrayUse {
    public static void main(String[] args) {
        int[] arrayA = new int[]{1,2,3,4,};

        //直接打印数组元素中的内容
        System.out.println(arrayA);//[I@50cbc42f数组内存所对应的数据哈希值
        System.out.println("=================");
        System.out.println(arrayA[0]);
        //也可以将数组中的单个元素进行赋值交给变量
        int num = arrayA[1];
        for(int i = 0; i < arrayA.length; i+=1){
            System.out.println(arrayA[i]);
        }
    }
}
