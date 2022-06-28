package paquete2;

import paquete1.Clase1;

public class ClaseHija extends Clase1 {
    public ClaseHija(){
        /*super();//Unica manera de usar el constructor de la clase padre.
        this.atributoProtected="Modificacion atributo protected";
        System.out.println("Atributo protetejido"+this.atributoProtected);
        this.metodoProtected();
        */
        
        super("Publico");
        
    }
}
