package clases;

public abstract class Mascota {
    protected String apodo;
    protected String sexo;

    public Mascota() {
    }

    public Mascota(String apodo, String sexo) {
        this.apodo = apodo;
        this.sexo = sexo;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public abstract void puedeHacerRuido();

    public abstract void sePuedeVacunar();
        

    @Override
    public String toString() {
        return "Mascota{" +
                "apodo='" + apodo + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
