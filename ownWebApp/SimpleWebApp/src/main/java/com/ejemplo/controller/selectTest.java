package com.ejemplo.controller;

import java.sql.*;

public class selectTest {
    static final String DB_URL = "jdbc:mariadb://localhsot:3306/simple_web_app";
    static final String USER = "java";
    static final String PASS = "java123";
    static final String QUERY = "select nombre from usuario";

    public static void main(String[] args) throws SQLException {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY); {
            while (rs.next()){
                System.out.print("ID: " + rs.getInt("id"));
            }
        }
    }
}
