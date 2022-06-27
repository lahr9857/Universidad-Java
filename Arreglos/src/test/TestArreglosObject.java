package test;

import domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
        Persona oPersonas[] = new Persona[2];
        
        oPersonas[0] = new Persona("Luis");
        oPersonas[1] = new Persona("Juan");
        System.out.println("oPersonas = " + oPersonas[0]);
        System.out.println("oPersonas = " + oPersonas[1]);
        
        for(int i=0; i < oPersonas.length; i++){
            System.out.println("personas = "+i+" = " + oPersonas[i]);
        }
        
        //Sintaxis de subida
        Object oPersona1[] = {"Luis","Juan","Karla"};
        for (int i = 0; i < oPersona1.length; i++) {
            System.out.println("Nombre de persona "+i+"= "+oPersona1[i]);
        }
        
    }
}
