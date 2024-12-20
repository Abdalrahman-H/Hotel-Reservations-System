/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
//**********************************************************************************************************************
//****************************                        Singleton Class                     ******************************
//**********************************************************************************************************************
*/
//                                        Q: What is This type of Singleton?
//                                        A: Lazy Initialization
/*
//**********************************************************************************************************************
//**********************************************************************************************************************
//**********************************************************************************************************************
//**********************************************************************************************************************
//************************                  Why we Need This Ceate Class?         **************************************
//*****     This calss ensures that three is only one connection to the database during the entire program run.     ****
//*****    If this class is not used, a new connection may be created each time the database is called,             ****
//*****                         resulting in excessive resoures consumption.                                        ****
//**********************************************************************************************************************
//**************************************** ******************************************************************************
//**********************************************************************************************************************
//**********************************************************************************************************************
*/
package hotel.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    
    private static DatabaseConnection instance;
    private Connection connection;
    private final String url = "jdbc:mysql://localhost:3306/hotel?useSSL=false";
    private final String Dbuser = "root";              
    private final String Dbpassword = "12345";

    // Constructor Private 
    //      To prevent the creation of new objects from outside this clase(DatabaseConnection)
    private DatabaseConnection() throws SQLException {
        try {
            connection = DriverManager.getConnection(url, Dbuser, Dbpassword);
        } catch (SQLException e) {
            throw new SQLException("Failed to connect to the database: " + e.getMessage());
        }
    }
    // This only way to reach the object
    public static DatabaseConnection getInstance() throws SQLException, ClassNotFoundException {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
    
}
