/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuba.algo3.tp1.algobay;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author jccastrolopez
 */
public class ProductoTest {

    @Test(expected = PrecioProductoInvalidoException.class)
    public void testCrearProductoConPrecioCeroLanzaExcepecion() throws PrecioProductoInvalidoException, NombreProductoVacioException {
        Producto producto = new Producto("Spinner", 0);
        Assert.assertNotNull(producto);
    }

    @Test(expected = PrecioProductoInvalidoException.class)
    public void testCrearProductoConPrecioNegativoLanzaExcepecion() throws PrecioProductoInvalidoException, NombreProductoVacioException {
        Producto producto = new Producto("Spinner", 0);
        Assert.assertNotNull(producto);
    }

    @Test(expected = NombreProductoVacioException.class)
    public void testCrearProductoConNombreVacioLanzaExcepecion() throws PrecioProductoInvalidoException, NombreProductoVacioException {
        Producto producto = new Producto("", 10);
        Assert.assertNotNull(producto);
    }
    
    @Test
    public void testProductoConNombreSpinnerDevuelveFalseAlPreguntarSiSuNombreEsXbox() throws PrecioProductoInvalidoException, NombreProductoVacioException {
        Producto producto = new Producto("Spinner", 20);
        Assert.assertFalse(producto.esProducto("xBox"));
    }
    
        @Test
    public void testProductoConNombreSpinnerDevuelveTrueAlPreguntarSiSuNombreEsSpinner() throws PrecioProductoInvalidoException, NombreProductoVacioException {
        String nombreProducto = "Spinner";
        
        Producto producto = new Producto(nombreProducto, 20);
        Assert.assertFalse(producto.esProducto(nombreProducto));
    }
    
}
