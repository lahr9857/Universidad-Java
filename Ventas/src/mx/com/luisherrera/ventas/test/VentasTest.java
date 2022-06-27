package mx.com.luisherrera.ventas.test;

import mx.com.luisherrera.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto oProducto = new Producto("Camisa", 50);
        Producto oProducto1= new Producto("Pantalon", 100.50);
        Producto oProducto2= new Producto("Sueter", 200.80);
        
        Orden oOrden = new Orden();
        oOrden.agregarProducto(oProducto);
        oOrden.agregarProducto(oProducto1);
        oOrden.mostarOrden();
        
        Orden oOrden1 = new Orden();
        oOrden1.agregarProducto(oProducto2);
        oOrden1.agregarProducto(oProducto1);
        oOrden1.mostarOrden();
    }
}
