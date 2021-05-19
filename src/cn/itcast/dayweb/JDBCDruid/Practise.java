package cn.itcast.dayweb.JDBCDruid;

import java.sql.*;
import java.util.ArrayList;

/**
 * @ProjectName: basic-code
 * @Package: cn.itcast.dayweb.JDBCDruid
 * @ClassName: Practise
 * @Author: XueXue-Li
 * @Description: 对JDBCDruidUtils的测试
 * @Date: 2021/5/17 18:27
 * @Version: 1.0
 */
public class Practise {
    public static void main(String[] args) throws SQLException {
        //查询db3数据库emp表中的所有数据
        //获取数据库的连接
        Connection connection = JDBCDruidUtils.getConnection();
        //获取执行SQL的对象
        String sql = "SELECT * FROM emp";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        //封装数据库对象
        ArrayList<Emp> arrayList = new ArrayList<>();
        Emp emp;
        //遍历resultSet
        while(resultSet.next()){
            int id = resultSet.getInt("id");
            String ename = resultSet.getString("ename");
            int job_id = resultSet.getInt("job_id");
            int mgr = resultSet.getInt("mgr");
            Date joindate = resultSet.getDate("joindate");
            double salary = resultSet.getDouble("salary");
            double bonus = resultSet.getDouble("bonus");
            int dept_id = resultSet.getInt("dept_id");
            emp = new Emp(id,ename,job_id,mgr,joindate,salary,bonus,dept_id);
            //将对象装载进数组
            arrayList.add(emp);
        }
        System.out.println(arrayList);
        JDBCDruidUtils.close(resultSet,preparedStatement,connection);

    }
}
