package fiuba.algo3.tp1.algobay.compra;

import fiuba.algo3.tp1.algobay.Producto;
import fiuba.algo3.tp1.algobay.compra.adicional.Adicional;
import fiuba.algo3.tp1.algobay.compra.adicional.Cupon;
import fiuba.algo3.tp1.algobay.compra.adicional.Envio;
import java.util.ArrayList;

public class Compra {

    private final ArrayList<Producto> productos;
    private final ArrayList<Adicional> adicionales;
    private Cupon cupon;

    public Compra() {
        this.productos = new ArrayList<>();
        this.adicionales = new ArrayList<>();
        this.cupon = null;
    }

    public int getPrecioTotal() {
        int precio = 0;
        for (Producto producto : this.productos) {
            precio += producto.getPrecio();
        }
        for (Adicional adicional : this.adicionales) {
            precio = adicional.actualizarPrecio(precio);
        }
        if (this.existeCupon()) {
            precio = this.cupon.actualizarPrecio(precio);
        }
        return precio;
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void agregarAdicional(Adicional adicional) {
        this.adicionales.add(adicional);
    }

    private boolean existeCupon() {
        return this.cupon != null;
    }

    public void agregarCupon(Cupon nuevoCupon) {
        if (this.cupon == null || this.cupon.menorA(nuevoCupon)) {
            this.cupon = nuevoCupon;
        }
    }

}
