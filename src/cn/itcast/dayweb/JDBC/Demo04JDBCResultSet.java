package cn.itcast.dayweb.JDBC;

import java.sql.*;

/**
 * @ProjectName: basic-code
 * @Package: cn.itcast.dayweb.JDBC
 * @ClassName: Demo04JDBCResultSet
 * @Author: XueXue-Li
 * @Description: 对ResultSet的使用
 * @Date: 2021/5/15 21:33
 * @Version: 1.0
 */
public class Demo04JDBCResultSet {
    public static void main(String[] args) {
        Statement statement = null;
        Connection connection = null;
        ResultSet resultSet = null;
        try {
            //获取驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取Connection对象
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4?", "xuexue", "Lxf5201314..");
            //编写SQL语句
            String sql = "select * from p_account";
            //获取执行sql对象
            statement = connection.createStatement();
            //执行sql
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                //循环判断游标是否位于最后一行末尾
                System.out.println(resultSet.getInt("id"));
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }

            }
            if(connection != null){

                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
