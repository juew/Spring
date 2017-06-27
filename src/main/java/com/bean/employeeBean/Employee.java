package com.bean.employeeBean;

import java.sql.Date;
import java.sql.Timestamp;

public class Employee {
    private String id;
    private String name;
    private String departmentid;
    private String gender;
    private int age;
    private Date inductionttime;
    private String remarks;
    private Timestamp createtime;
    private Timestamp updatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getInductionttime() {
        return inductionttime;
    }

    public void setInductionttime(Date inductionttime) {
        this.inductionttime = inductionttime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public Timestamp getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Timestamp updatetime) {
        this.updatetime = updatetime;
    }

    //重写toString方法
    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", departmentid='" + departmentid + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", inductionttime=" + inductionttime +
                ", remarks='" + remarks + '\'' +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                '}';
    }
}
