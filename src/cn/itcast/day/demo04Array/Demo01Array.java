package cn.itcast.day.demo04Array;

/*
* 动态初始化：在创建数组的时候直接指定数组的长度
* 静态初始化：在创建数组的时候直接将具体的数据内容进行指定
* 格式：
* 数据类型[] 数组名 = new 数据类型[]{元素1，元素2...};
* 注意事项：
* 1.静态初始化虽然没有直接告诉其长度，但是可以根据数组元素推算出来数组的长度
* */
public class Demo01Array {
    public static void main(String[] args) {
        //直接创建一个数据里面的数据是5,10,15
        int[] arrayA = new int[]{5,10,15};

        String[] arrayB = new String[]{"Hello","World","Java"};
    }
}
