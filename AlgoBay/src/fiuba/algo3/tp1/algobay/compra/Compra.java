package fiuba.algo3.tp1.algobay.compra;

import fiuba.algo3.tp1.algobay.compra.garantia.GarantiaConCosto;
import fiuba.algo3.tp1.algobay.compra.envio.EnvioConCosto;
import fiuba.algo3.tp1.algobay.compra.garantia.GarantiaSinCosto;
import fiuba.algo3.tp1.algobay.compra.envio.EnvioSinCosto;
import fiuba.algo3.tp1.algobay.compra.cupon.CuponSinDescuento;
import fiuba.algo3.tp1.algobay.Producto;
import fiuba.algo3.tp1.algobay.compra.cupon.CuponConDescuento;
import fiuba.algo3.tp1.algobay.compra.envio.Envio;
import fiuba.algo3.tp1.algobay.compra.garantia.Garantia;
import fiuba.algo3.tp1.algobay.compra.cupon.Cupon;
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
        precio = this.garantia.modificarPrecio(precio);
        precio = this.envio.modificarPrecio(precio);
        return this.cupon.modificarPrecio(precio);
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

    public void agregarCupon(CuponConDescuento nuevoCupon) {
        if (this.cupon.menorA(nuevoCupon)) {
            this.cupon = nuevoCupon;
        }
    }

}
