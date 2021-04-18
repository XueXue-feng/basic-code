package cn.itcast.day04.demo09;

import java.util.ArrayList;
import java.util.Random;

/*
* 普通用户抢红包
* */
public class Member extends Users{
    public Member() {
    }

    public Member(String name, int balance) {
        super(name, balance);
    }

    //用户抢红包
    public void receive(ArrayList<Integer> arrayList){
        //从arrayList中挑选一个作为自己的红包
        int receiveRed = arrayList.remove(new Random().nextInt(arrayList.size()));
        System.out.println(receiveRed);
    }
}
