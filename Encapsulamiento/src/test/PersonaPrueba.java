package test;

import dominio.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {
        //Get para recuperar informacion
        //Set para modificar informacion
        Persona oPersona = new Persona("Luis", 5000.00, false);
        System.out.println("oPersona: " + oPersona.toString());
        oPersona.setNombre("Luis Herrera");
//        System.out.println("Persona nombre: "+oPersona.getNombre());
//        System.out.println("Persona sueldo: " + oPersona.getSueldo());
//        System.out.println("Persona elimando: "+oPersona.isEliminado());
        System.out.println("oPersona: " + oPersona);
    }
}
