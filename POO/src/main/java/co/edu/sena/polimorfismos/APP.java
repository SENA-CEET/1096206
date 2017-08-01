package co.edu.sena.polimorfismos;

import java.util.ArrayList;
import java.util.List;

public class APP {
    public static void main(String[] args) {
        Conejo c1= new Conejo();
        System.out.println(c1);
        c1.saltar();
        c1.morir();
        Animal a1 = (Animal)c1;
        System.out.println(a1);
        a1.morir();



        Animal a3 = new Conejo();


        List lista = new ArrayList();


    }
}
