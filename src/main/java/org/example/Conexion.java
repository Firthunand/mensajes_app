package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection getConnection(){
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app_platzi",
                                             "root",
                                             "");

        }catch(SQLException e){
            System.out.println(e);
        }
        return con;
    }
}
