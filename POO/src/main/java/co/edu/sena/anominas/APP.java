package co.edu.sena.anominas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class APP {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        lista.add(4);
        lista.add(6);
        lista.add(6);
        lista.add(6);
        lista.add(6);

        for (Integer i:lista) {
            System.out.println(i);
        }

        //clase anonima
        lista.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        // programacion declarativa fucnional
        lista.stream().forEach((Integer x) -> System.out.println(x));

        Ejemplo01 a = new Ejemplo01();
        a.metodo();


    }


}
