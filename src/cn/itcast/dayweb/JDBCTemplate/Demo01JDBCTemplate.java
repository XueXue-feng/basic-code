package cn.itcast.dayweb.JDBCTemplate;

import cn.itcast.dayweb.JDBCDruid.JDBCDruidUtils;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @ProjectName: basic-code
 * @Package: cn.itcast.dayweb.JDBCTemplate
 * @ClassName: Demo01JDBCTemplate入门
 * @Author: XueXue-Li
 * @Description:
 * @Date: 2021/5/17 19:30
 * @Version: 1.0
 */
public class Demo01JDBCTemplate {
    public static void main(String[] args) {
        //获取JDBCTemplate对象
        DataSource dataSource = JDBCDruidUtils.getDataSource();
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        //执行SQL
        int count = jdbcTemplate.update("Update emp SET ename = ? where id = ?","齐天大圣", 1001);
        System.out.println(count);

    }
}
