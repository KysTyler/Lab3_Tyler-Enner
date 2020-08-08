/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_tyler.enner;

/**
 *
 * @author Tyler C
 */
public class Personas {
    private String nombre;
    private Posiciones posicion;
    private String identificacion;
   private Estado_de_registro estado;
   

    public Personas(String nombre, Posiciones posicion, String identificacion, Estado_de_registro estado) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.identificacion = identificacion;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Estado_de_registro getEstado() {
        return estado;
    }

    public void setEstado(Estado_de_registro estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", posicion=" + posicion + ", identificacion=" + identificacion + ", estado=" + estado + '}';
    }
   
    
}
