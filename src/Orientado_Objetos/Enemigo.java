/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Orientado_Objetos;

/**
 *
 * @author alfon
 */
public class Enemigo extends Personaje {

    //con extends se indica que esta clase va a heredar atributos de alguna otra clase
    public int poderDaño;

    public Enemigo(String nombre, int poderDaño) {
        super(nombre);
        
    }
}
