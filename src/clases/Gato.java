package clases;

public class Gato extends Mascota{

    private Boolean pulgas;

    public Gato() {
    }

    public Gato(Boolean pulgas) {
        this.pulgas = pulgas;
    }

    public Gato(String apodo, String sexo, Boolean pulgas) {
        super(apodo, sexo);
        this.pulgas = pulgas;
    }

    public Boolean getPulgas() {
        return pulgas;
    }

    public void setPulgas(Boolean pulgas) {
        this.pulgas = pulgas;
    }

    @Override
    public void puedeHacerRuido() {
        System.out.println("Meow Meow Meow maullando como un gato");
    }

    @Override
    public void sePuedeVacunar() {
        if (pulgas) {
            System.out.println("No se puede vacunar por que tiene pulgas");
        }else {
            System.out.println("Se lo vacuno correctamente");
        }
    }
}
