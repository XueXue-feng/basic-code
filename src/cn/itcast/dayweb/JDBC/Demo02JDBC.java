package cn.itcast.dayweb.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @ProjectName: basic-code
 * @Package: cn.itcast.dayweb.JDBC
 * @ClassName: Demo02JDBC
 * @Author: XueXue-Li
 * @Description: 练习Statement的增删改
 * @Date: 2021/5/15 20:41
 * @Version: 1.0
 */
public class Demo02JDBC {
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
        //为p_account添加一条记录
       // String sql = "INSERT INTO p_account(NAME,balance) VALUES('xuexue',1000)";
       // String sql = "UPDATE p_account SET balance = 1300 WHERE id = 1";
        String sql = "DELETE FROM p_account WHERE id = 1";
        //执行SQL
        int count = statement.executeUpdate(sql);
        System.out.println(count);
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
