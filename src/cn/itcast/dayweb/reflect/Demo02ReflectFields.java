package cn.itcast.dayweb.reflect;

import cn.itcast.dayweb.reflect.deman.Person;

import java.lang.reflect.Field;

/*
* Class类的功能：1.获取的方法-->
* 1.获取成员变量们:
* Field[] getField(String name) 获取指定名称的public修饰的成员变量
* Field[] getFields() 获取所有public 修饰的成员变量的
* 获取到Field成员变量我们可以设置变量：get(Object obj)
* 获取变量：set(Object obj, Object value)
* Field[] getDeclaredFields() 获取所有成员变量不考虑修饰符
* Field getDeclaredField(String name) 获取指定名称的不考虑权限修饰符的成员变量
* setAccessible忽略修饰符暴力反射方法
 * 2.获取构造方法们
 * getConstructor(Class<?>... parameterTypes)
 * getConstructors() 返回一个包含 Constructor对象的数组， Constructor对象反映了由该 Class对象表示的类的所有公共构造函数。
 * getDeclaredConstructors()
 *getDeclaredConstructor(Class<?>... parameterTypes)
 * 3.获取成员方法们
 * getMethod(String name, Class<?>... parameterTypes) 返回一个 方法对象，该对象反映由该 Class对象表示的类或接口的指定公共成员方法。
 * getMethods()
 * getDeclaredMethod(String name, Class<?>... parameterTypes)
 * getDeclaredMethods()
 * 4.获取类名 getName() 返回由该 Class对象表示的实体（类，接口，数组类，原始类型或无效）的 Class，作为 String 。
 * */
public class Demo02ReflectFields {
    public static void main(String[] args) throws Exception {
        //先获取Person的字节码文件
        Person person = new Person();
        Class personClass = person.getClass();

        //获取成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);//public java.lang.String cn.itcast.dayweb.reflect.deman.Person.str
        }

        System.out.println("============================");
        //获取指定名称的public成员变量
        Field fieldStr = personClass.getField("str");
        Object obj = fieldStr.get(person);
        System.out.println(obj);//null
        fieldStr.set(person,"张三");//设置person的值
        System.out.println(person);
        System.out.println("============================");

        //Field[] getDeclaredFields()
        Field[] declaredFields = personClass.getDeclaredFields();//获取全部的成员变量不考虑修饰符
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("============================");
        //获取私有的成员变量
        Field fieldName = personClass.getDeclaredField("name");
        System.out.println(fieldName);
        //忽略访问权限修饰符的安全检查
        fieldName.setAccessible(true);//暴力反射访问私有的成员变量
        Object obj2 = fieldName.get(person);//IllegalAccessException非法访问
        System.out.println(obj2);
        fieldName.set(person,"李四");
        System.out.println(person);

    }
}
