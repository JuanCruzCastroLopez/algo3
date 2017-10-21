package fiuba.algo3.tp1.algobay.compra.modificador.cupon;

import org.junit.Assert;
import org.junit.Test;

public class CuponConDescuentoTest {
    
    @Test
    public void testCuponConDescuento30mayorAcuponConDescuento20() throws PorcentajeCuponInvalidoException {
       CuponConDescuento cupon1 = new CuponConDescuento(10);
       CuponConDescuento cupon2 = new CuponConDescuento(30);
       
       Assert.assertTrue(cupon1.menorA(cupon2));
    }
    
    @Test(expected = PorcentajeCuponInvalidoException.class)
    public void testCrearCuponDescuentoLanzaExcepionCuandoPorcentajeEsNegativo() throws PorcentajeCuponInvalidoException {
       //Lanza Excepcion
       CuponConDescuento cupon = new CuponConDescuento(-10);
       
       Assert.assertNotNull(cupon);
    }
    
    @Test(expected = PorcentajeCuponInvalidoException.class)
    public void testCrearCuponDescuentoLanzaExcepionCuandoPorcentajeEsCero() throws PorcentajeCuponInvalidoException {
        //Lanza Excepcion
        CuponConDescuento cupon = new CuponConDescuento(0);

        Assert.assertNotNull(cupon);
    }

    public void testActualizarPrecioDevuelve90CuandoPorcentaje10Yprecio100() throws PorcentajeCuponInvalidoException {
        //Lanza Excepcion
        CuponConDescuento cupon = new CuponConDescuento(90);
        int precioActualizado = cupon.modificarPrecio(100);
        
        Assert.assertTrue(precioActualizado == 10);
    }
    
    @Test
    public void testActualizarPrecioDevuelve0CuandoPorcentaje10Yprecio0() throws PorcentajeCuponInvalidoException {
        //Lanza Excepcion
        CuponConDescuento cupon = new CuponConDescuento(10);
        int precioActualizado = cupon.modificarPrecio(0);
        
        Assert.assertTrue(precioActualizado == 0);
    }
    
}
