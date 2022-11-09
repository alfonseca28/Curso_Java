/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Orientado_Objetos;

/**
 *
 * @author alfon
 */
public class Personaje {
    //caracteristicas
    //atributos publicos para definir el nombre del personaje

    public String nombre;
    public int vida;
//el constructor define que inicialmente va a tener estos valores

    public Personaje(String nombre) {
        //le puedo indicar lo que sea que vaya a hacer
        //este puede recibir parametros
        //hace referencia a los atributos de esta clase
        this.nombre = nombre;
        this.vida = 100;
        this.presentarse();
    }

    public void atacar() {
        System.out.println("Atacando...");
    }
    //el void se ocupa porque no se va a regresar nada

    public void presentarse() {
        System.out.println("Soy " + this.nombre);
    }
}
