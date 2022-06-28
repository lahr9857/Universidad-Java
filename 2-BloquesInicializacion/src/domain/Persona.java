package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    //Bloque de inicializacion estatico y se inician antes del 
    //constructor y solo se ejecuta una vez
    static{
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
    }
    
    //Bloque de inicializacion no estatico y se ejecuta cada que creemos un 
    //nuevo objeto
    {
        System.out.println("Ejecucion bloque no estatico o contexto dinamico");
        this.idPersona=Persona.contadorPersonas++;
    }
    
    public Persona(){
        System.out.println("Ejecion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
