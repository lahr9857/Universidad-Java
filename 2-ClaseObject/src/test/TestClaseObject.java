package test;

import domain.Empleado;

public class TestClaseObject {
    public static void main(String[] args) {
        Empleado oEmpleado = new Empleado("Juan", 500);
        Empleado oEmpleado1 = new Empleado("Juan", 500);
        
        if (oEmpleado1 == oEmpleado) {
            System.out.println("Tienen la misma referencia de memoria");
        }else{
            System.out.println("Tienen distinta referencia de memoria");
        }

        if (oEmpleado.equals(oEmpleado1)) {
            System.out.println("Son objetos iguales en contenido");
        }else{
            System.out.println("Los objetos son diferentes en contenido");
        }
        
        if(oEmpleado.hashCode() == oEmpleado1.hashCode()){
            System.out.println("El valor de hascode es igual"+oEmpleado.hashCode());
        }else{
            System.out.println("El valor hashcode es distinto");
        }
    }
}
