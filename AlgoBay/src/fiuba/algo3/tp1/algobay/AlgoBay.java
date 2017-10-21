package fiuba.algo3.tp1.algobay;

import fiuba.algo3.tp1.algobay.compra.Compra;
import fiuba.algo3.tp1.algobay.compra.cupon.CuponConDescuento;
import fiuba.algo3.tp1.algobay.compra.cupon.PorcentajeCuponInvalidoException;
import java.util.ArrayList;

public class AlgoBay {

    private final ArrayList<Producto> productos;

    public AlgoBay() {
        this.productos = new ArrayList<>();
    }

    public int getCantidadDeProductos() {
        return this.productos.size();
    }

    public Producto agregarProductoConPrecio(String nombreProducto, int precioProducto) throws PrecioProductoInvalidoException, NombreProductoVacioException {
        Producto producto = new Producto(nombreProducto, precioProducto);
        this.productos.add(producto);
        
        return producto;
    }

    public Producto getProducto(String nombreProducto) {
        for (Producto producto : this.productos) {
            if (producto.esProducto(nombreProducto)) {
                return producto;
            }
        }
        return null;
    }

    public Compra crearNuevaCompra() {
        return new Compra();
    }

    public void agregarProductoEnCompra(Producto producto, Compra compra) {
        compra.agregarProducto(producto);
    }

    public int getPrecioTotalDe(Compra compra) {
        return compra.getPrecioTotal();
    }

    public Compra crearNuevaCompraConEnvio() {
        Compra compra = new Compra();
        compra.agregarEnvio();
        
        return compra;
    }

    public Compra crearNuevaCompraConGarantia() {
        Compra compra = new Compra();
        compra.agregarGarantia();
        
        return compra;
    }

    Compra crearNuevaCompraConEnvioYGarantia() {
        Compra compra = new Compra();
        compra.agregarGarantia();
        compra.agregarEnvio();
        
        return compra;
    }

    public CuponConDescuento crearCuponConPorcentaje(int porcentaje) throws PorcentajeCuponInvalidoException {
        return new CuponConDescuento(porcentaje);
        
    }

    public void agregarCuponEnCompra(CuponConDescuento cupon, Compra compra) {
        compra.agregarCupon(cupon);
    }
}
