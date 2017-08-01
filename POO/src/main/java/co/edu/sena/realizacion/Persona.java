package co.edu.sena.realizacion;

public class Persona implements Ciego,Cojo,Mudo{

    public void ver(){
        System.out.println("veo");
    }

    public void hablar(){
        System.out.println("hablo");
    }

    public void caminar(){
        System.out.println("camino");
    }

}
