package clases;

import java.util.ArrayList;

public class LocaDeLosGatos {
    private String nombre;
    private Integer edad;
    private ArrayList<Mascota> mascotas = new ArrayList<>();

    public LocaDeLosGatos() {

    }

    public LocaDeLosGatos(String nombre, Integer edad, ArrayList<Mascota> mascotas) {
        this.nombre = nombre;
        this.edad = edad;
        this.mascotas = mascotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void adoptarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }


}
