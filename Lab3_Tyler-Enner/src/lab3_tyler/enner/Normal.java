/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_tyler.enner;

import java.util.ArrayList;

/**
 *
 * @author Tyler C
 */
public class Normal extends Personas{
   private ArrayList pruebasparticipo;
   private String description;

    public Normal(String nombre, Posiciones posicion, String identificacion, Estado_de_registro estado) {
        super(nombre, posicion, identificacion, estado);
    }

    public Normal(ArrayList pruebasparticipo, String description, String nombre, Posiciones posicion, String identificacion, Estado_de_registro estado) {
        super(nombre, posicion, identificacion, estado);
        this.pruebasparticipo = pruebasparticipo;
        this.description = description;
    }
   

    public ArrayList getPruebasparticipo() {
        return pruebasparticipo;
    }

    public void setPruebasparticipo(ArrayList pruebasparticipo) {
        this.pruebasparticipo = pruebasparticipo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Normal{" + "pruebasparticipo=" + pruebasparticipo + ", description=" + description + '}';
    }
   
    
}
