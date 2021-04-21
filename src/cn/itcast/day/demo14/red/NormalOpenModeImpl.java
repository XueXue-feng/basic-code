package cn.itcast.day.demo14.red;

import java.util.ArrayList;

public class NormalOpenModeImpl implements OpenMode{
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        //平均分发红包
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < totalCount ; i++) {
            if(i == totalCount - 1){
                arrayList.add((totalMoney / totalCount) + (totalMoney % totalCount));
            }else {
                arrayList.add((int) (totalMoney / totalCount));
            }
        }
        return arrayList;
    }
}
