package cn.itcast.dayweb.reflect;

import cn.itcast.dayweb.reflect.deman.Person;

import java.lang.reflect.Method;

/*
获取成员方法们
* Method getMethod(String name, Class<?>... parameterTypes) 返回一个 方法对象，该对象反映由该 Class对象表示的类或接口的指定公共成员方法。
 * Method[] getMethods()
 * Method getDeclaredMethod(String name, Class<?>... parameterTypes)
 * Method[] getDeclaredMethods()

 //获取方法对象
 Object invoke(Object obj, Object... args) 用来执行方法
 String getName()获取方法的名称
* */
public class Demo04ReflectMethod {
    public static void main(String[] args) throws Exception {
        //创建一个Class对象
        Class<Person> personClass = Person.class;
        //getMethods()
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);//获取public修饰的方法
        }
        System.out.println("=========================");
        //getMethod(String name, Class<?>... parameterTypes)
        Method sleep = personClass.getMethod("sleep");
        Method eat = personClass.getMethod("eat", String.class);
        //创建一个Person对象
        Person person = new Person();
        //执行eat方法
        Object obj1 = eat.invoke(person, "西红柿");
        System.out.println(sleep);
        System.out.println("=========================");
        //Method[] getDeclaredMethods()
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);//获取自己定义的所有方法
        }

        System.out.println("=========================");
        //Method[] getDeclaredMethods()
        Method[] declaredMethods2 =personClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods2) {
            System.out.println(declaredMethod.getName());//打印方法的名称
        }

        //获取类名
        String className = personClass.getName();
        System.out.println(className);//cn.itcast.dayweb.reflect.deman.Person全类名

    }
}
