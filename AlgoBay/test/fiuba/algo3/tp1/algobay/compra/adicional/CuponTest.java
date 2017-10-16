package fiuba.algo3.tp1.algobay.compra.adicional;

import org.junit.Assert;
import org.junit.Test;

public class CuponTest {
    
    @Test
    public void testCuponConDescuento30mayorAcuponConDescuento20() throws PorcentajeCuponInvalidoException {
       Cupon cupon1 = new Cupon(10);
       Cupon cupon2 = new Cupon(30);
       
       Assert.assertTrue(cupon1.menorA(cupon2));
    }
    
    @Test(expected = PorcentajeCuponInvalidoException.class)
    public void testCrearCuponDescuentoLanzaExcepionCuandoPorcentajeEsNegativo() throws PorcentajeCuponInvalidoException {
       //Lanza Excepcion
       Cupon cupon = new Cupon(-10);
       
       Assert.assertNotNull(cupon);
    }
    
    @Test(expected = PorcentajeCuponInvalidoException.class)
    public void testCrearCuponDescuentoLanzaExcepionCuandoPorcentajeEsCero() throws PorcentajeCuponInvalidoException {
        //Lanza Excepcion
        Cupon cupon = new Cupon(0);

        Assert.assertNotNull(cupon);
    }

    @Test(expected = PorcentajeCuponInvalidoException.class)
    public void testActualizarPrecioDevuelve90CuandoPorcentaje10Yprecio100() throws PorcentajeCuponInvalidoException {
        //Lanza Excepcion
        Cupon cupon = new Cupon(90);
        int precioActualizado = cupon.actualizarPrecio(100);
        
        Assert.assertTrue(precioActualizado == 10);
    }
    
    @Test
    public void testActualizarPrecioDevuelve0CuandoPorcentaje10Yprecio0() throws PorcentajeCuponInvalidoException {
        //Lanza Excepcion
        Cupon cupon = new Cupon(10);
        int precioActualizado = cupon.actualizarPrecio(0);
        
        Assert.assertTrue(precioActualizado == 0);
    }
    
}
