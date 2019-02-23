/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_renatovarela;

/**
 *
 * @author Asus Pc
 */
public class Epica extends Cartas {

    public Epica(String nombre, int dano, int puntos_vida, String objetivos, String velocidad, double coste) {
        super(nombre, dano, puntos_vida, objetivos, velocidad, coste);
    }

    public Epica() {
    }

    @Override
    public String toString() {
        return "Epica:" + super.toString();
    }
    
    
}
