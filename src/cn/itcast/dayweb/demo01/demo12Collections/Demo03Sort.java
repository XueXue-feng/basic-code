package cn.itcast.dayweb.demo01.demo12Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
* Comparable和Comparator的区别：Comparable是自己（this）和别人（参数）比较，需要实现Comparable接口并重写compareTo()
* Comparator:是找第三方裁判来比较，排序规则o1-o2就是升序
* */
public class Demo03Sort {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,1,2,3,4,5,6,7);
        System.out.println(arrayList);//[1, 2, 3, 4, 5, 6, 7]

        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;//降序
            }
        });
        System.out.println(arrayList);//[7, 6, 5, 4, 3, 2, 1]

        ArrayList<Student> arrayListStudent = new ArrayList<>();
        arrayListStudent.add(new Student("小米",10));
        arrayListStudent.add(new Student("小明",17));
        arrayListStudent.add(new Student("小花",15));
        arrayListStudent.add(new Student("小菜",12));
        System.out.println(arrayListStudent);

        Collections.sort(arrayListStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //按照年龄的顺序来升序排序
                int result = o1.getAge() - o2.getAge();
                //如果年龄一样则按照名字排序
                if(result == 0){
                    result = o1.getName().charAt(0) - o1.getName().charAt(0);
                    return result;
                }
                return result;
            }
        });
        System.out.println(arrayListStudent);
     }
}
