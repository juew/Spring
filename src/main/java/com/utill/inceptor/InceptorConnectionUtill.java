package com.utill.inceptor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by user on 2017/6/15.
 */
public  class InceptorConnectionUtill {
    private static Log LOG = LogFactory.getLog(InceptorConnectionUtill.class);
    //inceptor驱动名,格式固定
    String driverName = "org.apache.hive.jdbc.HiveDriver";
    String inceptorServerHost;
    String username;
    String password;
    String url;
    Connection connection= null;;
    Statement statement;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    /**
     *
     * @param inceptorServerHost inceptor server所在节点IP
     * @param databaseName 链接的数据库名
     * @param username Hive的用户名,如果没有开启权限可以不用填写
     * @param password
     *
     */
    public InceptorConnectionUtill(String inceptorServerHost,String databaseName,String username,String password) {
        this.inceptorServerHost = inceptorServerHost;
        this.username = username;
        this.password = password;
        this.url = "jdbc:hive2://" + inceptorServerHost + ":10000/"+databaseName;
        try{
            Class.forName(driverName);
            //通过java sql对象调用inceptor驱动,获取inceptor连接对象
            this.connection = DriverManager.getConnection(url,"","");
            this.statement=connection.createStatement();
        }catch (SQLException e){
            LOG.error(e.getMessage());
            /*将当前程序窗口关闭*/
            System.exit(1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 关闭connection & statement
     *
     */
    public void closeConnectionAndStatement() {
        if (null != this.connection) {
            try {
                this.connection.close();
            } catch (SQLException e) {
                LOG.error("connection close error", e);
            }
        }
        if (null != this.statement) {
            try {
                this.statement.close();
            } catch (SQLException e) {
                LOG.error("statement close error", e);
            }
        }
    }



}
