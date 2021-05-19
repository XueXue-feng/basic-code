package cn.itcast.dayweb.JDBCTemplate;

/**
 * @ProjectName: basic-code
 * @Package: cn.itcast.dayweb.JDBCTemplate
 * @ClassName: EmpShow
 * @Author: XueXue-Li
 * @Description: emp表的视图
 * @Date: 2021/5/19 18:55
 * @Version: 1.0
 */
public class EmpShow {
    private String ename;
    private Double salary;
    private String jname;
    private  String description;
    private String dname;
    private String loc;
    private Integer grade;

    @Override
    public String toString() {
        return "EmpShow{" +
                "ename='" + ename + '\'' +
                ", salary=" + salary +
                ", jname='" + jname + '\'' +
                ", description='" + description + '\'' +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                ", grade=" + grade +
                '}';
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
