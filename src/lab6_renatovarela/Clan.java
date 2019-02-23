/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_renatovarela;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Asus Pc
 */
public class Clan {
    String nombre;
    Date fecha_creacion;
    String usuario_lider;
    String tipo;
    ArrayList<Usuarios> usuarios = new ArrayList();

    public Clan() {
    }

    public Clan(String nombre, Date fecha_creacion, String usuario_lider, String tipo) {
        this.nombre = nombre;
        this.fecha_creacion = fecha_creacion;
        this.usuario_lider = usuario_lider;
        this.tipo = tipo;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getUsuario_lider() {
        return usuario_lider;
    }

    public void setUsuario_lider(String usuario_lider) {
        this.usuario_lider = usuario_lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Usuarios> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "Clan{" + "nombre=" + nombre + ", fecha_creacion=" + fecha_creacion + ", usuario_lider=" + usuario_lider + ", tipo=" + tipo + ", usuarios=" + usuarios + '}';
    }
    
    
    
}
