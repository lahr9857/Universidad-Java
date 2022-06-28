package test;

import domain.Persona;

public class TestBloquesInicializacion {

    public static void main(String[] args) {
        Persona oPersona = new Persona();
        System.out.println("oPersona = " + oPersona);
        System.out.println("");
        Persona oPersona1 = new Persona();
        System.out.println("oPersona = " + oPersona1);

    }
}
