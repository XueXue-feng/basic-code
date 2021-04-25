package cn.itcast.dayweb.demo01.demo10collection;

import java.util.HashSet;

/*
* Set集合存储自定义类型：前提就是重写Object的hashCode()和equals()方法
* */
public class Demo06HashSetSavePerson {
    public static void main(String[] args) {
        //要求集合中不能存储同名同年龄的人
        Person person1 = new Person("迪丽热巴",19);
        Person person2 = new Person("迪丽热巴",19);
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(person1);
        hashSet.add(person2);
        /*for(Person person:hashSet){
            System.out.println(person.getName() + person.getAge());
        }*/
        System.out.println(hashSet);
    }
}
