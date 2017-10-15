package fiuba.algo3.tp1.algobay;

public class Producto {

    private String nombre;
    private int precio;

    public Producto(String nombreProducto, int precioProducto) throws PrecioProductoInvalidoException, NombreProductoVacioException {
        if (precioProducto <= 0) {
            throw new PrecioProductoInvalidoException();
        }
        if (nombreProducto.isEmpty()) {
            throw new NombreProductoVacioException();
        }
        this.nombre = nombreProducto;
        this.precio = precioProducto;
    }

    public boolean esProducto(String nombreProducto) {
        return this.nombre.equals(nombreProducto);
    }
    
    
    
}
