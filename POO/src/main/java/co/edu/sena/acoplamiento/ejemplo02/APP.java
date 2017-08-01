package co.edu.sena.acoplamiento.ejemplo02;

public class APP {
    public static void main(String[] args) {
        ClaseUno objetoClaseUno = new ClaseUno();
        InterfaceClaseDos objetoClaseDos = objetoClaseUno.getClaseDos();
        InterfaceClaseTres objetoClaseTres = objetoClaseDos.getClaseTres();
        InterfaceClaseCuatro objetoClaseCuatro = objetoClaseTres.getClaseCuatro();

        System.out.println(objetoClaseUno);
        System.out.println(objetoClaseDos);
        System.out.println(objetoClaseTres);
        System.out.println(objetoClaseCuatro);
    }
}
