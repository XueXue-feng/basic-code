package cn.itcast.dayweb.JDBCC3P0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @ProjectName: basic-code
 * @Package: cn.itcast.dayweb.JDBCC3P0
 * @ClassName: Demo01C3P0
 * @Author: XueXue-Li
 * @Description:
 *
 * com.mchange.v2.c3p0.impl.NewProxyConnection@6995bf68 数据库连接对象类名@哈希码
 * [wrapping: com.mysql.cj.jdbc.ConnectionImpl@65546bf2]
 *
 * @Date: 2021/5/17 16:11
 * @Version: 1.0
 */
public class Demo01C3P0 {
    public static void main(String[] args) {
        try {
            //创建数据库连接池对象configName中写的是p-config.xml中的名字
            DataSource dataSource = new ComboPooledDataSource("mysql");
            //获取连接
            Connection connection = dataSource.getConnection();
            //3.使用连接对象
            System.out.println(connection);
            connection.close();//归还链接到连接池中
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //

    }
}
