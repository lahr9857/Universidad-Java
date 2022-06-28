package paquete1;


public class Clase1 {
    //public String atributoPublico = "Valor atributo publico";
    
    /*public Clase1(){
        System.out.println("Constructor publico");
    }*/
    
    /*public void metodoPublico(){
        System.out.println("Metodo publico");
    }*/
    
    //Protected es para que las clases hijas accedan a las de la clase padre.
    //Debe estar en el mismo paquete para usar protected
    
    /*protected String atributoProtected = "Valor atributo protected";
    
    protected Clase1(){
        System.out.println("Constructor protected");
    }
    
    public Clase1(String arg){
        System.out.println("Constructor publico = ");
    }
    
    public void metodoProtected(){
        System.out.println("Metodo protected");
    }
    String atributoDefault = "Valor atributo default";
    
    Clase1(){
        System.out.println("Constructor default");
    }
    
    void metodoDefault(){
        System.out.println("Metodo default");
    }*/
    
    private String atributoPrivado ="Atributo Privado";
    
    private Clase1(){//Este constructor privado solo puede usarse desde esta misma clase
        System.out.println("Constructor privado");
    }
    
    public Clase1(String arg){
        this();
        System.out.println("Constructor publico");
    }
    
    private void metodoPrivado(){
        System.out.println("Metodo privado");
    }

    public String getAtributoPrivado() {
        return this.atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
}
