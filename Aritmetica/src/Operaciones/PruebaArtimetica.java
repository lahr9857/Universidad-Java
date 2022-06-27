package Operaciones;

public class PruebaArtimetica {
    public static void main(String[] args) {
        Aritmetica oAritmetica = new Aritmetica();
        oAritmetica.a=10;
        oAritmetica.b=2;
        oAritmetica.sumar();
        /*
        oAritmetica.division();
        oAritmetica.multiplicacion();
        oAritmetica.restar();
        oAritmetica.sumarConRetorno();
        */
        int resultado = oAritmetica.sumarConRetorno();
        System.out.println("Resultado con retorno: "+resultado);
    }
}
