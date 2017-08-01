package co.edu.sena.anominas;

public class Ejemplo01 {

    public void metodo(){
        class ClaseDentroMetodo{

            public void imprimir(){
                System.out.println("estoy imprimienfo desde una clase dentro de un mentodo");
            }


        }
        ClaseDentroMetodo obj = new ClaseDentroMetodo();
        obj.imprimir();


    }

}
