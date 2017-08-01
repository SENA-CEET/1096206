package co.edu.sena.asociacion.ejemplo01;

import java.util.ArrayList;
import java.util.List;

public class APP2 {
    public static void main(String[] args) {
        Archivo a1 = new Archivo();
        a1.setSerial("123");
        Archivo a2 = new Archivo();
        a2.setSerial("123");

        if(a1.equals(a2)){
            System.out.println("son iguales");
        }else{
            System.out.println("no son iguales");
        }

        List<Archivo> lista = new ArrayList<>();
        lista.add(new Archivo());

        System.out.println(lista.get(1));

    }
}
