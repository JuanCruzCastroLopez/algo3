package fiuba.algo3.tp1.algobay;

import org.junit.Assert;
import org.junit.Test;

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
        Assert.assertTrue(producto.esProducto(nombreProducto));
    }
    
    @Test
    public void testGetPrecioDevuelve10CuandoPrecioProductoEs10() throws PrecioProductoInvalidoException, NombreProductoVacioException {
        int precioProducto = 10;
        Producto producto = new Producto("Spinner", precioProducto);
        Assert.assertTrue(producto.getPrecio() == precioProducto);
    }
    
}
