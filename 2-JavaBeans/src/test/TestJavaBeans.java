package test;

import domain.PersonaBean;

public class TestJavaBeans {

    public static void main(String[] args) {
        PersonaBean oPersona = new PersonaBean();
        oPersona.setNombre("Luis");
        oPersona.setApellido("Herrera");
        
        System.out.println("oPersona = " + oPersona);
        
        System.out.println("Nombre: "+oPersona.getNombre());
        System.out.println("Apellido: "+oPersona.getApellido());
    }
}
