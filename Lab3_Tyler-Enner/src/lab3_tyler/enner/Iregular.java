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
public class Iregular extends Estado_de_registro{
    
    public Iregular() {
        super();
    }

    public Iregular(lab3_tyler.enner.Personas Personas) {
        super(Personas);
    }
    //Mutadores

    @Override
    public String toString() {
        return "Iregular{" + '}';
    }
    
}
