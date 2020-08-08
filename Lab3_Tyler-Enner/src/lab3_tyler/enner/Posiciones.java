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
public class Posiciones {
    private String nombre;

    public Posiciones() {
    }

    public Posiciones(String nombre) {
        this.nombre = nombre;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Posiciones{" + "nombre=" + nombre + '}';
    }
    
    
}
