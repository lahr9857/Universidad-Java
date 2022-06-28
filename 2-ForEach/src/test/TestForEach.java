package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5,6,8};
        for(int edad: edades)System.out.println("edades = " + edad);
        
        Persona personas[]={new Persona("Luis"), new Persona ("Juan")};
        for(Object persona: personas)System.out.println("persona = " + persona);
    }
}
