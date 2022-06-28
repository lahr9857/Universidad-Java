package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        /*Clases envolventes de tipos primitivos
        int - Integer
        long - Long
        float -  Float
        double - Double
        boolean - Boolean
        char - Character
        byte - Byte
        short - Short
        Se utilizan porque tienen atributos y metodos
        */
        //Autoboxing
        Integer entero = 10;
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.toString());
        
        //Unboxing
        int entero2 = entero;
        System.out.println("entero2 = " + entero2);
    }
}
