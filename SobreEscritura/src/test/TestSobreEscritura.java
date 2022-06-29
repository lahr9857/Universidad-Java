package test;

import domain.Gerente;

public class TestSobreEscritura {
    public static void main(String[] args) {
        Gerente oGerente = new Gerente("Luis", 30.25, "Compras");
        System.out.println("Gerente ="+oGerente.obtenerDetalles());
    }
}
