package fiuba.algo3.tp1.algobay.compra.envio;

import fiuba.algo3.tp1.algobay.compra.envio.EnvioSinCosto;
import org.junit.Assert;
import org.junit.Test;

public class EnvioSinCostoTest {

    @Test
    public void testEnvioSinCostoNoModificaElPrecio() {
        int precio = 10;
        int precioActualizado = new EnvioSinCosto().modificarPrecio(precio);

            Assert.assertTrue(precioActualizado == precio);
    }
}
