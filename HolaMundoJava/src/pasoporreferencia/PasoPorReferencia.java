package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona oPersona1 = new Persona();
        oPersona1.Nombre="Luis";
        System.out.println("oPersona1 = " + oPersona1.Nombre);
        oPersona1=cambiarValor(oPersona1);
        System.out.println("oPersona1 = " + oPersona1.Nombre);
    }
    
    public static Persona cambiarValor(Persona persona){
        if(persona == null){
            return null;
        }
        persona.Nombre="Juan";
        return persona;
    }
}
