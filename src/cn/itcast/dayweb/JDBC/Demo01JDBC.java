package cn.itcast.dayweb.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @ProjectName: basic-code
 * @Package: cn.itcast.dayweb.JDBC
 * @ClassName: Demo01JDBC
 * @Author: XueXue-Li
 * @Description: JDBC
 * @Date: 2021/5/15 14:07
 * @Version: 1.0
 */
public class Demo01JDBC {
    public static void main(String[] args) throws Exception {
        /*1.导入驱动架包mysql-connector-java-5.1.37-bin.jar
             1.将架包复制到项目的libs下
             2.将架包添加为library文件
         */
        //2.注册驱动 在mysql5.0之后注册驱动可以省略
        Class.forName("com.mysql.cj.jdbc.Driver");
        //3.获取数据库的连接对象
       // Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4?" +
         //       "user=xuexue&password=Lxf5201314..");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///db4?" +
                "user=xuexue&password=Lxf5201314..");
        //4.定义一个SQL语句
        String sql = "Update p_account Set balance = 1500 Where id = 1";
        //5.获取SQL的执行对象 Statement
        Statement connectionStatement = connection.createStatement();
        //6.执行SQL
        int count = connectionStatement.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        //8.释放资源
        connection.close();
        connectionStatement.close();
    }
}
