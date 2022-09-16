package main;

import clases.*;

import java.util.Scanner;

public class Prueba {
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        LocaDeLosGatos sLoca = new LocaDeLosGatos();
        Perro p1 = new Perro();
        Perro p2 = new Perro();
        Gato g1 = new Gato();
        Gato g2 = new Gato();
        Gato g3 = new Gato();
        Gato g4 = new Gato();
        Lechuza l1 = new Lechuza();
        System.out.println("Ingrese el nombre de la señora");
        String nombre = leer.next();
        System.out.println("Ingrese la edad de la señora");
        Integer edad = leer.nextInt();
        sLoca.setNombre(nombre);
        sLoca.setEdad(edad);
    }

    public static void menu(Mascota mascota, LocaDeLosGatos sLoca) {

    }
}
