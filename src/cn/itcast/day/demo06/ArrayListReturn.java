package cn.itcast.day.demo06;

import java.util.ArrayList;
import java.util.Random;

/*
* 用一个大集合存入20个随机数，筛选其中的偶数存入另一个小集合中
* ArrayList<Integer> 作为返回值类型的练习
* */
public class ArrayListReturn {
    public static void main(String[] args) {
        //ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println(ArrayListEven(ArrayToArrayList(random())));
    }

    //产生6个1~100的随机数存入数组中
    public static int[] random(){
        int[] array = new int[6];
        for (int i = 0; i < 6; i++) {
            int random =  new Random().nextInt(100) + 1;
            array[i] = random;
        }
        return array;
    }
    //将数组中的元素放到集合中
    public static ArrayList<Integer> ArrayToArrayList(int[] array){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        System.out.println("原集合是：" + arrayList);
        return arrayList;
    }
    //遍历集合找出集合中的偶数放到数组中输出
    public static ArrayList<Integer> ArrayListEven(ArrayList<Integer> arrayList){
        ArrayList<Integer> arrayListEven = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if((arrayList.get(i) % 2) == 0){
                arrayListEven.add(arrayList.get(i));
            }
        }
        return arrayListEven;
    }
}
