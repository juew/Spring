package com.utill;
import com.utill.inceptor.InceptorConnectionUtill;

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
        /**
         * 除了连接用语法不一样,其他的连接操作,和结构化数据库(oracle、mysql等)相差无几
         */
        //创建工具类实例，创建inceptor连接对象
        InceptorConnectionUtill connectionUtill = new InceptorConnectionUtill("192.168.0.137","system","","");
        //获取Statement对象
        Statement st  =  connectionUtill.getStatement();
        //定义sql语句，这里是做一个查询测试
        String sql = "select *  from dual  limit 5";
        //try-catch模块是java一种捕获异常的方式，在try模块中运行的所有代码，都会被监控
        try {
            //通过Statement对象执行sql，获取到结果集对象ResultSet
            ResultSet rs =  st.executeQuery(sql);
            //遍历结果集，打印出value，获取到的数据都是key-value形式，key对应的是数据库的字段名
            while (rs.next()){
                    String a1 = rs.getString("dummy");
                    System.out.println( "得到數據："+a1);
            }
        } catch (SQLException e) {//如果try模块代码出现异常，会被catch模块捕获，并处理，这里选择在命令行中打印出异常信息。、
            e.printStackTrace();
        } finally {//finally后面的内容无论程序是否执行成功，都一定会在最后执行
            connectionUtill.closeConnectionAndStatement();//调用关闭方法关闭数据连接
        }

    }
}
