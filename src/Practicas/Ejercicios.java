package Practicas;

/**
 *
 * @author alfon
 */
public class Ejercicios {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona("Juan", 10, Persona.HOMBRE);
        Persona p3 = new Persona("Maria", 20, Persona.MUJER, 60.0, 1.6);

        System.out.println("Persona 1: " + p1);
        System.out.println("Persona 2: " + p2);
        System.out.println("Persona 3: " + p3);

        System.out.println("El IMC de la persona 3 es: ");
        p3.operacionIMC();

        Estudiante e1 = new Estudiante("Itver", 5, "Alfo", 21, Persona.HOMBRE);
        System.out.println(e1);
        e1.Aprender();
    }

}
