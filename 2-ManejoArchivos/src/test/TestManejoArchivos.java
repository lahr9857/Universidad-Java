package test;

import static ManejoArchivos.ManejoArchivos.*;

public class TestManejoArchivos {

    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";
        //crearArchivo(nombreArchivo);
        //anexarInformacion(nombreArchivo, "Hola desde java");
        //anexarInformacion(nombreArchivo, "Hola guapo");
        leerArchivo(nombreArchivo);
    }
}
