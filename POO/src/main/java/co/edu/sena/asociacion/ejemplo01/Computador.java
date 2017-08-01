package co.edu.sena.asociacion.ejemplo01;

import java.util.List;

public class Computador {
    private Cargador cargador;
    private List<Archivo> archivos;

    public Cargador getCargador() {
        return cargador;
    }

    public void setCargador(Cargador cargador) {
        this.cargador = cargador;
    }

    public List<Archivo> getArchivos() {
        return archivos;
    }

    public void setArchivos(List<Archivo> archivos) {
        this.archivos = archivos;
    }
}
