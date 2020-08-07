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
public class Regular extends Estado_de_registro{
   
     //Atributos
    private String usuario;
    private String contraseña;
    
    //Atributos
    public Regular() {
        super();
    }

    public Regular(String usuario, String contraseña, lab3_tyler.enner.Personas Personas) {
        super(Personas);
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    
    //Mutador
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Regular{" + "usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }
    
}
