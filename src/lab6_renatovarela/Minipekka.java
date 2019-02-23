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
public class Minipekka extends Especial {

    public Minipekka(String nombre, int dano, int puntos_vida, String objetivos, String velocidad, double coste) {
        super(nombre, dano, puntos_vida, objetivos, velocidad, coste);
        
        super.coste = 4;
        super.objetivos = "Terrestre";
        super.velocidad = "Alta";
    }
    
    

    public Minipekka() {
    }

    @Override
    public String toString() {
        return  "Minipekka " + super.toString();
    }

    
   
    
    
    
    
    
    
    
    
}
