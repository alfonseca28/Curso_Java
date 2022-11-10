/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author alfon
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HijoSonar hs = new HijoSonar(10, 10);
        System.out.println("Distancia mm: " + hs.Distanciamm());
        System.out.println("Distancia cm: " + hs.DistanciaCm());
        System.out.println("Distancia mt: " + hs.DistanciaMt());
    }

}
