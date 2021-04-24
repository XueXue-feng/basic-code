package cn.itcast.day.demo14.red;

import java.util.ArrayList;
import java.util.Random;

public class RandomOpenModeImpl implements OpenMode{
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        //随机红包，最大红包不能超过平均的2倍，最小为1
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sum = 0;//已经抢的红包的和
        for (int i = 0; i < totalCount; i++) {

            if(sum < totalMoney){
                if(i == totalCount - 1 && sum < totalMoney){
                    arrayList.add(totalMoney - sum);
                }else {
                    arrayList.add(new Random().nextInt((2 * (totalMoney / totalCount))) + 1);
                    sum = sum + arrayList.get(i);
                }
            }

        }
        return arrayList;
    }
}
