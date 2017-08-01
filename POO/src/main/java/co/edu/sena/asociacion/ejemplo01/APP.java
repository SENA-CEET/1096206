package co.edu.sena.asociacion.ejemplo01;

import java.util.ArrayList;
import java.util.List;

public class APP {
    public static void main(String[] args) {
        Computador c1 = new Computador();
        System.out.println(c1.getCargador());
        c1.setArchivos(new ArrayList<>());
        System.out.println(c1.getArchivos().add(new Archivo()));

        Archivo[] archivos = new Archivo[10];
        archivos[0]= new Archivo();
        archivos[1]= new Archivo();

        archivos[9]= new Archivo();

        for (Archivo a:archivos
             ) {
            System.out.println(a);
        }

        List<Archivo> lista = new ArrayList<>();
        lista.add(new Archivo());
        lista.add(new Archivo());










    }
}
