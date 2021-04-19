package cn.itcast.day.demo04Array;

/*
* 数组的索引从0开始0~数组长度-1
* 如果访问数组索引编号并不存在，就会发生ArrayIndexOutOfBoundsException异常
* */
public class Demo08ArrayIndex {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        //System.out.println(array[3]);//ArrayIndexOutOfBoundsException数组索引越界异常

    }
}
