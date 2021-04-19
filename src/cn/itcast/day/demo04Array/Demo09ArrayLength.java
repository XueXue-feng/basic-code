package cn.itcast.day.demo04Array;

/*
* 数组的长度：数组名.length();
* 数组一旦创建，程序运行期间，数组长度不能改变
* */
public class Demo09ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        int[] arrayB = {12,13,14};
        System.out.println(arrayA.length);

        //new int[7]这个才是真正的数组，arrayC只是一个数组的名字
        int[] arrayC = new int[7];
        arrayC = new int[3];
        System.out.println(arrayC.length);
    }
}
