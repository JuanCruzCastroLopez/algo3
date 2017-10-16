package fiuba.algo3.tp1.algobay.compra.adicional;

import org.junit.Assert;
import org.junit.Test;

public class EnvioTest {

    @Test
    public void testEnvioActualizarPrecioNoAgregaValorSiPrecioRecibidoMayorA5000() {
        int precioActualizado = new Envio().actualizarPrecio(6000);

        Assert.assertTrue(precioActualizado == 6000);
    }

    @Test
    public void testEnvioActualizarPrecioCon100devuelve200() {
        int precioActualizado = new Envio().actualizarPrecio(100);

        Assert.assertTrue(precioActualizado == 200);
    }

    @Test
    public void testEnvioActualizarPrecioDevuelveElPrecioRecibidoMas100() {
        int precioActualizado = new Envio().actualizarPrecio(0);

        Assert.assertTrue(precioActualizado == 100);
    }
}
