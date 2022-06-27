package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(3, 4);
        System.out.println("resultado = " + resultado);
        var resultado1 = Operaciones.sumar(3.5, 4.8);
        System.out.println("resultado1 = " + resultado1);
        
        var resultado2 =Operaciones.sumar(3, 5L);
        System.out.println("resultado2 = " + resultado2);
    }
}
