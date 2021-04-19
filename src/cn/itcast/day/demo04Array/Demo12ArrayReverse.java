package cn.itcast.day.demo04Array;

/*
数组可以作为方法的参数
在方法中传递的是数组的地址值
* 数组元素的反转
* */
public class Demo12ArrayReverse {
    public static void main(String[] args) {
        int[] array = new int[]{10,273,678,44,0,9,90};
        getArrayReverse2(array);
    }

    public static int[] getArrayReverse(int[] array){
        //int[] arrayReverse = new int[array.length];
       // int temp ;
        /**for (int i = array.length - 1; i >= 0 ; i--) {
            if(array.length - 1 != i) {
                temp = array[i];
                array[i] = array[array.length - 1];
                array[array.length - 1] = temp;
                System.out.println(array[i]);
            }
        }*/

        for(int min = 0, max = array.length - 1; min < max ; min ++ ,max --){
            //首尾相接
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
            //System.out.println(array[min]);
            //System.out.println(array[max]);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        return array;
    }

    public static int[] getArrayReverse2(int[] array){
        int[] tempArray = new int[array.length];

            for(int a = 0 ; a < array.length ; a ++){
                //System.out.println("我是：" + (array.length -1 - a));
                //System.out.println("==============");
                //System.out.print(a);
                tempArray[array.length - 1 - a ] = array[a];
              //  System.out.println( tempArray[array.length - a]);
            }

        for (int i = 0; i < tempArray.length; i++) {
            System.out.println(tempArray[i]);
        }
        return tempArray;
    }
}
