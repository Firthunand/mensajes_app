package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        Conexion dbConnect= new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try(Connection conexion = dbConnect.getConnection()){
            String query = "select * from mensajes";
            ps=conexion.prepareStatement(query);
            rs=ps.executeQuery();

            while(rs.next()){
                System.out.println("ID: "+rs.getInt("id_mensaje"));
                System.out.println("Mensaje: "+rs.getString("mensaje"));
                System.out.println("Autor: "+rs.getString("autor_mensaje"));
                System.out.println("Fecha: "+rs.getString("fecha_mensaje"));
                System.out.println("");
            }
        }catch(SQLException e){
            System.out.println("no se pudo traer el mensaje");
            System.out.println(e);
        }

    }

    public static void borrarMensajeDb(int idMensaje){
        Conexion dbConnect= new Conexion();

        try(Connection conexion = dbConnect.getConnection()){
            PreparedStatement ps = null;
            try{
                String query = "delete from mensajes where id_mensaje = ?";
                ps= conexion.prepareStatement(query);
                ps.setInt(1,idMensaje);
                ps.executeUpdate();
                System.out.println("mensaje eliminado");
            }catch(SQLException ex){
                System.out.println(ex);
                System.out.println("no se pudo borrar el mensaje");

            }

        }catch(SQLException e){
            System.out.println(e);
        }
    }

    public static void actualizarMensajeDb(Mensajes mensaje){

    }
}
