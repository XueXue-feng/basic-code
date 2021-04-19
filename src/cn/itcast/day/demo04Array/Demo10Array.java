package cn.itcast.day.demo04Array;

/*
 * 遍历数组：对于数组中每一个元素逐一，挨个处理，而默认的处理方式就是打印
 * */
public class Demo10Array {
    public static void main(String[] args) {
        int[] array = {14, 20, 25, 30};

        //首先使用原始方式进行遍历
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println("======================");

        //使用循环进行遍历
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
