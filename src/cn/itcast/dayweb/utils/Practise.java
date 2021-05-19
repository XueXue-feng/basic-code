package cn.itcast.dayweb.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @ProjectName: basic-code
 * @Package: cn.itcast.dayweb.utils
 * @ClassName: Practsie 演示工具类
 * @Author: XueXue-Li
 * @Description:
 * @Date: 2021/5/16 14:21
 * @Version: 1.0
 */
public class Practise {
    public static void main(String[] args) {
        //创建数据库的连接
        try {
            Connection connection  = JDBCUtil.getConnection();
            //获取数据库SQL对象
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from emp");
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                System.out.println(id);
            }
            //释放资源
            JDBCUtil.close(resultSet,statement,connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
