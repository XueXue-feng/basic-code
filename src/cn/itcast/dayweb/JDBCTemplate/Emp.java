package com.sample;

import java.sql.Date;

public class Emp {

  private Long id;
  private String ename;
  private Long jobId;
  private Long mgr;
  private Date joindate;

  @Override
  public String toString() {
    return "Emp{" +
            "id=" + id +
            ", ename='" + ename + '\'' +
            ", jobId=" + jobId +
            ", mgr=" + mgr +
            ", joindate=" + joindate +
            ", salary=" + salary +
            ", bonus=" + bonus +
            ", deptId=" + deptId +
            '}';
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEname() {
    return ename;
  }

  public void setEname(String ename) {
    this.ename = ename;
  }

  public Long getJobId() {
    return jobId;
  }

  public void setJobId(Long jobId) {
    this.jobId = jobId;
  }

  public Long getMgr() {
    return mgr;
  }

  public void setMgr(Long mgr) {
    this.mgr = mgr;
  }

  public Date getJoindate() {
    return joindate;
  }

  public void setJoindate(Date joindate) {
    this.joindate = joindate;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public Double getBonus() {
    return bonus;
  }

  public void setBonus(Double bonus) {
    this.bonus = bonus;
  }

  public Long getDeptId() {
    return deptId;
  }

  public void setDeptId(Long deptId) {
    this.deptId = deptId;
  }

  public Emp(Long id, String ename, Long jobId, Long mgr, Date joindate, Double salary, Double bonus, Long deptId) {
    this.id = id;
    this.ename = ename;
    this.jobId = jobId;
    this.mgr = mgr;
    this.joindate = joindate;
    this.salary = salary;
    this.bonus = bonus;
    this.deptId = deptId;
  }

  public Emp() {
  }

  private Double salary;
  private Double bonus;
  private Long deptId;


}
