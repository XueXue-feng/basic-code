package cn.itcast.dayweb.demo.demo13Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
* 统计一个字符串中每个字符出现的次数
* */
public class Practise {
    public static void main(String[] args) {
        String str = "adsuxbcecwbuisjhoahsassawaaaafghnbaaa";
        char[] strCharArray = str.toCharArray();
        ArrayList<Character> arrayList = new ArrayList<>();

        //删除重复，统计字符串中字符的种类
        HashMap<Character,Integer> hashMap = new HashMap<>();
        //遍历str
        for(int i = 0;i < str.length(); i++){
            arrayList.add(strCharArray[i]);
            hashMap.put(strCharArray[i],i);
        }
        System.out.println(arrayList);
        System.out.println(hashMap);

        //遍历arrayList
        for(Map.Entry<Character,Integer> entry:hashMap.entrySet()){
            int count = 0;
            for (int i = 0; i < arrayList.size(); i++) {
                if(entry.getKey().equals(arrayList.get(i)) ){
                    count += 1;
                }
            }
            System.out.println(entry.getKey() + "---->" + count);
        }

        //方法2
        System.out.println("=====================");
        String str2 = "adsuxbcecwbuisjhoahsassawaaaafghnbaaa";
        char[] strCharArray2 = str2.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        //遍历strCharArray2看map集合中是否存在
        for (int i = 0; i < strCharArray2.length; i++) {
            if(map.containsKey(strCharArray2[i])){
                Integer integer = map.get(strCharArray2[i]).intValue();
                integer += 1;
                map.put(strCharArray2[i],integer++);
            }else{
                map.put(strCharArray2[i],1);
            }
        }
        System.out.println(map);

    }
}
