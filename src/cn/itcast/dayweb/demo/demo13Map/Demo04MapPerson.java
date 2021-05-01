package cn.itcast.dayweb.demo.demo13Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo04MapPerson {
    public static void main(String[] args) {
        //创建Map对象Map<String,Person>String中已经重写了hashCode()和equals()方法
        Map<String,Person> map = new HashMap<>();
        map.put("北京",new Person("迪丽热巴",19));
        map.put("上海",new Person("古力娜扎",18));
        map.put("广州",new Person("马尔扎哈",19));
        map.put("北京",new Person("杨幂",19));

        //遍历mapKey相同则覆盖原有的Value值
        Set<Map.Entry<String, Person>> entries = map.entrySet();
        Iterator<Map.Entry<String, Person>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Person> mapPerson = iterator.next();
            System.out.println(mapPerson.getKey() + "=" + mapPerson.getValue());
        }

        //创建Map对象Map<Person,String>SPerson必须重写hashCode()和equals()方法
        HashMap<Person,String> hashMap = new HashMap<>();
        hashMap.put(new Person("迪丽热巴",19),"1");
        hashMap.put(new Person("古力娜扎",19),"2");
        hashMap.put(new Person("马尔扎哈",19),"3");
        hashMap.put(new Person("迪丽热巴",19),"4");

        //遍历
        for(Person person:hashMap.keySet()){
            System.out.println(hashMap.get(person));
        }
    }
}
