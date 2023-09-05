package org.example;

import java.util.Scanner;

//esta hace de clase intermadia entre la capa dao y el main
public class MensajesServices {

    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe el mensaje");
        String mensaje = sc.nextLine();

        System.out.println("autor");
        String nombre = sc.nextLine();

        Mensajes msj = new Mensajes();
        msj.setMensaje(mensaje);
        msj.setAutorMensaje(nombre);

        MensajesDAO.crearMensajeDb(msj);
    }

    public static void leerMensaje(){
        MensajesDAO.leerMensajeDb();

    }

    public static void borrarMensaje(){

    }

    public static void actualizarMensaje(){

    }
}
