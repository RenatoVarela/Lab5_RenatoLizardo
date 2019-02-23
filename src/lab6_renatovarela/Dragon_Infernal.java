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
public class Dragon_Infernal extends Legendaria {

    public Dragon_Infernal() {
    }

    public Dragon_Infernal(String nombre, int dano, int puntos_vida, String objetivos, String velocidad, double coste) {
        super(nombre, dano, puntos_vida, objetivos, velocidad, coste);
   
         super.coste = 4;
        super.objetivos = "Aereos";
        super.velocidad = "Media";
    }

    @Override
    public String toString() {
        return "Dragon_Infernal{" +  super.toString();
    }
    
    
    
}
