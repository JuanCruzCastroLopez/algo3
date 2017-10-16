package fiuba.algo3.tp1.algobay.compra.adicional;

import org.junit.Assert;
import org.junit.Test;

public class GarantiaTest {

    @Test
    public void testGarantiaActualizarPrecioCon0Devuelve0() {
        int precioActualizado = new Garantia().actualizarPrecio(0);

        Assert.assertTrue(precioActualizado == 0);
    }

    @Test
    public void testGarantiaActualizarPrecioCon100devuelve10() {
        int precioActualizado = new Garantia().actualizarPrecio(100);

        Assert.assertTrue(precioActualizado == 110);
    }

    @Test
    public void testGarantiaActualizarPrecioDevuelve10PorcientoDelPrecio() {
        int precioActualizado = new Garantia().actualizarPrecio(200);

        Assert.assertTrue(precioActualizado == 220);
    }

}
