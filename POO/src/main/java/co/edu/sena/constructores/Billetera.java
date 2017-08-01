package co.edu.sena.constructores;

public class Billetera {

    private String serial;
    private String marca;
    private String descripcion;
    private float precio;

    public Billetera(String serial, String marca){
        this.serial = serial;
        this.marca= marca;
    }



    public Billetera(String serial, String marca, float precio){
        this.serial = serial;
        this.marca= marca;
        this.precio= precio;
    }


}
