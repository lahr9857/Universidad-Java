package ManejoArchivos;

import java.io.*;

public class ManejoArchivos {

    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo.");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void escribirArchivo(String nombreArchivo, String contenidoArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenidoArchivo);
            salida.close();
            System.out.println("Se ha escrito el archivo.");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void anexarInformacion(String nombreArchivo, String contenidoArchivo){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenidoArchivo);
            salida.close();
            System.out.println("Se ha anexado informacion en  el archivo.");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void leerArchivo(String nombreArchivo){
        var archivo = new File(nombreArchivo);
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine();
            while(lectura!=null){
                System.out.println("lectura = " + lectura);
                lectura=entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
