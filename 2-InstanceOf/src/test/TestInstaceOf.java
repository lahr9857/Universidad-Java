package test;

import domain.*;

public class TestInstaceOf {

    public static void main(String[] args) {
        Empleado oEmpleado = new Empleado("Juan", 500);
        determinarTipo(oEmpleado);
        oEmpleado = new Gerente("Luis", 100, "Sistemas");
        determinarTipo(oEmpleado);

    }

    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo gerente");
            //Los parentesis hacen la conversion de la clase
            Gerente gerente = (Gerente) empleado;
            System.out.println("Gerente = "+gerente.getDepartamento());
        }
        else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo empleado");
            //Gerente gerente = (Gerente) empleado;
            //System.out.println("Gerente = "+gerente.getDepartamento());
        }
        else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }
}
