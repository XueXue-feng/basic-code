package cn.itcast.dayweb.reflect;

import cn.itcast.dayweb.reflect.deman.Person;

import java.lang.reflect.Constructor;

/*
* 2.获取构造方法们
 * Constructor<T> getConstructor(Class<?>... parameterTypes)
 * Constructor<?>[] getConstructors() 返回一个包含 Constructor对象的数组， Constructor对象反映了由该 Class对象表示的类的所有公共构造函数。
 * Constructor<?>[] getDeclaredConstructors()
 * Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
 *
 * java.reflect.T Constructor newInstance(Object... initargs)用来创建对象的成员方法
* */
public class Demo03ReflectConstructor {
    public static void main(String[] args) throws Exception{
        //先获取Person的字节码文件
        Person person = new Person();
        Class personClass = person.getClass();

        //getConstructor(Class<?>... parameterTypes)
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);//public cn.itcast.dayweb.reflect.deman.Person(java.lang.String,int)
        //使用返回的构造器对象来创建对象
        Object obj1 = constructor.newInstance("赵六", 19);
        System.out.println(obj1);//看构造方法

        //创建空参的构造方法
        Constructor constructor1 = personClass.getConstructor();
        Object obj2 = constructor1.newInstance();
        System.out.println(obj2);
        //Class方法中定义了构造无参的构造方法
        Object obj3 = personClass.newInstance();
        System.out.println(obj3);
        System.out.println("==================================");

        //Constructor<?>[] getConstructors()获取用public修饰的构造方法
        Constructor[] constructors = personClass.getConstructors();
        for (Constructor constructor2 : constructors) {
            System.out.println(constructor2);
        }

        System.out.println("==================================");
        //Constructor<?>[] getDeclaredConstructors()获取所有的构造方法不局限于修饰符
        Constructor[] declaredConstructors = personClass.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        Constructor declaredConstructor = personClass.getDeclaredConstructor();
        //获取私有化的构造方法需要解除权限修饰符
        declaredConstructor.setAccessible(true);

    }
}
