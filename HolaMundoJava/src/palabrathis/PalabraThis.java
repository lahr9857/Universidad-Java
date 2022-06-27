package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona oPersona = new Persona("Luis", "Herrera");
        System.out.println("oPersona = " + oPersona);
        System.out.println("oPersona nombre = " + oPersona.Nombre);
        System.out.println("oPersona apellido= " + oPersona.Apellido);
    }
}

class Persona{
    String Nombre;
    String Apellido;
    
    Persona(String Nombre, String Apellido){
        //super(); llamada al constructor de la clase Padre (object)
        this.Nombre=Nombre;
        this.Apellido=Apellido;
        System.out.println("objeto persona usando this: "+this);
        //Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
    }
}

class Imprimir{
    public void imprimir(Persona oPersona){
            System.out.println("Persona desde imprimir: "+oPersona);
            System.out.println("Impresion del obejto actual(this): "+this);
    }
}
