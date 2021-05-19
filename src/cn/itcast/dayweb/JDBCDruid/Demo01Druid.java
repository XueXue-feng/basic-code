package cn.itcast.dayweb.JDBCDruid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.util.Properties;

/**
 * @ProjectName: basic-code
 * @Package: cn.itcast.dayweb.JDBCDruid
 * @ClassName: Demo01Druid
 * @Author: XueXue-Li
 * @Description:
 * @Date: 2021/5/17 17:04
 * @Version: 1.0
 */
public class Demo01Druid {
    public static void main(String[] args) throws Exception {
        //创建数据库连接池对象
        InputStream resourceAsStream = Demo01Druid.class.getClassLoader().getResourceAsStream("druid.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        //创建链接对象
        Connection connection = dataSource.getConnection();
        System.out.println(connection);//com.mysql.cj.jdbc.ConnectionImpl@1a5a4e19
    }
}
