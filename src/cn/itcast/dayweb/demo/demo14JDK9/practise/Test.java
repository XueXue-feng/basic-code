package cn.itcast.dayweb.demo.demo14JDK9.practise;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        PrepareCord prepareCord = new PrepareCord();
        HashMap<Integer,String> hashMap = prepareCord.prepareCord();
        prepareCord.dealCard(hashMap);
    }
}
