package test;

//import paquete1.Clase1;

import paquete1.Clase1;

//import paquete2.ClaseHija;

public class TestModificadoresAcceso  {
    public static void main(String[] args) {
        /*Clase1 oClase1 = new Clase1();
        System.out.println("oClase1 = " + oClase1.atributoPublico);
        oClase1.metodoPublico();
        */
        //Clase1 oClase2 = new Clase1("Publico");
        //ClaseHija claseHija = new ClaseHija();
        //System.out.println("claseHija = " + claseHija);
        
        Clase1 clase1 = new Clase1("Publico");
        clase1.setAtributoPrivado("Cambio valor");
        System.out.println("clase1: "+clase1.getAtributoPrivado());
    }
}
