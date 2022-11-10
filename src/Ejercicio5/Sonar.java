/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author alfon
 */
public class Sonar {

    public int PinEco;
    public int PinTrigger;

    public Sonar(int PinEco, int PinTrigger) {
        this.PinEco = PinEco;
        this.PinTrigger = PinTrigger;
    }

    public int Distanciamm() {
        return PinEco * PinTrigger;
    }
}
