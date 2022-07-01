package test;

import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos iInterfaces = new ImplementacionMySql();
        //iInterfaces.actualizar();
        imprimir(iInterfaces);
        iInterfaces = new ImplementacionOracle();
        imprimir(iInterfaces);
        //iInterfaces.eliminar();
    }
    
    public static void imprimir(IAccesoDatos iInterfaces){
        iInterfaces.actualizar();
    }
 
}
