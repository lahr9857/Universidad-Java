package excepciones;

/*public class OperacionExcepcion extends Exception{
    //1.Se extiende de la clase expcetion
    //2. Recibidmos un mensaje
    //3. Lo mandamos a la clase de exception
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
}
*/

public class OperacionExcepcion extends RuntimeException{
    public OperacionExcepcion (String mensaje){
        super(mensaje);
        //Con esta sintaxis no obliga a extender de excepcion.
    }
}