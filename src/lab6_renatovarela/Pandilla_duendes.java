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
public class Pandilla_duendes extends Comun{

    public Pandilla_duendes() {
    }

    public Pandilla_duendes(String nombre, int dano, int puntos_vida, String objetivos, String velocidad, double coste) {
        super(nombre, dano, puntos_vida, objetivos, velocidad, coste);
      
         super.coste = 3;
        super.objetivos = "Aereos y Terrestres";
        super.velocidad = "Alta";
    }

    @Override
    public String toString() {
        return "Pandilla_duendes{" +  super.toString();
    }
    
    
    
    
}
