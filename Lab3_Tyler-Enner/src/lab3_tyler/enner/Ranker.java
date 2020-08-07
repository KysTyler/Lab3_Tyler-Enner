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
public class Ranker extends Personas{
    private ArrayList pruebas;

    public Ranker(String nombre, Posiciones posicion, String identificacion, Estado_de_registro estado) {
        super(nombre, posicion, identificacion, estado);
    }

    public Ranker(ArrayList pruebas, String nombre, Posiciones posicion, String identificacion, Estado_de_registro estado) {
        super(nombre, posicion, identificacion, estado);
        this.pruebas = pruebas;
    }
    

    public ArrayList getPruebas() {
        return pruebas;
    }

    public void setPruebas(ArrayList pruebas) {
        this.pruebas = pruebas;
    }

    @Override
    public String toString() {
        return "Ranker{" + "pruebas=" + pruebas + '}';
    }
    
    
}
