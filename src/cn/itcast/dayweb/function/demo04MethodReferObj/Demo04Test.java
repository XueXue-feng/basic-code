package cn.itcast.dayweb.function.demo04MethodReferObj;

/*
* 数组的构造器引用
* */
public class Demo04Test {
    public static int[] printArr(int length,Demo04ArrayBuilder arrayBuilder){
        int[] ints = arrayBuilder.arrayBuilder(length);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
        return ints;
    }

    public static void main(String[] args) {
       int[] array1 =  printArr(1,(length)->{
            int[] array = new int[length];
            return array;
        });
        System.out.println(array1.length);
        //使用方法的引用优化Lambda
        int[] array2 = printArr(10,int[]::new);
        System.out.println(array2.length);
    }
}
