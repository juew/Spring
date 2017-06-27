package com.dao.employeeDao;

import com.bean.employeeBean.Employee;

import java.util.List;

/**
 * Created by user on 2017/5/15.
 */
public interface EmployeeDao  {

    List<Employee> findAllEmployee();

    void add(Employee employee);

    void delete(String employeeId);

    void updata(Employee employee);

    Employee findEmployee(String employeeId);
}

