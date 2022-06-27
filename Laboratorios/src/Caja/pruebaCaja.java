package Caja;

public class pruebaCaja {
    public static void main(String[] args) {
        Caja oCaja = new Caja();
        oCaja.a=3;
        oCaja.b=2;
        oCaja.c=6;
        int resultado = oCaja.volumen();
        System.out.println("Resultado del volumen con metodo es: "+resultado);
        
        Caja oCaja1 = new Caja(3,2,6);
    }
}
