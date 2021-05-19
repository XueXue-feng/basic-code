package cn.itcast.dayweb.JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ProjectName: basic-code
 * @Package: cn.itcast.dayweb.JDBC
 * @ClassName: Practise
 * @Author: XueXue-Li
 * @Description: 遍历ResultSet并把结果封装在对象中
 * @Date: 2021/5/15 22:23
 * @Version: 1.0
 */
public class Practise {
    public static void main(String[] args) {
        List<Emp> list = new Practise().findAll();
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    public List<Emp> findAll(){
        Statement statement = null;
        //获取数据库的连接和连接对象
        Connection connection = getConnection(stringFromScanner());
        //定义sql
        String sql = "SELECT * FROM emp";
        List<Emp> list = new ArrayList<>();
        ResultSet resultSet = null;
        //获取执行sql的statement对象
        try {
            statement = connection.createStatement();
            //执行sql
            resultSet = statement.executeQuery(sql);
            //遍历resultSet
            Emp emp = null;
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String ename = resultSet.getString("ename");
                int job_id = resultSet.getInt("job_id");
                int mgr = resultSet.getInt("mgr");
                Date joindate = resultSet.getDate("joindate");
                double salary = resultSet.getDouble("salary");
                double bonus = resultSet.getDouble("bonus");
                int dept_id = resultSet.getInt("dept_id");
                emp = new Emp(id,ename,job_id,mgr,joindate,salary,bonus,dept_id);
                //将对象装载进数组
                list.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }


    //获取数据库的连接
    public Connection getConnection(Person person){
        //从Person对象中获取用户名和密码
        String userName = person.getName();
        String userPassword = person.getPassword();
        Connection connection = null;
        try {
            //获取数据库的连接
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取数据库的Connection连接对象
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3?", userName, userPassword);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }/*finally {
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            return connection;
        }*/
        return connection;
    }

    //获取从键盘中输入的用户名和密码
    public Person stringFromScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String root = scanner.next();
        System.out.print("请输入用户名密码：");
        String password = scanner.next();
        return new Person(root,password);

    }
}
