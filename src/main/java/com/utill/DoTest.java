package com.utill;


import com.bean.employeeBean.Employee;
import com.dao.employeeDao.EmployeeDao;
import com.sun.org.apache.regexp.internal.RE;
import org.dom4j.rule.RuleSet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by user on 2017/5/16.
 */
public class DoTest {



    public static void main(String[] args) {
//
//        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//        JdbcTemplate jdbcTemplate=(JdbcTemplate) ctx.getBean("jdbcTemplate");
//
//        EmployeeDao employeeDao = (EmployeeDao)ctx.getBean("employeeDaoImpl");
//
//
//        Employee employee =  employeeDao.findEmployee("1");
//
//
//        System.out.println(employee.toString());

        InceptorConnectionUtill connectionUtill = new InceptorConnectionUtill("172.16.140.71","midas3_0","","");
        Statement st  =  connectionUtill.getStatement();
        String sql = "select *  from shanghai  limit 5";
        try {
            ResultSet rs =  st.executeQuery(sql);
            while (rs.next()){
                    String a1 = rs.getString("a1");
                    String a2 = rs.getString("a2");
                    System.out.println(a1 +"----------"+"#######"+"----------"+ a2);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectionUtill.closeConnectionAndStatement();
        }


    }
}
