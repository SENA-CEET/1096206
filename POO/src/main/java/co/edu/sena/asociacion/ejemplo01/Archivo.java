package co.edu.sena.asociacion.ejemplo01;

public class Archivo {

    private String serial;
    private String nombre;


    public Archivo() {
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Archivo archivo = (Archivo) o;

        if (serial != null ? !serial.equals(archivo.serial) : archivo.serial != null) return false;
        return nombre != null ? nombre.equals(archivo.nombre) : archivo.nombre == null;
    }

    @Override
    public int hashCode() {
        int result = serial != null ? serial.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        return result;
    }
}
