package mundopc;

import com.luisherrera.mundopc.*;

public class MundoPc {
    public static void main(String[] args) {
        Raton oRaton = new Raton("USB","HyperX");
        Teclado oTeclado = new Teclado ("Bluetooth", "Kraken");
        Monitor oMonitor = new Monitor("HP", 27);
        Computadora oComputadoraHP = new Computadora("OMEN", oMonitor, oTeclado, oRaton);
        
        Orden oOrden = new Orden();
        oOrden.agregarComputadora(oComputadoraHP);
        oOrden.mostrarOrden();
    }
}
