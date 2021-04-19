package cn.itcast.day.demo06;

import java.util.ArrayList;
import java.util.Random;

/*
* 以指定格式输出集合，格式为[元素1@元素2@.....]
* */
public class ArrayListFormat {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(arrayListRandom(random()).get(0));
        }
        modify(arrayList);

    }
    //产生1~100之间随机数
    public static int random(){
        return new Random().nextInt(100) + 1;
    }
    //输入一个数将他装进集合中
    public static ArrayList<Integer> arrayListRandom(int num){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(num);
        return arrayList;
    }
    //将集合中的,改成@   将[]换成{}
    public static String modify(ArrayList<Integer> arrayList){
        String str = "";
        for (int i = 0; i < arrayList.size(); i++) {
            if(i == (arrayList.size() - 1)){
                str = str + arrayList.get(i).toString();
            }else {
                str = str + arrayList.get(i).toString() + "@";
            }
        }
        System.out.print("{"+ str +"}");
        return str;
    }
}
