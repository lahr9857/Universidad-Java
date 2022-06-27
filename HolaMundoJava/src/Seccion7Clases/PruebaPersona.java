package Seccion7Clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona oPersona = new Persona();
        oPersona.Edad=24;
        oPersona.Nombre="Luis";
        oPersona.DesplegarInformacion();
        
        Persona oPersona1 = new Persona ();
        
        System.out.println("Persona 1"+oPersona);
        System.out.println("Persona 2"+oPersona1);
        
        oPersona1.DesplegarInformacion();
        oPersona1.Edad=20;
        oPersona1.Nombre="Karla";
        oPersona1.DesplegarInformacion();
    }
}
