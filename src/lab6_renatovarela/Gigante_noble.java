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
public class Gigante_noble extends Comun {

    public Gigante_noble(String nombre, int dano, int puntos_vida, String objetivos, String velocidad, double coste) {
        super(nombre, dano, puntos_vida, objetivos, velocidad, coste);
        super.nombre = "Gigante Noble";
         super.coste = 6;
        super.objetivos = "Terrestre";
        super.velocidad = "Alta";
    }

    public Gigante_noble() {
    }

    @Override
    public String toString() {
        return "Gigante_noble{" + super.toString();
    }
    
    
    
    
}
