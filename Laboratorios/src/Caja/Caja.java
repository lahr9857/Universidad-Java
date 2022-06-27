package Caja;

public class Caja {
    int a, b, c;
    
    public Caja(){
        System.out.println("Se esta ejecutando el constructor");
    }
    
    public Caja (int a, int b, int c){
        a =a ; b=b; c=c;
        int resultado = a*b*c;
        System.out.println("El resultado del volumen es: "+resultado);
    }
    
    public int volumen(){
        return a * b * c;
    }
}
