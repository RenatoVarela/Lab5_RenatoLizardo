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
public class Cartas {
    String nombre;
    int dano;
    int puntos_vida;
    String objetivos;
    String velocidad;
    double coste;

    public Cartas(String nombre, int dano, int puntos_vida, String objetivos, String velocidad, double coste) {
        this.nombre = nombre;
        this.dano = dano;
        this.puntos_vida = puntos_vida;
        this.objetivos = objetivos;
        this.velocidad = velocidad;
        this.coste = coste;
    }

    public Cartas() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getPuntos_vida() {
        return puntos_vida;
    }

    public void setPuntos_vida(int puntos_vida) {
        this.puntos_vida = puntos_vida;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    //@Override
    /*public String toString() {
        return  "nombre=" + nombre + ", dano=" + dano + ", puntos_vida=" + puntos_vida + ", objetivos=" + objetivos + ", velocidad=" + velocidad + ", coste=" + coste;
    }*/
    
    
    
}
