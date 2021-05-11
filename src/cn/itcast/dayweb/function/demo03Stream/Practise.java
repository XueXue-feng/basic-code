package cn.itcast.dayweb.function.demo03Stream;

import java.util.ArrayList;
import java.util.Collections;

public class Practise {
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person("张翠山"));
        arrayList.add(new Person("张敏"));
        arrayList.add(new Person("喜羊"));
        arrayList.add(new Person("美羊羊"));
        arrayList.add(new Person("懒羊"));
        Collections.addAll(arrayList,new Person("灰太狼"),new Person("红太狼"),
                new Person("张三"),new Person("李四")
                ,new Person("王五"),new Person("赵六六"),new Person("张八"));
        System.out.println(arrayList);
        System.out.println("==========================");

        //创建第一个队伍名字只要三个字的队员
        ArrayList<Person> arrayList1 = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).getName().length() == 3){
                arrayList1.add(arrayList.get(i));
            }
        }
        System.out.println(arrayList1);
        arrayList.removeAll(arrayList1);
        System.out.println(arrayList);
        System.out.println("==========================");

        //创建第二个队伍只要第一个队伍筛选之后只要前三个队员
        ArrayList<Person> arrayList2 = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if(i <= 2){
                arrayList2.add(arrayList.get(i));
            }
        }
        System.out.println(arrayList2);
        arrayList.removeAll(arrayList2);
        System.out.println(arrayList);
        System.out.println("==========================");

        //创建第三个队伍第二个队伍赛选之后不要前两名队员而且只要张性队员
        ArrayList<Person> arrayList3 = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if(i > 2 && arrayList.get(i).getName().startsWith("张")){
                arrayList3.add(arrayList.get(i));

            }
        }

        System.out.println(arrayList3);
        arrayList.removeAll(arrayList3);
        System.out.println(arrayList);
        //创建第四个队伍

    }
}
