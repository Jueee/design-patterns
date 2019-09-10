package com.jueee.example02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public abstract class AbstractMySQLExecute<IN> {

    protected PreparedStatement ps;
    protected BasicDataSource dataSource;
    private Connection conn;

    public void open() throws Exception {
        dataSource = new BasicDataSource();
        conn = getConnection(dataSource);
        conn.setAutoCommit(false);
        ps = this.conn.prepareStatement(buildSQL());
    }

    private static Connection getConnection(BasicDataSource dataSource) {
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("jue");
        dataSource.setInitialSize(10);
        dataSource.setMaxTotal(50);
        dataSource.setMinIdle(2);

        Connection con = null;
        try {
            con = dataSource.getConnection();
            System.out.println("create connection：" + con);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("get connection causes exception, msg = " + e.getMessage());
        }
        return con;
    }

    abstract String buildSQL();

    abstract void doInvoke(IN in) throws Exception;

    public void invoke(IN in) throws Exception {
        try {
            open();
            doInvoke(in);
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } finally {
            close();
        }
    }

    public void close() throws Exception {
        if (ps != null) {
            ps.close();
        }
        if (conn != null) {
            conn.close();
        }
    }
}
