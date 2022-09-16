package clases;

public class Perro extends Mascota{

    private Boolean moquillo;
    private Boolean garrapata;

    public Perro() {

    }

    public Perro(Boolean moquillo, Boolean garrapata) {
        this.moquillo = moquillo;
        this.garrapata = garrapata;
    }

    public Perro(String apodo, String sexo, Boolean moquillo, Boolean garrapata) {
        super(apodo, sexo);
        this.moquillo = moquillo;
        this.garrapata = garrapata;
    }

    public Boolean getMoquillo() {
        return moquillo;
    }

    public void setMoquillo(Boolean moquillo) {
        this.moquillo = moquillo;
    }

    public Boolean getGarrapata() {
        return garrapata;
    }

    public void setGarrapata(Boolean garrapata) {
        this.garrapata = garrapata;
    }

    @Override
    public void puedeHacerRuido() {
        System.out.println("Woof Woof Woof ladrando como un perro");
    }

    @Override
    public void sePuedeVacunar() {
        if (moquillo) {
            System.out.println("No se puede vacunar por que tiene moquillo");
        } else if (garrapata) {
            System.out.println("No se puede vacunar por que tiene garrapatas");
        }else {
            System.out.println("Se lo vacuno correctamente");
        }
    }
}
