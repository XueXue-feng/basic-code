package cn.itcast.dayweb.demo01.demo14JDK9.practise;

import java.util.*;

/*
* 准备54张牌，发牌的时候有序
* */
public class PrepareCord {

    //准备54张牌使用LinkedHashSet存储不能重复
    public HashMap<Integer,String> prepareCord(){
        HashMap<Integer,String> hashMap = new HashMap<>();//存储54张牌
        List<String> setSuit = List.of("♠","♤","♣","♦");//花色
        List<String> setCard = List.of("2","A","K","Q","J","3","4","5","6","7","8","9","10");
        //使用for循环组装54张牌
        int count = 3;
        hashMap.put(1,"大王");
        hashMap.put(2,"小王");
        for(String strSuit:setSuit){
            for(String strCard:setCard){
                hashMap.put(count++,strSuit + "-" + strCard);
            }
        }
        System.out.println(hashMap + "-" + hashMap.size());
        return hashMap;
    }

    //按照随机方法发牌，发到手里的牌按照从小到大的顺序排序
    public void dealCard(HashMap<Integer,String> hashMap){
        //遍历hashMap把Key值放到ArrayList中用于洗牌
        ArrayList<Integer> arrayList = new ArrayList<>();
        Set<Integer> integers = hashMap.keySet();
        for (Integer b : integers) {
            arrayList.add(b);
        }
        //洗牌
        Collections.shuffle(arrayList);
        //发牌
        ArrayList<Integer> arrayListA = new ArrayList<>();//地主
        ArrayList<Integer> arrayListB = new ArrayList<>();//农民A
        ArrayList<Integer> arrayListC = new ArrayList<>();//农民B
        for (int i = 0; i < arrayList.size(); i++) {
            if(i % 3 == 0){
                arrayListA.add(arrayList.get(i));
            }else if(i % 3 == 1){
                arrayListB.add(arrayList.get(i));
            }else if(i % 3 == 2){
                arrayListC.add(arrayList.get(i));
            }
        }
        //对发的牌进行排序
        Collections.sort(arrayListA);
        Collections.sort(arrayListB);
        Collections.sort(arrayListC);
        //显示牌
        showCard(arrayListA,hashMap);
        showCard(arrayListB,hashMap);
        showCard(arrayListC,hashMap);
    }
    public ArrayList<String> showCard(ArrayList<Integer> arrayList,HashMap<Integer,String> hashMap){
        ArrayList<String> arrayListA = new ArrayList<>();//地主
        for (int i = 0; i < arrayList.size(); i++) {
            arrayListA.add(hashMap.get(arrayList.get(i)));
        }
        System.out.println(arrayListA);
        return arrayListA;
    }

}
