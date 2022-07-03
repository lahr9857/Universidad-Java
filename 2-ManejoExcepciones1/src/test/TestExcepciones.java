package test;

public class TestExcepciones {

    public static void main(String[] args) {
        //Los exception se utilizan para que nuestro prorama no termine de manera 
        //Abrupta y se pueda recuperar
        int resultado = 0;
        try {
            resultado = 10 / 0;
        } catch (Exception e) {
            System.out.println("Ocurrio un error");
            e.printStackTrace(System.out);//Se imprime la pila de excepciones
        }
        System.out.println("resultado = " + resultado);//Se imprime el valor inicial
        //debido al error y se trata de controlar la excepcion.
    }
}
