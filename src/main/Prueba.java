package main;

import clases.*;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Prueba {
        public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre;
        int edad;
        LocaDeLosGatos sLoca = new LocaDeLosGatos();
        Perro p1 = new Perro("Pupe", "Femenino", true, false);
        Perro p2 = new Perro("Corcho", "Masculino", false, false);
        Gato g1 = new Gato("Samanta", "Femenino", true);
        Gato g2 = new Gato("Gwen", "Femenino", false);
        Gato g3 = new Gato("Ramon", "Masculino", true);
        Gato g4 = new Gato("Jorgito", "Masculino", false);
        Lechuza l1 = new Lechuza("Hedwig", "Masculino", false);
        System.out.println("Ingrese el nombre de la señora");
        nombre = leer.next();
        System.out.println("Ingrese la edad de la señora");
        edad = leer.nextInt();
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
            System.out.println("----------------------------------------------------------------");
            System.out.println("Buen dia señora loca, Que desea hacer con sus mascotas");
            System.out.println("1.Mostrar Mascotas");
            System.out.println("2.Empulgar/Desempulgar Gato");
            System.out.println("3.Enfermar/Desenfermar Perro");
            System.out.println("4.Enojar/Calmar Lechuza");
            System.out.println("5.Salir");
            op = leer.next();


            switch (op) {
                case "1":
                    for (Mascota aux : sLoca.getMascotas()) {
                        System.out.println(aux);
                    }
                    break;
                case "2":
                    System.out.println("1.Empulgar gatos");
                    System.out.println("2.Desempulgar gatos");
                    System.out.println("3.Salir ");
                    op = leer.next();
                    switch (op) {
                        case "1":
                            boolean flag = false;
                            AtomicReference<Integer> c = new AtomicReference<>(0);
                            for (Mascota aux : sLoca.getMascotas()) {
                                if (aux instanceof Gato) {
                                    if (!((Gato) aux).getPulgas().booleanValue()) {
                                        flag = true;
                                        System.out.println(aux.getApodo());
                                    }
                                }
                            }
                            if (flag) {
                                System.out.println("Ingrese el apodo del gato a empulgar");
                                op = leer.next();
                                String finalOp = op;
                                sLoca.getMascotas().forEach((x) -> {
                                    if (x.getApodo().equalsIgnoreCase(finalOp)) {
                                        ((Gato) x).setPulgas(true);
                                        System.out.println("Se empulgo a " + x.getApodo() + " correctamente");
                                        c.set(1);
                                    }
                                });
                            } else {
                                System.out.println("Todos los gatos ya tienen pulgas");
                                break;
                            }
                            if (c.get() == 0) {
                                System.out.println("El nombre ingresado no es valido");

                            }
                            break;
                        case "2":
                            c = new AtomicReference<>(0);
                            flag = false;
                            for (Mascota aux : sLoca.getMascotas()) {
                                if (aux instanceof Gato) {
                                    if (((Gato) aux).getPulgas()) {
                                        flag = true;
                                        System.out.println(aux.getApodo());
                                    }
                                }
                            }
                            if (flag) {
                                System.out.println("Ingrese el apodo del gato a desempulgar");
                                op = leer.next();
                                String finalOp = op;
                                sLoca.getMascotas().forEach((x) -> {
                                    if (x.getApodo().equalsIgnoreCase(finalOp)) {
                                        ((Gato) x).setPulgas(false);
                                        System.out.println("Se desempulgo a " + x.getApodo() + " correctamente");
                                        c.set(1);
                                    }
                                });
                            } else {
                                System.out.println("No tiene gatos con pulgas para desempulgar");
                                break;
                            }
                            if (c.get() == 0) {
                                System.out.println("El nombre ingresado no es valido");

                            }
                            break;
                        case "3":
                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                    }

                    break;


                case "3":

                    System.out.println("1.Garrapatizar Perro");
                    System.out.println("2.Desgarrapatizar Perro");
                    System.out.println("3.Enfermar Perro");
                    System.out.println("4.Curar Perro");
                    System.out.println("5.Salir");
                    op = leer.next();
                    switch (op) {
                        case "1":
                            boolean flag = false;
                            AtomicReference<Integer> c = new AtomicReference<>(0);
                            for (Mascota aux : sLoca.getMascotas()) {
                                if (aux instanceof Perro) {
                                    if (!((Perro) aux).getGarrapata()) {
                                        flag = true;
                                        System.out.println(aux.getApodo());
                                    }
                                }
                            }
                            if (flag) {
                                System.out.println("Ingrese el apodo del perro a \"garrapatizar\"");
                                op = leer.next();
                                String finalOp = op;
                                sLoca.getMascotas().forEach((x) -> {
                                    if (x.getApodo().equalsIgnoreCase(finalOp)) {
                                        ((Perro) x).setGarrapata(true);
                                        System.out.println("Se \"garrapatizo\" a " + x.getApodo() + " correctamente");
                                        c.set(1);
                                    }
                                });
                            } else {
                                System.out.println("Todos los perros ya tienen garrapatas");
                                break;
                            }
                            if (c.get() == 0) {
                                System.out.println("El nombre ingresado no es valido");

                            }
                            break;
                        case "2":
                            flag = false;
                            c = new AtomicReference<>(0);
                            for (Mascota aux : sLoca.getMascotas()) {
                                if (aux instanceof Perro) {
                                    if (((Perro) aux).getGarrapata()) {
                                        flag = true;
                                        System.out.println(aux.getApodo());
                                    }
                                }
                            }
                            if (flag) {
                                System.out.println("Ingrese el apodo del perro a \"desgarrapatizar\"");
                                op = leer.next();
                                String finalOp = op;
                                sLoca.getMascotas().forEach((x) -> {
                                    if (x.getApodo().equalsIgnoreCase(finalOp)) {
                                        ((Perro) x).setGarrapata(false);
                                        System.out.println("Se \"desgarrapatizo\" a " + x.getApodo() + " correctamente");
                                        c.set(1);
                                    }
                                });
                            } else {
                                System.out.println("No tiene perros con garrapatas");
                                break;
                            }
                            if (c.get() == 0) {
                                System.out.println("El nombre ingresado no es valido");

                            }
                            break;
                        case "3":
                            flag = false;
                            c = new AtomicReference<>(0);
                            for (Mascota aux : sLoca.getMascotas()) {
                                if (aux instanceof Perro) {
                                    if (!((Perro) aux).getMoquillo()) {
                                        flag = true;
                                        System.out.println(aux.getApodo());
                                    }
                                }
                            }
                            if (flag) {
                                System.out.println("Ingrese el apodo del perro a enfermar");
                                op = leer.next();
                                String finalOp = op;
                                sLoca.getMascotas().forEach((x) -> {
                                    if (x.getApodo().equalsIgnoreCase(finalOp)) {
                                        ((Perro) x).setMoquillo(true);
                                        System.out.println("Se enfermo a " + x.getApodo() + " correctamente");
                                        c.set(1);
                                    }
                                });
                            } else {
                                System.out.println("Todos sus perros ya estan enfermos");
                                break;
                            }
                            if (c.get() == 0) {
                                System.out.println("El nombre ingresado no es valido");

                            }

                            break;

                        case "4":
                            flag = false;
                            c = new AtomicReference<>(0);
                            for (Mascota aux : sLoca.getMascotas()) {
                                if (aux instanceof Perro) {
                                    if (((Perro) aux).getMoquillo()) {
                                        flag = true;
                                        System.out.println(aux.getApodo());
                                    }
                                }
                            }
                            if (flag) {
                                System.out.println("Ingrese el apodo del perro a curar");
                                op = leer.next();
                                String finalOp = op;
                                sLoca.getMascotas().forEach((x) -> {
                                    if (x.getApodo().equalsIgnoreCase(finalOp)) {
                                        ((Perro) x).setMoquillo(false);
                                        System.out.println("Se curo a " + x.getApodo() + " correctamente");
                                        c.set(1);
                                    }
                                });
                            } else {
                                System.out.println("todos sus estan sanos");
                                break;
                            }
                            if (c.get() == 0) {
                                System.out.println("El nombre ingresado no es valido");

                            }

                            break;
                    }
                    break;

                case "4":
                    System.out.println("1.Calmar Lechuza");
                    System.out.println("2.Enojar Lechuza");
                    System.out.println("3.Salir");
                    op = leer.next();
                    switch (op) {
                        case "1":
                            boolean flag = false;
                            AtomicReference<Integer> c = new AtomicReference<>(0);
                            for (Mascota aux : sLoca.getMascotas()) {
                                if (aux instanceof Lechuza) {
                                    if (!((Lechuza) aux).getCalmada()) {
                                        flag = true;
                                        System.out.println(aux.getApodo());
                                    }
                                }
                            }
                            if (flag) {
                                System.out.println("Ingrese el apodo de la lechuza a calmar");
                                op = leer.next();
                                String finalOp = op;
                                sLoca.getMascotas().forEach((x) -> {
                                    if (x.getApodo().equalsIgnoreCase(finalOp)) {
                                        ((Lechuza) x).calmarse();
                                        System.out.println("Se calmo a " + x.getApodo() + " correctamente");
                                        c.set(1);
                                    }
                                });
                            } else {
                                System.out.println("Todos las lechuzas ya estan calmadas");
                                break;
                            }
                            if (c.get() == 0) {
                                System.out.println("El nombre ingresado no es valido");

                            }
                            break;
                        case "2":
                            flag = false;
                            c=new AtomicReference<>(0);
                            for (Mascota aux : sLoca.getMascotas()) {
                                if (aux instanceof Lechuza) {
                                    if (((Lechuza) aux).getCalmada()) {
                                        flag = true;
                                        System.out.println(aux.getApodo());
                                    }
                                }
                            }
                            if (flag) {
                                System.out.println("Ingrese el apodo de la lechuza a enojar");
                                op = leer.next();
                                String finalOp = op;
                                sLoca.getMascotas().forEach((x) -> {
                                    if (x.getApodo().equalsIgnoreCase(finalOp)) {
                                        ((Lechuza) x).enojarse();
                                        System.out.println("Se enojo a " + x.getApodo() + " correctamente");
                                        c.set(1);
                                    }
                                });
                            } else {
                                System.out.println("Todos las lechuzas ya estan enojadas");
                                break;
                            }
                            if (c.get() == 0) {
                                System.out.println("El nombre ingresado no es valido");

                            }
                            break;

                    }


                case "5":

                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

        }
        while (!op.equals("5"));
    }
}
