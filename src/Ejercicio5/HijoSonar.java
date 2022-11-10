/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author alfon
 */
public class HijoSonar extends Sonar {

    public HijoSonar(int PinEco, int PinTrigger) {
        super(PinEco, PinTrigger);
    }

    public int DistanciaCm() {
        return super.Distanciamm() / 100;
    }

    public int DistanciaMt() {
        return this.DistanciaCm() / 100;
    }
}
