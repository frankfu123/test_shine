package com.qf.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcShine {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //加载驱动类
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("", "", "");
    }
}
