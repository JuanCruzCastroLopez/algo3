package fiuba.algo3.tp1.algobay.compra.garantia;

import fiuba.algo3.tp1.algobay.compra.garantia.GarantiaSinCosto;
import org.junit.Assert;
import org.junit.Test;

public class GarantiaSinCostoTest {

    @Test
    public void testGarantiaSinCostoNoModificaElPrecio() {
        int precio = 10;
        int precioModificado = new GarantiaSinCosto().modificarPrecio(precio);

        Assert.assertTrue(precioModificado == precio);
    }

}
