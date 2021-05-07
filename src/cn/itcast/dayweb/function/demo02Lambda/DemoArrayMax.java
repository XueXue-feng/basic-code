package cn.itcast.dayweb.function.demo02Lambda;

import java.util.Arrays;
import java.util.function.Supplier;

/*
* 使用Supplier接口实现求数组的最大值
* */
public class DemoArrayMax {
    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        int[] array = new int[]{10,20,6,8,45};
        int max = getMax(new Supplier<Integer>() {
            @Override
            public Integer get() {
                Arrays.sort(array);
                return array[array.length - 1];
            }
        });
        System.out.println(max);
    }
}
