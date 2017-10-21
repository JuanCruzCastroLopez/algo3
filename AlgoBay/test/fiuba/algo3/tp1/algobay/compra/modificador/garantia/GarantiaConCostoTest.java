package fiuba.algo3.tp1.algobay.compra.modificador.garantia;

import org.junit.Assert;
import org.junit.Test;

public class GarantiaConCostoTest {

    @Test
    public void testGarantiaModificarPrecioCon0Devuelve0() {
        int precioActualizado = new GarantiaConCosto().modificarPrecio(0);

        Assert.assertTrue(precioActualizado == 0);
    }

    @Test
    public void testGarantiaModificarPrecioCon100devuelve10() {
        int precioActualizado = new GarantiaConCosto().modificarPrecio(100);

        Assert.assertTrue(precioActualizado == 110);
    }

    @Test
    public void testGarantiaModificarPrecioDevuelve10PorcientoDelPrecio() {
        int precioActualizado = new GarantiaConCosto().modificarPrecio(200);

        Assert.assertTrue(precioActualizado == 220);
    }

}
