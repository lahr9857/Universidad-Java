package Operaciones;

public class Aritmetica {
    //Atributos
    int a;
    int b;
    
    //Metodos
    public  void sumar(){
        int resultado = a*b;
        System.out.println("Resultado: "+resultado);
    }
    
    public int sumarConRetorno(){
        return a+b;
    }
    
    public void restar(){
        int resultado = a - b;
        System.out.println("Resultado: "+resultado);
    }
    
    public void multiplicacion(){
        int resultado = a + b;
        System.out.println("Resultado: "+resultado);
    }
    
    public void division(){
        float fresultado=a/b;
        System.out.println("Resultado: "+fresultado);
    }
}
