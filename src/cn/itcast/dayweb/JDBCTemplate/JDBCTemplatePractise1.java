package cn.itcast.dayweb.JDBCTemplate;

import cn.itcast.dayweb.JDBCDruid.JDBCDruidUtils;
import com.sample.Emp;
import org.junit.Test;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @ProjectName: basic-code
 * @Package: cn.itcast.dayweb.JDBCTemplate
 * @ClassName: JDBCTempletePractise1
 * @Author: XueXue-Li
 * @Description: 修改id为1的数据的工资为10000
 * @Date: 2021/5/19 15:40
 * @Version: 1.0
 */
public class JDBCTemplatePractise1 {
    private static JdbcTemplate template = new JdbcTemplate(JDBCDruidUtils.getDataSource());

    public static void main(String[] args) {
       // editEmp(1001);
        //queryEmpForMap(1001);
       // queryEmpForList();
        //queryForEmpList();
        //queryForEmpList2();
        queryCount();
        //queryEmp();
    }
    //传入一个id，修改emp表中对应的数据
    public static boolean editEmp(int id){
        //首先查询这个id是否在emp表中存在
        String sql1 = "Select id from emp where id = ?";
        //防止SQL注入
        Map<String, Object> stringObjectMap = null;
        try {
            stringObjectMap = template.queryForMap(sql1, id);
        }catch (EmptyResultDataAccessException e){

        }finally {
            if (stringObjectMap == null) {
                System.out.println("这个id不存在");
                return false;
            } else {
                String sql2 = "Update emp Set ename = ? WHERE id = ?";
                int count = template.update(sql2,  "吴小尊",id);
                System.out.println(count);
                return true;
            }
        }

    }

    //查询表中id为1001的用户并将其封装成map集合
    public static void queryEmpForMap(int id){
        String sql = "select * from emp where id = ?";
        Map<String,Object> stringObjectMap = template.queryForMap(sql,id);
        //遍历Map集合
        Set<Map.Entry<String, Object>> entrySet = stringObjectMap.entrySet();
        Iterator<Map.Entry<String, Object>> iterator = entrySet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    //查询表中所有数据并将其封装为list集合
    public static void queryEmpForList(){
        String sql = "select * from emp";
        List<Map<String, Object>> list = template.queryForList(sql);
       //遍历list集合
        for (Map<String, Object> stringObjectMap : list) {
            Set<Map.Entry<String, Object>> entries = stringObjectMap.entrySet();
            Iterator<Map.Entry<String, Object>> iterator = entries.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }

        }
    }

    //查询表中所有数据并将其封装为Emp类型list集合
    public static void queryForEmpList(){
        String sql = "Select * from emp";
        List<Emp> list = template.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet resultSet, int i) throws SQLException {
                long id = resultSet.getLong("id");
                String ename = resultSet.getString("ename");
                long job_id = resultSet.getLong("job_id");
                long mgr = resultSet.getLong("mgr");
                Date joindate = resultSet.getDate("joindate");
                double salary = resultSet.getDouble("salary");
                double bonus = resultSet.getDouble("bonus");
                long dept_id = resultSet.getLong("dept_id");
                Emp emp = new Emp(id, ename, job_id, mgr, joindate, salary, bonus, dept_id);
                return emp;
            }
        });
        for (com.sample.Emp emp : list) {
            System.out.println(emp);
        }
    }

    //查询表中所有数据并将其封装为Emp类型list集合
    public static void queryForEmpList2(){
        String sql = "select * from emp";
        List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        for (com.sample.Emp emp : list) {
            System.out.println(emp);
        }
    }

    //查询表中有几条记录
    public static void queryCount(){
        String sql = "select count(id) from emp";
        Integer integer = template.queryForObject(sql, Integer.class);//一般是用来执行聚合函数的
        System.out.println(integer);
    }

    //查询员工姓名，工资，职务名称，职务描述，部门名称，部门位置，工资等级
    public static void queryEmp(){
        String sql = "SELECT t1.ename,t1.salary,t2.jname,t2.description,t3.dname,t3.loc,t4.grade FROM\n" +
                "emp AS t1,job AS t2,dept AS t3,salarygrade AS t4 WHERE t1.job_id = t2.id AND t1.dept_id\n" +
                "= t3.id AND t1.salary BETWEEN t4.losalary AND t4.hisalary";
        List<EmpShow> query = template.query(sql, new BeanPropertyRowMapper<EmpShow>(EmpShow.class));
        for (EmpShow empShow : query) {
            System.out.println(empShow);
        }
    }
}
