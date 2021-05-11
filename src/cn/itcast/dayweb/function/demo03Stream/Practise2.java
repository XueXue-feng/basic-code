package cn.itcast.dayweb.function.demo03Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/*
* 使用流简化操作
* */
public class Practise2 {
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
        //将数组转化为流
        Stream<Person> stream = arrayList.stream();
        System.out.println("==========================");

        //创建第一个队伍名字只要三个字的队员
        ArrayList<Person> arrayList1 = new ArrayList<>();
        Stream<Person> stream2 = stream.filter((Person person) -> {
            return person.getName().length() == 3;
        });
        stream2.forEach((person) -> {
            arrayList1.add(person);
            System.out.println(person.getName());});
        System.out.println("==========================");
        arrayList.removeAll(arrayList1);
        Stream<Person> stream3 = arrayList.stream();

        //创建第二个队伍只要第一个队伍筛选之后只要前三个队员
        ArrayList<Person> arrayList2 = new ArrayList<>();
        Stream<Person> limit = stream3.limit(3);
        limit.forEach((person)->{
            arrayList2.add(person);
            System.out.println(person.getName());
        });
        System.out.println("==========================");
        arrayList.removeAll(arrayList2);
        Stream<Person> stream4 = arrayList.stream();

        //创建第三个队伍第二个队伍赛选之后不要前两名队员而且只要张性队员
        ArrayList<Person> arrayList3 = new ArrayList<>();
        Stream<Person> stream5 = stream4.skip(2L).filter((person) -> {
            return person.getName().startsWith("张");
        });
        stream5.forEach((person)->{
            arrayList3.add(person);
            System.out.println(person.getName());
        });

    }
}
