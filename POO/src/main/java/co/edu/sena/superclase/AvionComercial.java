package co.edu.sena.superclase;

public class AvionComercial extends Avion {
    private float carga;

    public AvionComercial() {
        super();
    }

    public AvionComercial(String marca, String color, String modelo, float carga) {

        super(marca, color, modelo);
        this.carga=carga;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {

        return "AvionComercial{"+this.getMarca()+"}";
    }
}
