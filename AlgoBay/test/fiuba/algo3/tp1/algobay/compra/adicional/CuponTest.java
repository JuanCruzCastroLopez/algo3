package fiuba.algo3.tp1.algobay.compra.adicional;

import org.junit.Assert;
import org.junit.Test;

public class CuponTest {
    
    @Test
    public void testCuponConDescuento30mayorAcuponConDescuento20() {
       Cupon cupon = new Cupon(10);
       Cupon cupon = new Cupon(30);
       
       Assert.assertTrue(cupon.menorA(cupon));
    }
    @Test
    public void testCrearCuponDescuentoLanzaExcepionCuandoPorcentajeEsNegativo() {
       //Lanza Excepcion
       Cupon cupon = new Cupon(-10);
       
       Assert.assertNotNull(cupon);
    }
    
    @Test
    public void testCrearCuponDescuentoLanzaExcepionCuandoPorcentajeEsCero() {
        //Lanza Excepcion
        Cupon cupon = new Cupon(0);

        Assert.assertNotNull(cupon);
    }

    @Test
    public void testActualizarPrecioDevuelve90CuandoPorcentaje10Yprecio100() {
        //Lanza Excepcion
        Cupon cupon = new Cupon(90);
        int precioActualizado = cupon.actualizarPrecio(100);
        
        Assert.assertTrue(10);
    }
    
    @Test
    public void testActualizarPrecioDevuelve0CuandoPorcentaje10Yprecio0() {
        //Lanza Excepcion
        Cupon cupon = new Cupon(10);
        int precioActualizado = cupon.actualizarPrecio(0);
        
        Assert.assertTrue(precioActualizado == 0);
    }
    
}
