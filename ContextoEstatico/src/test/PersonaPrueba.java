package test;

import domain.Persona;

public class PersonaPrueba {
    private int contador;
    
    public static void main(String[] args) {
        Persona oPersona = new Persona("Luis");
        Persona oPersona1 = new Persona("Erika");
        
        imprimir(oPersona);
        imprimir(oPersona1);
        //this.contador = 10;
    }
    
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    
    //Metodo dinamico o asociado al objeto
    public int getContador(){
        imprimir(new Persona("Juan"));
        return this.contador;
    }
}
