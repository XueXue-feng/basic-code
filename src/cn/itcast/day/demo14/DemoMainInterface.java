package cn.itcast.day.demo14;

import java.util.ArrayList;
import java.util.List;

public class DemoMainInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = addName(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static List<String> addName(List<String> list){
        list.add("古力娜扎");
        list.add("杨幂");
        list.add("迪丽热巴");
        list.add("马儿扎哈");
        return list;
    }
}
