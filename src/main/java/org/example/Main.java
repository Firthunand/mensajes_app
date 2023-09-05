package org.example;

import java.sql.Connection;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int op=0;

        do{
            System.out.println("--------------");
            System.out.println("Mensajes App");
            System.out.println("1. Crear Mensaje");
            System.out.println("2. Listar Mensaje");
            System.out.println("3. Eliminar Mensaje");
            System.out.println("4. Editar Mensaje");
            System.out.println("5. Salir");
            op=sc.nextInt();

            switch (op){
                case 1:
                    MensajesServices.crearMensaje();
                    break;
                case 2:
                    MensajesServices.leerMensaje();
                    break;
                case 3:
                    MensajesServices.borrarMensaje();
                    break;
                case 4:
                    MensajesServices.actualizarMensaje();
                    break;
                default:
                    break;
            }
        }while (op!=5);

        }
    }
