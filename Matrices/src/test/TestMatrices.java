package test;

import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);
        
        edades[0][0] = 1;
        edades[0][1] = 2;
        edades[1][0] = 3;
        edades[1][1] = 4;
        System.out.println("edades 0 - 0 = " + edades[0][0]);
         //Ciclco para imprimir los valores
        for (int ren = 0; ren < edades.length; ren++) {
            for (int col = 0; col < edades[ren].length; col++) {
                System.out.println("Edades = "+ren+" - " + col + ": "+edades[ren][col]);
            }
        }
        
        String frutas [][] ={{"Naranja", "Limon"}, 
                             {"Melon", "Papaya"}
        };
        imprimir(frutas);
        
        Persona oPersonas[][] = new Persona[2][2];
        oPersonas[0][0] = new Persona("Luis");
        oPersonas[0][1] = new Persona("Jesus");
        imprimir(oPersonas);
        
        Object oPersonas1[][] = {{"AAA", "BBB"},{"CCC"},{"DDD"}};
        imprimir(oPersonas1);
    }
    
    public static void imprimir(Object matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz[i].length; j++) {
                System.out.println("Persona 1 = "+i+" - "+j+": "+matriz[i][j]);
            }
        }
    }
}
