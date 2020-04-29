package com.tieda.alarm.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class GeneratorSql {


    private static final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
    private static final String USERNAME = "csmiskmn";
    private static final String PASSWORD = "csmiskmn";
    private static final String URL = "jdbc:oracle:thin:@192.168.31.88:1521:orcl";

    public static void main(String[] args) {
        String sql = "create table my_project_test(tepno int, tepname char(10) )";//+
               /* "tablespace CSMIS\n" +
                "  pctfree 10\n" +
                "  initrans 1\n" +
                "  maxtrans 255\n" +
                "  storage\n" +
                "  (\n" +
                "    initial 64K\n" +
                "    next 1M\n" +
                "    minextents 1\n" +
                "    maxextents unlimited\n" +
                "  )";*/
        create(DRIVER_NAME, URL, USERNAME, PASSWORD, sql);
    }


    public static void create(String driver, String url, String name, String pwd, String sql) {
        Connection conn = null;
        //PreparedStatement stmt = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, name, pwd);
            /*stmt = conn.prepareStatement(sql);
            System.out.println(stmt.execute());*/

            stmt = conn.createStatement();
            System.out.println(stmt.execute(sql));
            /*if(0 == stmt.executeLargeUpdate(sql))
            {
                System.out.println("成功创建表！");
            }
            else
            {
                System.out.println("创建表失败！");
            }*/
            //
            stmt.close();
            conn.close();
            System.out.println("//关闭资源" );
        } catch (Exception e) {
            System.out.println("创建表失败！" );
            e.printStackTrace();
        }
    }

}
