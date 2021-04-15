package cn.itcast.day04.demo04Array;

/**
 * NullPointerException空指针异常
 *所有的引用数据类型都可以赋值为null，表示其中什么都没有
 * 数组必须进行new进行初始化
 */
public class Demo08ArrayNull {
    public static void main(String[] args) {
        int[] array = null;
        array = new int[18];
        System.out.println(array[8]);

    }
}
