package test;

import domain.*;

public class TestSobreEscritura {
    public static void main(String[] args) {
        Empleado oEmpleado = new Empleado("Juan",500);
        //System.out.println("oEmpleado = " + oEmpleado.obtenerDetalles());
        imprimir(oEmpleado);
        
        oEmpleado = new Gerente ("Luis",100,"Sistemas");
        //System.out.println("oGerente = " + oGerente.obtenerDetalles());
        imprimir(oEmpleado);
    }
    
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
