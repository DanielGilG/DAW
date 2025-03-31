package org.dgg.Komponisten.persistance.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    protected String database = "komponisten";
    protected String driver = "com.mysql.cj.jdbc.Driver";
    protected String hostname = "localhost";
    protected String port = "3306";
    protected String user = "daniel";
    protected String password = "daniel123";
    protected String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=true&serverTimezone=UTC";

    private static DatabaseConnection instance = null;
    public static DatabaseConnection getInstance(){
        if (instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public Connection connectionMySQL(){
        Connection connection = null;

        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}

