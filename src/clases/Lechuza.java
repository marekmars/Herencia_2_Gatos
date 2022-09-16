package clases;

public class Lechuza extends Mascota {
    private Boolean calmada;

    public Lechuza() {
    }

    public Lechuza(Boolean calmada) {
        this.calmada = calmada;
    }

    public Lechuza(String apodo, String sexo, Boolean calmada) {
        super(apodo, sexo);
        this.calmada = calmada;
    }

    public Boolean getCalmada() {
        return calmada;
    }

    public void setCalmada(Boolean calmada) {
        this.calmada = calmada;
    }

    @Override
    public void puedeHacerRuido() {
        if (calmada) {
            System.out.println("Garg, Grag, Grag graznado como una lechuza calmada");
        } else {
            System.out.println("Chuzz Chuzz Chuzz chuceando como una lechuza enojada");
        }
    }

    @Override
    public void sePuedeVacunar() {
        if (calmada) {
            System.out.println("Se pudo vacunar correctamente");
        } else {
            System.out.println("No se la pudo vacunar por que esta enojada");
        }
    }

    public void enojarse() {

        calmada = false;
    }

    public void calmarse() {
        calmada = true;
    }

}
