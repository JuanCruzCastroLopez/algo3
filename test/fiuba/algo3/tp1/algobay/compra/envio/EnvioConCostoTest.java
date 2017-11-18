package fiuba.algo3.tp1.algobay.compra.envio;

import fiuba.algo3.tp1.algobay.compra.envio.EnvioConCosto;
import org.junit.Assert;
import org.junit.Test;

public class EnvioConCostoTest {

    @Test
    public void testEnvioModificarPrecioNoAgregaValorSiPrecioRecibidoMayorA5000() {
        int precioActualizado = new EnvioConCosto().modificarPrecio(6000);

        Assert.assertTrue(precioActualizado == 6000);
    }

    @Test
    public void testEnvioModificarPrecioCon100devuelve200() {
        int precioActualizado = new EnvioConCosto().modificarPrecio(100);

        Assert.assertTrue(precioActualizado == 200);
    }

    @Test
    public void testEnvioModificarPrecioDevuelveElPrecioRecibidoMas100() {
        int precioActualizado = new EnvioConCosto().modificarPrecio(0);

        Assert.assertTrue(precioActualizado == 100);
    }
}
