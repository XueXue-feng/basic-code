package cn.itcast.dayweb.demo.demo08genericity.practise;

import java.util.ArrayList;
import java.util.Collections;

/*
* 斗地主的发牌，一共54张牌
* */
public class PrepareCard {
     final static int CARD  = 54;
     static int REST;

    //准备牌ArrayList<String>，牌由花色集合和数字集合嵌套迭代完成组装
    public ArrayList<String> prepareCard(){
        ArrayList<String> arrayCard = new ArrayList<>();//牌
        ArrayList<String> flowerType = new ArrayList<>();//花色集合
        flowerType.add("♠");//黑桃
        flowerType.add("♤");//红桃
        flowerType.add("♦");//方块
        flowerType.add("♣");//梅花
        ArrayList<String> numType = new ArrayList<>();//数字集合
        numType.add("A");
        numType.add("2");
        numType.add("3");
        numType.add("4");
        numType.add("5");
        numType.add("6");
        numType.add("7");
        numType.add("8");
        numType.add("9");
        numType.add("10");
        numType.add("J");
        numType.add("Q");
        numType.add("K");
        numType.add("大王");
        numType.add("小王");
        for (int i = 0; i < numType.size(); i++) {
            if("大王".equals(numType.get(i))){
                arrayCard.add("大王");
            }else if("小王".equals(numType.get(i))){
                arrayCard.add("小王");
            }
            else{
                for (int a = 0; a < flowerType.size(); a++) {
                    System.out.println("您的牌为 :" + flowerType.get(a) + " - " + numType.get(i));
                    arrayCard.add(flowerType.get(a) + numType.get(i));
                }
            }
        }
       Collections.shuffle(arrayCard);
        int totalCard = arrayCard.size();
        System.out.println("一共准备了" + totalCard);
        return arrayCard;
    }

    //发牌
    public ArrayList<String> toCard(ArrayList<String> arrayList,String member){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i < CARD; i++) {
            REST = CARD - arrayList.size();
            if(member == "成员" && i <= 17){
                System.out.println();
                list.add(arrayList.get(0));
                System.out.println("我是成员我有" + i +"张牌" + ","  + "我的牌是" + arrayList.get(0));
                arrayList.remove(0);
            }
            if((member == "地主" && arrayList.size() <= 3 && arrayList.size() >= 0 && i <= 20)|| (member == "地主" && i <= 20)  ) {
                    list.add(arrayList.get(0));
                    System.out.println("我是地主我有" + i + "张牌" + "," +"我的牌是" + arrayList.get(0));
                    arrayList.remove(0);
                }
            }
        return list;
    }

}
