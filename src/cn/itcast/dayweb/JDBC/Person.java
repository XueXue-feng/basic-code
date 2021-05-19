package cn.itcast.dayweb.JDBC;

/**
 * @ProjectName: basic-code
 * @Package: cn.itcast.dayweb.JDBC
 * @ClassName: Person
 * @Author: XueXue-Li
 * @Description: 用来封装用户的用户名和密码
 * @Date: 2021/5/15 22:28
 * @Version: 1.0
 */
public class Person {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Person() {
    }
}
