package cn.itcast.dayweb.demo.demo15Exception;

import java.util.List;

/*
 * 多个异常的处理：1.多个异常分别捕获分别处理 2.一次捕获多次catch处理 3.一次捕获一次处理
 * */
public class Demo08Exception {
    public static void main(String[] args) {
        //1.多个异常分别捕获分别处理
        try {
            int[] arrayA = new int[]{1, 2, 3};
            int i = arrayA[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }

        try {
            List<Integer> integers = List.of(1, 2, 3, 4);
            integers.get(4);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }

        //一个异常多次捕获,如果有子父类关系，子类就必须写在上面ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
        try {
            int[] arrayB = new int[]{1, 2, 3};
            int i = arrayB[5];
            List<Integer> integersB = List.of(1, 2, 3, 4);
            integersB.get(4);
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
        //一次捕获一次处理
        try {
            int[] arrayC = new int[]{1, 2, 3};
            int i = arrayC[5];
            List<Integer> integersC = List.of(1, 2, 3, 4);
            integersC.get(4);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
