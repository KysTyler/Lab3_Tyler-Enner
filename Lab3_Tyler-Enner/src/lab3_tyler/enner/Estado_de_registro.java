/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_tyler.enner;

/**
 *
 * @author ENNER
 */
public class Estado_de_registro {
    //Atributos
    private Personas Personas;
    
    //Constructor

    public Estado_de_registro() {
    }

    public Estado_de_registro(Personas Personas) {
        this.Personas = Personas;
    }
    
    //Mutador

    public Personas getPersonas() {
        return Personas;
    }

    public void setPersonas(Personas Personas) {
        this.Personas = Personas;
    }

    @Override
    public String toString() {
        return "Estado_de_registro{" + "Personas=" + Personas + '}';
    }
}
