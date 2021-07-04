package com.amit.creational.singleton;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        DbHandler dbHandler = DbHandler.getInstance();
        DbHandler dbHandler2 = DbHandler.getInstance();
        System.out.println(dbHandler == dbHandler2 ? "both are same": "different");
        Connection connection = DbHandler.getConnection();


        Statement st  = connection.createStatement();
        st.executeUpdate("CREATE TABLE IF NOT EXISTS sample(id integer primary key, name varchar(50))");
        System.out.println("table created");
        st.close();
    }
}
