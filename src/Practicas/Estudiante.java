/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicas;

/**
 *
 * @author alfon
 */
public class Estudiante extends Persona {

    private String escuela;
    private int grado;

    public Estudiante(String nombre, int edad, char sexo, double peso, double altura) {
        //con la palabra super se puede hacer referencia a la clase padre
        super(nombre, edad, sexo, peso, altura);
        this.escuela = escuela;
        this.grado = grado;
    }

    public Estudiante(String escuela, int grado, String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
        this.escuela = escuela;
        this.grado = grado;
    }

    public void Aprender() {
        System.out.println("Estoy aprendiendo java");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

}
