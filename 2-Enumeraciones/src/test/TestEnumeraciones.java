package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {

    public static void main(String[] args) {
//        System.out.println("Dia 1 de la semana: "+Dias.LUNES);
//        indicarDiaSemana(Dias.MIERCOLES);
        System.out.println("Continente no. 4: " + Continentes.AMERICA);
        System.out.println("No. de paises en el 4to contiente: " + Continentes.AMERICA.getPaises());
    }

    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Dia 1: " + Dias.LUNES);
                break;
            case MARTES:
                System.out.println("Dia 2: " + Dias.MARTES);
                break;
            case MIERCOLES:
                System.out.println("Dia 3: " + Dias.MIERCOLES);
                break;
            case JUEVES:
                System.out.println("Dia 4: " + Dias.JUEVES);
                break;
        }
    }
}
