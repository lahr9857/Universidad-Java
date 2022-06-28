package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        TestArgumentosVariables.imprimirNumeros(1,2,3,4,5);
        TestArgumentosVariables.variosParametros("Hola",1,2);
    }
    
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("Nombre: "+nombre);
        imprimirNumeros(numeros);
    }
    
    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos = " +numeros[i]);
        }
    }
}
