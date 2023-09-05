package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Aqui estara la logica de la conexion es la capa intermedia entre la aplicacion y la base de datos
//DAO = Data Access Object
public class MensajesDAO {
    public static void crearMensajeDb(Mensajes mensaje){
        Conexion dbConnect= new Conexion();

        try(Connection conexion = dbConnect.getConnection()){
            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO mensajes (mensaje, autor_mensaje)"
                                + "VALUES (?, ?)";
                ps=conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutorMensaje());
                ps.executeUpdate();
                System.out.println("mensaje creado");

            }catch(SQLException ex){
                System.out.println(ex);
            }
        }catch(SQLException e){
            System.out.println(e);
        }

    }

    public static void leerMensajeDb(){

    }

    public static void borrarMensajeDb(int idMensaje){

    }

    public static void actualizarMensajeDb(Mensajes mensaje){

    }
}
