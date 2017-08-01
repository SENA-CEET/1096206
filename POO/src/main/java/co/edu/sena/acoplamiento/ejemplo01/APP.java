package co.edu.sena.acoplamiento.ejemplo01;

public class APP {
    public static void main(String[] args) {
        ClaseUno objetoClaseUno = new ClaseUno();
        ClaseUno.ClaseDos objetoClaseDos = objetoClaseUno.new ClaseDos();
        ClaseUno.ClaseDos.ClaseTres objetoClaseTres = objetoClaseDos.new ClaseTres();
        ClaseUno.ClaseDos.ClaseTres.ClaseCuatro objetoClaseCuatro = objetoClaseTres.new ClaseCuatro();

        System.out.println(objetoClaseUno);
        System.out.println(objetoClaseDos);
        System.out.println(objetoClaseTres);
        System.out.println(objetoClaseCuatro);
    }
}
