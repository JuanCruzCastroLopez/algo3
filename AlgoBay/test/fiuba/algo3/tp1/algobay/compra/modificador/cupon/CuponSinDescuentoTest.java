package fiuba.algo3.tp1.algobay.compra.modificador.cupon;

import org.junit.Assert;
import org.junit.Test;

public class CuponSinDescuentoTest {

    @Test
    public void testCuponSinDescuentoEsMenorACuponConDescuento() throws PorcentajeCuponInvalidoException {
        CuponSinDescuento cuponSinDescuento = new CuponSinDescuento();
        CuponConDescuento cuponConDescuento = new CuponConDescuento(1);

        Assert.assertTrue(cuponSinDescuento.menorA(cuponConDescuento));
    }

    @Test
    public void testCuponSinDescuentonNoModificaElPrecio() throws PorcentajeCuponInvalidoException {
        int precio = 10;
        int precioModificado = new CuponSinDescuento().modificarPrecio(precio);

        Assert.assertTrue(precioModificado == precio);
    }

}
