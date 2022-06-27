package mx.com.luisherrera.ventas;

public class Producto {
    private final int idProducto;
    private String nombreProducto;
    private double precioProducto;
    private static int contadorProductos;
    
    //Este constructor solo se inicializa el idProducto 
    //y solo se puede usar dentro de esta clase.
    private Producto(){
        this.idProducto=++Producto.contadorProductos;
        //Asignamos a idProducto un preincremento con el
        //contadorProducto 
    }
    
    //Este constructor recibe dos argumentos para el producto
    public Producto(String nombre, double precio){
        this();//Se llama al constructor vacio Producto().
        this.nombreProducto=nombre;
        this.precioProducto=precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + '}';
    }
    
}
