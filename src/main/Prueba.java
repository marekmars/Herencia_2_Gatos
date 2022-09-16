package main;

import clases.*;

import java.util.Scanner;

public class Prueba {
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        LocaDeLosGatos sLoca = new LocaDeLosGatos();
        Perro p1 = new Perro("Pupe", "Femenino", true, false);
        Perro p2 = new Perro("Corcho", "Masculino", false, false);
        Gato g1 = new Gato("Samanta", "Femenino", true);
        Gato g2 = new Gato("Gwen", "Femenino", false);
        Gato g3 = new Gato("Ramon", "Masculino", true);
        Gato g4 = new Gato("Jorgito", "Masculino", false);
        Lechuza l1 = new Lechuza("Hedwig", "Masculino", false);
        System.out.println("Ingrese el nombre de la señora");
        String nombre = leer.next();
        System.out.println("Ingrese la edad de la señora");
        Integer edad = leer.nextInt();
        sLoca.setNombre(nombre);
        sLoca.setEdad(edad);
        sLoca.getMascotas().add(p1);
        sLoca.getMascotas().add(p2);
        sLoca.getMascotas().add(g1);
        sLoca.getMascotas().add(g2);
        sLoca.getMascotas().add(g3);
        sLoca.getMascotas().add(g4);
        sLoca.getMascotas().add(l1);

        menu(sLoca);

    }

    public static void menu(LocaDeLosGatos sLoca) {
        String op;
        do {
            System.out.println("Buen dia señora loca, Que desea hacer con sus mascotas");
            System.out.println("1.Mostrar Mascotas");
            System.out.println("2.Empulgar/Desempulgar Gato");
            System.out.println("3.Enfermar/Desenfermar Perro");
            System.out.println("4.Enojar/Calmar Lechuza");
            System.out.println("5.Salir");
            op = leer.next();

        } while (!op.equals("5"));
        switch (op) {
            case "1":
                for (Mascota aux : sLoca.getMascotas()) {
                    System.out.println(aux);
                }
                break;
            case "2":
                for (Mascota aux : sLoca.getMascotas()) {
                    if (aux instanceof Gato) {
                        System.out.println("1.Empulgar gatos");
                        System.out.println("2.Desempulgar gatos");
                        op = leer.next();
                        switch (op) {
                            case "1":
                                if (aux instanceof Gato) {
                                    ((Gato) aux).setPulgas(true);
                                }
                                break;
                            case "2":
                                if (aux instanceof Gato) {
                                    ((Gato) aux).setPulgas(false);
                                }
                                break;
                            default:
                                System.out.println("Opcion incorrecta");
                                break;
                        }
                    }

                }

                break;

            case "3":
                for (Mascota aux : sLoca.getMascotas()) {
                    System.out.println("1.Enfermar perros");
                    System.out.println("2.Curar perros");
                    op = leer.next();
                    switch (op) {
                        case "1":
                            if (aux instanceof Perro) {
                                ((Perro) aux).setMoquillo(true);
                                ((Perro) aux).setGarrapata(true);
                            }
                            break;
                        case "2":
                            if (aux instanceof Gato) {
                                ((Gato) aux).setPulgas(false);
                                ((Perro) aux).setGarrapata(true);
                            }
                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                            break;
                    }
                }
                break;
            case "4":

                for (Mascota aux : sLoca.getMascotas()) {
                    if (aux instanceof Lechuza) {
                        System.out.println("1.Enojar");
                        System.out.println("2.Calmar");
                        op = leer.next();
                        switch (op) {
                            case "1":
                                if (aux instanceof Lechuza) {
                                    ((Lechuza) aux).enojarse();
                                    ;
                                }
                                break;
                            case "2":
                                if (aux instanceof Lechuza) {
                                    ((Lechuza) aux).calmarse();
                                    ;
                                }
                                break;
                            default:
                                System.out.println("Opcion incorrecta");
                                break;
                        }
                    }
                }

                break;

            case "5":

                break;

            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }
}
