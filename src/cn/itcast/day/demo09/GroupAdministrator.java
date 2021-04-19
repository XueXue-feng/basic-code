package cn.itcast.day.demo09;

import java.util.ArrayList;
import java.util.Random;

public class GroupAdministrator extends Users{
    public GroupAdministrator(String name, int balance) {
        super(name, balance);
    }
    public GroupAdministrator(){

    }
    //群主发普通红包功能
    public ArrayList<Integer> sendAvg(int totalMoney,int count){
        ArrayList<Integer> arrayList = new ArrayList<>();
        //判断一下群主是否可以发红包
        if(super.getBalance() < totalMoney){
            System.out.println("余额不足'");
            return arrayList;
        }

        //发普通红包
        int avg = totalMoney / count;
        int avgMax = totalMoney % count;
        for (int i = 0; i < count; i++) {
            if(i == count - 1){
                arrayList.add(avg);
            }else{
                arrayList.add(avg + avgMax);
            }
        }
        return arrayList;
    }

    public ArrayList<Integer> sendRandom(int totalMoney,int count){
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(super.getBalance() < totalMoney){
            System.out.println("余额不足'");
            return arrayList;
        }
        //已经发出去的红包
        int sumRed = 0;
        for (int i = 0; i < count - 1; i++) {
                arrayList.add(new Random().nextInt((int)(totalMoney / count)));
                sumRed = sumRed + arrayList.get(i);
        }
        arrayList.add(totalMoney - sumRed);
        return arrayList;
    }
 }
