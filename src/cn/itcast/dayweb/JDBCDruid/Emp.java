package cn.itcast.dayweb.JDBCDruid;

import java.util.Date;
import java.util.Objects;

/**
 * @ProjectName: basic-code
 * @Package: cn.itcast.dayweb.JDBC
 * @ClassName: Emp
 * @Author: XueXue-Li
 * @Description: sql类
 * @Date: 2021/5/15 22:01
 * @Version: 1.0
 */
public class Emp {
    private int id;
    private String ename;
    private int job_id;
    private int mgr;

    public Emp(int id, String ename, int job_id, int mgr, Date joindate, double salary, double bonus, int dept_id) {
        this.id = id;
        this.ename = ename;
        this.job_id = job_id;
        this.mgr = mgr;
        this.joindate = joindate;
        this.salary = salary;
        this.bonus = bonus;
        this.dept_id = dept_id;
    }

    public Emp() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return id == emp.id && job_id == emp.job_id && mgr == emp.mgr && Double.compare(emp.salary, salary) == 0 && Double.compare(emp.bonus, bonus) == 0 && dept_id == emp.dept_id && Objects.equals(ename, emp.ename) && Objects.equals(joindate, emp.joindate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ename, job_id, mgr, joindate, salary, bonus, dept_id);
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", job_id=" + job_id +
                ", mgr=" + mgr +
                ", joindate=" + joindate +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", dept_id=" + dept_id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public Date getJoindate() {
        return joindate;
    }

    public void setJoindate(Date joindate) {
        this.joindate = joindate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    private Date joindate;
    private double salary;
    private double bonus;
    private int dept_id;
}
