package cn.itcast.day.demo06;

import java.util.ArrayList;
import java.util.Random;

//集合中存储随机数
public class ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(arrayListRandom(random()).get(0)) ;
        }
        System.out.println(arrayList);

    }

    //产生1~100之间的随机数
    public static int random(){
        return new Random().nextInt(100) + 1;
    }
    //输入一个数将他装进集合中
    public static ArrayList<Integer> arrayListRandom(int num){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(num);
        return arrayList;
    }
}
