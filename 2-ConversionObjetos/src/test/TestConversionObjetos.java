package test;

import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado oEmpleado;
        
        oEmpleado = new Escritor("Luis", 100, TipoEscritura.CLASICA);
        //System.out.println("oEmpleado = " + oEmpleado);
        
        System.out.println(oEmpleado.obtenerDetalles());
        
        //Downcasting
        //((Escritor)oEmpleado).getTipoEscritura();
        Escritor escritor = (Escritor) oEmpleado;
        escritor.getTipoEscritura();
        
        
        //Upcasting
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
}
