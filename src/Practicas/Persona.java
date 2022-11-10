package Practicas;

/**
 *
 * @author alfon
 */
public class Persona {

    private String nombre;
    private int edad;
    private char sexo;
    private double peso, altura;

    public static final char HOMBRE = 'H';
    public static final char MUJER = 'M';

    public Persona() {
        //estro es un constructor por defecto, significa que no recibe nada
        this.nombre = "";       //los srings (cadenas) se asiganan con comillas dobles 
       this.edad = 0;
        this.sexo = ' ';        //los caracteres (char) se asignan con comillas simples
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0.0, 0.0);
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void operacionIMC() {
        //double imc = peso / (altura * altura);
        double imc = this.peso / Math.pow(this.altura, 2);
        System.out.println("El IMC es de: " + imc);
    }

    public boolean mayorEdad() {
        boolean mayor = false;
        if (this.edad >= 18) {
        } else {
        }
        return false;
    }

    @Override
    public String toString() {
        return "Me llamo " + this.nombre + " y tengo " + this.edad + " años.";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
