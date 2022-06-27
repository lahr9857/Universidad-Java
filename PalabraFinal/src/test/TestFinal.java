package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        //miVariable =5;
        
        final Persona oPersona = new Persona();
        //oPersona = new Persona();
        
       oPersona.setNombre("Wicho");
        System.out.println("oPersona = " + oPersona.getNombre());
        oPersona.setNombre("Luis");
        System.out.println("oPersona = " + oPersona.getNombre());
    }
}
