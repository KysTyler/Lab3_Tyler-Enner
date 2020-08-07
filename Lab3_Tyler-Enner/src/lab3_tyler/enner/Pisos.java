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
public class Pisos {
    private String admin;
    private Ranker evaluador;
    private Ranker Director;
    private ArrayList <Personas> persons = new ArrayList();
    private int nivel;

    public Pisos() {
    }

    public Pisos(String admin, Ranker evaluador, Ranker Director, int nivel) {
        this.admin = admin;
        this.evaluador = evaluador;
        this.Director = Director;
        this.nivel = nivel;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public Ranker getEvaluador() {
        return evaluador;
    }

    public void setEvaluador(Ranker evaluador) {
        this.evaluador = evaluador;
    }

    public Ranker getDirector() {
        return Director;
    }

    public void setDirector(Ranker Director) {
        this.Director = Director;
    }

    public ArrayList<Personas> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Personas> persons) {
        this.persons = persons;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Pisos{" + "admin=" + admin + ", evaluador=" + evaluador + ", Director=" + Director + ", persons=" + persons + ", nivel=" + nivel + '}';
    }
    
    
}
