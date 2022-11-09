/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Orientado_Objetos;

import java.util.Scanner;

/**
 *
 * @author alfon
 */
public class Poo_Main {

    public static void main(String[] args) {

    

    public class Principal {

        public final static Scanner scan = new Scanner(System.in);
        //scanner es una clase en java para poder ingresar datos al programa, se esta haciendo una instancia

        public Principal() {
            int opcion;
            Principal principal;
            System.out.println("Bienvenido al juego");
            while (true) {
                opcion = mostrarMenu();
                if (opcion == 2) {
                    break;

                } else if (opcion != 1) {
                    System.out.println("Opcion no valida");
                    continue;
                }
                String nombre = pedirNombre();
                System.out.println("Hola, " + nombre);
                principal = new Principal(nombre, null);
            }
        }

        public static int mostrarMenu() {
            System.out.println("Selecciona una opcion:");
            System.out.println("\t1. Iniciar el juego");
            System.out.println("\t2. Salir del juego");
            System.out.println("> ");
            scan.nextInt(); //esta funcion es para limpiar ese escaner y que al momento de solicitar otro dato este vacia
        }

        public static String pedirNombre() {
            System.out.println("Ingresa tu nombre: ");
            System.out.println(">");
            return scan.nextLine();
        }
    }
}
