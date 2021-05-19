package cn.itcast.dayweb.JDBC;

import cn.itcast.dayweb.utils.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ProjectName: basic-code
 * @Package: cn.itcast.dayweb.JDBC
 * @ClassName: Demo05JDBCConnection
 * @Author: XueXue-Li
 * @Description: Connection对事务的管理
 * @Date: 2021/5/16 19:38
 * @Version: 1.0
 */
public class Demo05JDBCConnection {
    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement preparedStatement1 = null;
        PreparedStatement preparedStatement2 = null;
        try {
            //获取数据库的连接
            connection = JDBCUtil.getConnection();
            //开启事务
            connection.setAutoCommit(false);//设为false即为开启事务
            //定义SQL zhangsan -500
            String sql1 = "Update p_account Set balance = balance - ? where name = ?";
            //定义SQL lisi + 500
            String sql2 = "Update p_account Set balance = balance + ? where name = ?";
            //获取执行SQL对象
            preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement2 = connection.prepareStatement(sql2);
            //设置参数
            preparedStatement1.setDouble(1,500);
            preparedStatement2.setDouble(1,500);
            preparedStatement1.setString(2,"zhangsan");
            preparedStatement2.setString(2,"lisi");
            //获取执行sql对象
            int count1 = preparedStatement1.executeUpdate();
            //手动制造异常
            //System.out.println(3/0);
            int count2 = preparedStatement2.executeUpdate();
            System.out.println(count1 + " ---->" + count2);
            connection.commit();
            //释放资源
            JDBCUtil.close(preparedStatement1,connection);
            JDBCUtil.close(preparedStatement2,connection);
        } catch (Exception e) {
            try {
                if(connection != null){
                    connection.rollback();
                }

            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}
