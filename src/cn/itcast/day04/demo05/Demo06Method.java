package cn.itcast.day04.demo05;

/*
* 面向对象三大特征：
* 封装，在Java中的体现，1.方法就是一种封装，2.private也是一种封装,封装就是将一些细节信息隐藏起来，对外界不可见
* 继承
* 多态
* */
public class Demo06Method {
    public static void main(String[] args) {
        //取其中的最大值
        int[] array = {10,6,68,39};
        getMax(array);
    }

    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] >= max){
                max = array[i];
            }
        }
        System.out.println("最大值是： " + max);
        return max;
    }
}
