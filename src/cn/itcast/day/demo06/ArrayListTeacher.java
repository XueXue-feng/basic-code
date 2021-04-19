package cn.itcast.day.demo06;

import java.util.ArrayList;

/*
* 向集合中添加自定义对象
* */
public class ArrayListTeacher {
    public static void main(String[] args) {
        ArrayList<Teacher> arrayList = new ArrayList<>();
        arrayList.add(new Teacher("迪丽热巴",19));
        Teacher teacher = new Teacher();
        teacher.setAge(20);
        teacher.setName("古力娜扎");
        arrayList.add(teacher);
        System.out.println(arrayList.get(0).getName());//古力娜扎
    }
}
