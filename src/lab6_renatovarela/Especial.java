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
public class Especial extends Cartas {

    public Especial(String nombre, int dano, int puntos_vida, String objetivos, String velocidad, double coste) {
        super(nombre, dano, puntos_vida, objetivos, velocidad, coste);
    }

    public Especial() {
    }
    
    

    @Override
    public String toString() {
        return "Especial: " + super.toString();
    }
    
    
}
