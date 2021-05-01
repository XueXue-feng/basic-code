package cn.itcast.dayweb.demo.demo08genericity.practise;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        PrepareCard prepareCard = new PrepareCard();
        //准备牌
        ArrayList<String> arrayList = prepareCard.prepareCard();
        //发牌
        ArrayList<String> arrayListA = prepareCard.toCard(arrayList, "成员");
        System.out.println("====================");
        ArrayList<String> arrayListC = prepareCard.toCard(arrayList, "地主");
        System.out.println("====================");
        ArrayList<String> arrayListB = prepareCard.toCard(arrayList, "成员");

        System.out.println("====================");
        System.out.println("刘德华" + arrayListA);
        System.out.println("郭富城" + arrayListB);
        System.out.println("周星驰" + arrayListC);
    }
}
