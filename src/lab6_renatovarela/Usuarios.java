/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_renatovarela;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Asus Pc
 */
public class Usuarios {
    String nombre;
    String apellido;
    String nombre_usuario;
    String contrasena;
    Date fecha_nacimiento;
    double edad;
    String color;
    ArrayList<Mazos> mozos = new ArrayList();

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, String nombre_usuario, String contrasena, Date fecha_nacimiento, double edad, String color) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombre_usuario = nombre_usuario;
        this.contrasena = contrasena;
        this.fecha_nacimiento = fecha_nacimiento;
        this.edad = edad;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public String getString() {
        return color;
    }

    public void setString(String color) {
        this.color = color;
    }

    public ArrayList<Mazos> getMozos() {
        return mozos;
    }

    public void setMozos(ArrayList<Mazos> mozos) {
        this.mozos = mozos;
    }

    @Override
    public String toString() {
        return  "nombre=" + nombre;
    }
    
    
    
}
