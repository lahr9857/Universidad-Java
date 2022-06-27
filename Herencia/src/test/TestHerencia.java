package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

public class TestHerencia {

    public static void main(String[] args) {
        Empleado oEmpleado = new Empleado("Luis", 5000.0);
        System.out.println("oEmpleado = " + oEmpleado);
        //var fecha = new Date();
        //Cliente oCliente = new Cliente(fecha, true, "Luis", 'M', 28, "Norte 4");
        //System.out.println("oCliente = " + oCliente);
    }
}
