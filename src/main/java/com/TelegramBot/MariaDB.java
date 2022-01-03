package com.TelegramBot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.glassfish.jersey.server.Uri;

public class MariaDB {

    private String username = "lidor";
    private String password = "mlo14265";
    private String DBUrl = "jdbc:mariadb://localhost:3333/BOT?";
    private String rootConnection = "jdbc:mariadb://localhost:3333/BOT?"+
    "user=root&password=mlo14265&serverTimezone=UTC";

    MariaDB(){}

    public boolean checkConnection() throws SQLException{
        Connection Connection = 
                DriverManager.getConnection(rootConnection);
        boolean isValid = Connection.isValid(2);
        Connection.close();
        return isValid;        
    }

    public boolean checkLidorConnection() throws SQLException{
        Connection connection =
                DriverManager.getConnection(DBUrl, username, password);
        boolean isValid = connection.isValid(2);
        connection.close();
        return isValid;
        
    }
    
}
