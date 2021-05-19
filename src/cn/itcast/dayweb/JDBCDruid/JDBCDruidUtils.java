package cn.itcast.dayweb.JDBCDruid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @ProjectName: basic-code
 * @Package: cn.itcast.dayweb.JDBCDruid
 * @ClassName: JDBCDruidUtils
 * @Author: XueXue-Li
 * @Description: 创建Druid连接池的工具类
 * @Date: 2021/5/17 18:12
 * @Version: 1.0
 */
public class JDBCDruidUtils {
    private static DataSource dataSource;
    static{
        try {
            //在静态代码块中加载配置文件
            Properties properties = new Properties();
            properties.load(JDBCDruidUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            //在静态代码块中创建连接池对象
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //创建获取连接的方法
    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            return connection;
        }

    }

    //DML方法的归还连接池对象
    public static void close(Statement statement,Connection connection){
        if(connection != null){
            try {
                connection.close();
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
    }
    //查询方法的归还连接池对象
    public static void close(ResultSet resultSet,Statement statement, Connection connection){
        if(resultSet != null){
            try {
                resultSet.close();
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
        if(statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //获取连接池方法
    public static DataSource getDataSource(){
        return dataSource;
    }
}
