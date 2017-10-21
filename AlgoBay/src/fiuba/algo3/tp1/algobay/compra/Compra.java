package fiuba.algo3.tp1.algobay.compra;

import fiuba.algo3.tp1.algobay.Producto;
import fiuba.algo3.tp1.algobay.compra.adicional.Cupon;
import fiuba.algo3.tp1.algobay.compra.adicional.Envio;
import fiuba.algo3.tp1.algobay.compra.adicional.Garantia;
import java.util.ArrayList;

public class Compra {

    private final ArrayList<Producto> productos;
    private Cupon cupon;
    private Envio envio;
    private Garantia garantia;

    public Compra() {
        this.productos = new ArrayList<>();
        this.cupon = new CuponSinDescuento();
        this.envio = new EnvioSinCosto();
        this.garantia = new GarantiaSinCosto();
    }

    public int actualizarPrecioFinal(int precio) {
        precio = this.garantia.actualizarPrecio(precio);
        precio = this.envio.actualizarPrecio(precio);
        return this.cupon.actualizarPrecio(precio);
    }

    public int getPrecioTotal() {
        int precio = 0;
        for (Producto producto : this.productos) {
            precio += producto.getPrecio();
        }
        return actualizarPrecioFinal(precio);
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void agregarEnvio() {
        this.envio = new EnvioConCosto();
    }

    public void agregarGarantia() {
        this.garantia = new GarantiaConCosto();
    }

    public void agregarCupon(Cupon nuevoCupon) {            //TODO: Refactor - el cupon lo crea la compra
        if (this.cupon.menorA(nuevoCupon)) {
            this.cupon = nuevoCupon;
        }
    }

}
