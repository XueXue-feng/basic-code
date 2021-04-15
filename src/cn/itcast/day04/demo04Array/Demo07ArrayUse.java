package cn.itcast.day04.demo04Array;

/*

* */
public class Demo07ArrayUse {
    public static void main(String[] args) {
        //动态初始化
        int[] arrayB = new int[3];
        System.out.println(arrayB[0]);//0
        System.out.println(arrayB[1]);//0
        System.out.println(arrayB[2]);//0

        System.out.println("==================");
        //将数据123赋值给索引为1的元素
        arrayB[1] = 123;
        System.out.println(arrayB[0]);//0
        System.out.println(arrayB[1]);//123
        System.out.println(arrayB[2]);//0

        System.out.println("==================");
       //int[] arrayC = new int[3];
        //将arrayB数组的地址值赋值给arrayC
        int[] arrayC = arrayB;
        System.out.println(arrayC[0]);//0
        System.out.println(arrayC[1]);//0
        System.out.println(arrayC[2]);//0

        System.out.println("==================");
        //将数据123赋值给索引为1的元素
        arrayC[1] = 178;
        System.out.println(arrayC[0]);//0
        System.out.println(arrayC[1]);//123
        System.out.println(arrayC[2]);//0
    }
}
