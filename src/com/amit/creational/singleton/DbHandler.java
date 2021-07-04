package com.amit.creational.singleton;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * for handling db operations
 */

public class DbHandler {

    private static volatile DbHandler instance = null;
    private static volatile Connection connection = null;

    private DbHandler(){
        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        if (instance != null){
            throw new RuntimeException("use getInstance() method to create");
        }

        if (connection != null){
            throw new RuntimeException("use getInstance() method to create");
        }
    }
    public static DbHandler getInstance(){
        if (instance == null){
            synchronized (DbHandler.class){
                if (instance == null){
                    instance = new DbHandler();
                }
            }
        }
        return instance;
    }

    public static Connection getConnection() {
        if (connection == null){
            synchronized (DbHandler.class){
                if (connection == null){
                    try {
                        JSONParser jsonParser = new JSONParser();
                        FileReader reader = new FileReader("src/com/amit/creational/com.amit.configs/Db.json");

                        /**
                         * need to add db username, passwd in Db.json
                         * {
                         *   "db": "design_patterns",
                         *   "user": "root",
                         *   "passwd": "Amit@123"
                         * }
                         *
                         */

                        JSONObject obj = (JSONObject) jsonParser.parse(reader);
                        String url = "jdbc:mysql://localhost:3306/" + obj.get("db");
                        connection = DriverManager.getConnection(url, (String) obj.get("user"), (String) obj.get("passwd"));
                    } catch (SQLException | IOException | ParseException throwables) {
                        throwables.printStackTrace();
                    }
                }
            }
        }

        return connection;
    }
}