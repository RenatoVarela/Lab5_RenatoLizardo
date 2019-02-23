/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_renatovarela;

import java.util.ArrayList;

/**
 *
 * @author Asus Pc
 */
public class Mazos {
    
   double coste;
  ArrayList<Cartas> cartas = new ArrayList();

    public Mazos() {
    }

    public Mazos(double coste) {
        this.coste = coste;
    }
    

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public ArrayList<Cartas> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Cartas> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Mazos{" + "coste=" + coste + ", cartas=" + cartas + '}';
    }
    
    
    
    
}
