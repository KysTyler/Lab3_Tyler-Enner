/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_tyler.enner;

import java.util.ArrayList;

/**
 *
 * @author ENNER
 */
public class Prueba {
    
    //Atributos
    private Personas Personas;
    private Ranker evaluador;
    private ArrayList<Prueba> lista_normal=new ArrayList();
    private String estado;

    public Prueba() {
        super();
    }

    public Prueba(Personas Personas, Ranker evaluador, String estado) {
        this.Personas = Personas;
        this.evaluador = evaluador;
        this.estado = estado;
    }
    
    //Mutadores

    public Personas getPersonas() {
        return Personas;
    }

    public void setPersonas(Personas Personas) {
        this.Personas = Personas;
    }

    public Ranker getEvaluador() {
        return evaluador;
    }

    public void setEvaluador(Ranker evaluador) {
        this.evaluador = evaluador;
    }

    public ArrayList<Prueba> getLista_normal() {
        return lista_normal;
    }

    public void setLista_normal(ArrayList<Prueba> lista_normal) {
        this.lista_normal = lista_normal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Prueba{" + "Personas=" + Personas + ", evaluador=" + evaluador + ", lista_normal=" + lista_normal + ", estado=" + estado + '}';
    }
    
}
