/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_tyler.enner;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tyler C
 */
public class Lab3_TylerEnner {

    /**
     * @param args the command line arguments
     */
    static Scanner read = new Scanner(System.in);
    static Random R = new Random();

    static String position = "";

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> identificationlist = new ArrayList();
        ArrayList<Pisos> towerOfGod = new ArrayList();
        ArrayList<Personas> people = new ArrayList();
        boolean LoginAttempt = false;
        int option = 0;
        while (option != 6) {
            System.out.println("1) Agregar piso\n"
                    + "2) Agregar prueba\n"
                    + "3) Agregar personas\n"
                    + "4) Modificar piso\n"
                    + "5) Modificar prueba\n"
                    + "6) Modificar Personas\n"
                    + "7) Eliminar piso\n"
                    + "8) Eliminar prueba\n"
                    + "9) Eliminar personas\n"
                    + "10) Informe\n"
                    + "11) log in");
            option = read.nextInt();
            switch (option) {
                case 1:
                    while (!LoginAttempt) {
                        System.out.println("Ingrese su username: ");
                        String inputuser = read.nextLine();
                        inputuser = read.next();
                        System.out.println("Ingrese su password: ");
                        String inputpassword = read.nextLine();
                        inputpassword = read.next();
                        LoginAttempt = login(inputuser, inputpassword);
                    }
                    System.out.println("Ingrese el nombre del Admin: ");
                    String admin = read.next();
                    System.out.println("Ingrese nivel: ");
                    int lvl = read.nextInt();
                    while (lvl < 1 || lvl > 134) {
                        System.out.println("Ingrese nivel de nuevo entre 1 y 134: ");
                        lvl = read.nextInt();
                    }

                    break;
                case 2:
                    while (!LoginAttempt) {
                        System.out.println("Ingrese su username: ");
                        String inputuser = read.nextLine();
                        inputuser = read.next();
                        System.out.println("Ingrese su password: ");
                        String inputpassword = read.nextLine();
                        inputpassword = read.next();
                        LoginAttempt = login(inputuser, inputpassword);
                    }
                    System.out.println("Ingrese nombre: ");
                    String name = read.next();
                    System.out.println("Ingrese Evaluador: (Ranker)");
                    System.out.println("");
                    break;
                case 3:
                    String user ="",pass ="";
                    while (!LoginAttempt) {
                        System.out.println("Ingrese su username: ");
                        String inputuser = read.nextLine();
                        inputuser = read.next();
                        System.out.println("Ingrese su password: ");
                        String inputpassword = read.nextLine();
                        inputpassword = read.next();
                        LoginAttempt = login(inputuser, inputpassword);
                    }
                    System.out.println("Create 1) Normal o 2)Ranker:  ");
                    int decision = read.nextInt();
                    if (decision == 1) {
                        System.out.println("Ingrese su nombre: ");
                        String namePerson = read.next();
                        System.out.println("Ingrese posicion:\n"
                                + "optiones:"
                                + "1) Pescador 2) Portador de Lanzas 3) Portador de luz 4) Explorador \n"
                                + "5) Manipulador de ondas");
                        int posicion = read.nextInt();
                        assignpos(posicion);
                        String identification = ID();
                        while (identificationlist.contains(identification)) {
                            System.out.println("No se pude agregar ese identificacion porque ya esta usado ingrese uno nuevo: ");
                            System.out.println("Ingrese identificacion: ");
                            identification = read.next();
                        }
                        identificationlist.add(identification);
                        System.out.println("Ingrese su estado de registro : 1) Regular 2) Iregular");
                        int reg_ireg = read.nextInt();
                        if (reg_ireg == 1) {
                            System.out.println("Ingrese username :");
                            user = read.next();
                            System.out.println("Ingrese password :");
                            pass = read.next();
                            
                        } else {
                            System.out.println("Irregular");
                        }
                        people.add(new Normal(namePerson,new Posiciones(position),identification,new Regular(user,pass)));
                        

                    } else {
                        System.out.println("Ingrese su nombre: ");
                        String namePerson = read.next();
                        System.out.println("Ingrese posicion:\n"
                                + "optiones:"
                                + "1) Pescador 2) Portador de Lanzas 3) Portador de luz 4) Explorador \n"
                                + "5) Manipulador de ondas");
                        int posicion = read.nextInt();
                        assignpos(posicion);
                        String identification = ID();
                        while (identificationlist.contains(identification)) {
                            System.out.println("No se pude agregar ese identificacion porque ya esta usado ingrese uno nuevo: ");
                            System.out.println("Ingrese identificacion: ");
                            identification = read.next();
                        }
                        identificationlist.add(identification);
                        

                    }

                    break;
                case 4:
                    while (!LoginAttempt) {
                        System.out.println("Ingrese su username: ");
                        String inputuser = read.nextLine();
                        inputuser = read.next();
                        System.out.println("Ingrese su password: ");
                        String inputpassword = read.nextLine();
                        inputpassword = read.next();
                        LoginAttempt = login(inputuser, inputpassword);
                    }
                    break;
                case 5:
                    while (!LoginAttempt) {
                        System.out.println("Ingrese su username: ");
                        String inputuser = read.nextLine();
                        inputuser = read.next();
                        System.out.println("Ingrese su password: ");
                        String inputpassword = read.nextLine();
                        inputpassword = read.next();
                        LoginAttempt = login(inputuser, inputpassword);
                    }
                    break;
                case 6:
                    while (!LoginAttempt) {
                        System.out.println("Ingrese su username: ");
                        String inputuser = read.nextLine();
                        inputuser = read.next();
                        System.out.println("Ingrese su password: ");
                        String inputpassword = read.nextLine();
                        inputpassword = read.next();
                        LoginAttempt = login(inputuser, inputpassword);
                    }
                    break;
                case 7:
                    while (!LoginAttempt) {
                        System.out.println("Ingrese su username: ");
                        String inputuser = read.nextLine();
                        inputuser = read.next();
                        System.out.println("Ingrese su password: ");
                        String inputpassword = read.nextLine();
                        inputpassword = read.next();
                        LoginAttempt = login(inputuser, inputpassword);
                    }
                    break;
                case 8:
                    while (!LoginAttempt) {
                        System.out.println("Ingrese su username: ");
                        String inputuser = read.nextLine();
                        inputuser = read.next();
                        System.out.println("Ingrese su password: ");
                        String inputpassword = read.nextLine();
                        inputpassword = read.next();
                        LoginAttempt = login(inputuser, inputpassword);
                    }
                    break;
                case 9:
                    while (!LoginAttempt) {
                        System.out.println("Ingrese su username: ");
                        String inputuser = read.nextLine();
                        inputuser = read.next();
                        System.out.println("Ingrese su password: ");
                        String inputpassword = read.nextLine();
                        inputpassword = read.next();
                        LoginAttempt = login(inputuser, inputpassword);
                    }
                    break;
                case 10:
                    while (!LoginAttempt) {
                        System.out.println("Ingrese su username: ");
                        String inputuser = read.nextLine();
                        inputuser = read.next();
                        System.out.println("Ingrese su password: ");
                        String inputpassword = read.nextLine();
                        inputpassword = read.next();
                        LoginAttempt = login(inputuser, inputpassword);
                    }
                    break;
                case 11:
                    System.out.println("Ingrese su username: ");
                    String inputuser = read.next();
                    inputuser = read.nextLine();
                    System.out.println("Ingrese su password: ");
                    String inputpassword = read.next();
                    inputpassword = read.nextLine();
                    LoginAttempt = login(inputuser, inputpassword);
                    break;

            }
        }
    }

    public static boolean login(String user, String pass) {
        String username = "SUDO";
        String password = "clau123";

        if (user.equals(username) && password.equals(password)) {
            return true;
        } else {
            return false;
        }

    }

    public static void assignpos(int posicion) {
        switch (posicion) {
            case 1:
                position = "Pescador";
                break;
            case 2:
                position = " Portador de Lanzas";
                break;
            case 3:
                position = "Portador de luz";
                break;
            case 4:
                position = "Explorador";
                break;
            case 5:
                position = "Explorador";
                break;
        }

    }
    public static String ID(){
        String id = "";
        for (int i = 0; i < 6; i++) {
            char n = (char) R.nextInt();
            id += n;
        }
        return id;
        
    }

}
