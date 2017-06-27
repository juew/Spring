package com.dao.employeeDao.employeeDaoImpl;

import com.bean.employeeBean.Employee;
import com.dao.employeeDao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by user on 2017/5/15.
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDao{


    @Autowired
    private JdbcTemplate jdbcTemplate;



    @Override
    public List<Employee> findAllEmployee() {
        return null;
    }

    @Override
    public void add(Employee employee) {

    }

    @Override
    public void delete(String employeeId) {

    }

    @Override
    public void updata(Employee employee) {

    }

    @Override
    public Employee findEmployee(String employeeId) {
        String sql = "select * from employee where id = ?";
        RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<Employee>(Employee.class);
        Employee employee =  (Employee)jdbcTemplate.queryForObject(sql,rowMapper,employeeId);
        return employee;
    }

}
