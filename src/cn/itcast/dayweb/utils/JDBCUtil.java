package cn.itcast.dayweb.utils;

import java.io.*;
import java.sql.*;
import java.util.Properties;

/**
 * @ProjectName: basic-code
 * @Package: cn.itcast.dayweb.utils
 * @ClassName: JDBCUtil
 * @Author: XueXue-Li
 * @Description: JDBC的工具类
 * 1.抽取一个方法来获取连接
 * 2.抽取一个方法来释放资源
 * @Date: 2021/5/16 12:07
 * @Version: 1.0
 */
public class JDBCUtil {

    private static String url;
    private static String user;
    private static String password;
    private static String driver;
    /**
     * 文件的读取，只需要读取一次即可拿到这些值
     */
    static{
        //读取
        try {
            /*FileReader fr = new FileReader("D:\\IntelliJ IDEA 2020.3.3\\code\\" +
                    "day04-code\\src\\jdbc.properties");*/
            //获取src路径下文件的方式
            String path = JDBCUtil.class.getClassLoader().getResource("jdbc.properties").getPath();
            FileReader fr = new FileReader(path);
            Properties properties = new Properties();
            properties.load(fr);
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            driver = properties.getProperty("Driver");
            //注册驱动
            Class.forName(driver);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    /**
     * 获取连接
     * @return 连接的对象
     */
    public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(url,user,password);
    }

    /**
     * 释放DML语句的资源
     * @param statement 获取SQL对象
     * @param connection 获取连接对象
     */
    public static void close(Statement statement,Connection connection){
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

    /**
     * 释放查询类的资源
     * @param resultSet 查询后的结果集对象
     * @param statement 获取SQL对象
     * @param connection 获取连接对象
     */
    public static void close(ResultSet resultSet, Statement statement, Connection connection){
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

}
