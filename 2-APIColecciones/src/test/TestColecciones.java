package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {
        //Lista se pueden duplicar los elementos.
        //Set no guarda el orden en el que se agregaron y set 
        //desecha los elementos duplicados
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");

        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        //imprimir(miSet);
        
        Map miMapa = new HashMap();
        miMapa.put("Valor1", "Juan");
        miMapa.put("Valor2", "Luis");
        
        String elemento = (String) miMapa.get("Valor1");
        //System.out.println("elemento = " + elemento);
        
        imprimir(miMapa.keySet());//Se imprimen las "llaves" = valor1
        imprimir(miMapa.values());//Se imprimen los valores = nombres
    }

    public static void imprimir(Collection coleccion) {
        /*for (Object elemento : coleccion) {
            System.out.println("Elemento" + coleccion);
        }*/

        coleccion.forEach(elemento -> {
            System.out.println("Elemento = " + elemento);
        });
    }
}
