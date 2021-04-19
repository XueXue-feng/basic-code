package cn.itcast.day.demo04Array;

/*
* 求出数组中最大的元素
* */
public class Demo11ArrayMax {
    public static void main(String[] args) {
        int[] array = new int[]{10,70,3,4,567};
        System.out.println(getArrayMax(array));
    }

    public static int getArrayMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] >= max){
                max = array[i];
            }
        }
        return max;
    }
}
