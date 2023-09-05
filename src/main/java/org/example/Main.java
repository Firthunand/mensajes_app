package org.example;

import java.sql.Connection;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Conexion con= new Conexion();

        try(Connection cnx = con.getConnection()){

        }catch(Exception e){
            System.out.println(e);
        }


        }
    }
