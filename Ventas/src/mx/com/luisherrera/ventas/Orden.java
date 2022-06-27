package mx.com.luisherrera.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10; //Constante maximo de productos.
    
    public Orden(){
        this.idOrden=++Orden.contadorOrdenes;
        this.productos=new Producto[Orden.MAX_PRODUCTOS];
    }
    
    //Metodo publico que no regresa nada y recibe un argumento obejto de tipo producto.
    public void agregarProducto(Producto producto){ 
        //Valida que no se pase del maximo de productos agregados a nuestro arreglo
        if (this.contadorProductos  < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto; 
            //Se agrega el nuevo producto, la variable contador 
            //productos almance la posicion en el arreglo.
        }
        else{
            System.out.println("Se ha superado el maximo de productos."+ Orden.MAX_PRODUCTOS);
        }
    }
    
    //Metodo publico que regresa un double.
    public double calcularTotal(){
        double total = 0; //Se define una varible donde se almacena el total de la suma.
        for (int i = 0; i < this.contadorProductos; i++) {
            //Producto producto = this.productos[i]; 
            //total+=producto.getPrecioProducto(); = //total=total + producto.getPrecio();
            total+=this.productos[i].getPrecioProducto();
            //se usa el arreglo con el contador (i) y el metodo getPrecio();
        }
        return total;
    }
    
    public void mostarOrden(){
        System.out.println("Id Orden: "+this.idOrden);
        double totalOrden=this.calcularTotal();
        System.out.println("Total de la Orden: $"+totalOrden);
        System.out.println("Productos de la orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }
}
