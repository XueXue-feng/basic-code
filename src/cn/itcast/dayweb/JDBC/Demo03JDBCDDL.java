package cn.itcast.dayweb.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @ProjectName: basic-code
 * @Package: cn.itcast.dayweb.JDBC
 * @ClassName: Demo03JDBCDDL
 * @Author: XueXue-Li
 * @Description: JDBC执行DDL语句
 * @Date: 2021/5/15 21:16
 * @Version: 1.0
 */
public class Demo03JDBCDDL {
    public static void main(String[] args){
        Connection connection = null;
        Statement statement = null;
        //获取并注册驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取数据库的连接对象
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4?" +
                    "", "xuexue", "Lxf5201314..");
            //获取执行SQL语句的对象
            statement = connection.createStatement();
            //执行DDL语句,通过SQL语句来操作数据库和表
            String sql = "create table student(id int,name varchar(10))";
            //执行SQL
            int count = statement.executeUpdate(sql);
            System.out.println(count);//0 执行DDL语句返回结果为0
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
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



    }
}
