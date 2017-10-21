package fiuba.algo3.tp1.algobay.compra;

import fiuba.algo3.tp1.algobay.NombreProductoVacioException;
import fiuba.algo3.tp1.algobay.PrecioProductoInvalidoException;
import fiuba.algo3.tp1.algobay.Producto;
import org.junit.Assert;
import org.junit.Test;

public class CompraTest {

    @Test
    public void testPrecioTotalEsIgualAceroCuandoNoHayProductosAgregados() {
        Compra compra = new Compra();
        Assert.assertTrue(compra.getPrecioTotal() == 0);
    }

    @Test
    public void testPrecioTotalEsIgualAlaSumatoriaDeLosProductosDeLaCompra() throws PrecioProductoInvalidoException, NombreProductoVacioException {
        Compra compra = new Compra();

        Producto spinnerRojo = new Producto("Spinner Rojo", 10);
        Producto spinnerAzul = new Producto("Spinner Azul", 10);
        Producto spinnerMetalico = new Producto("Spinner Metalico", 10);

        compra.agregarProducto(spinnerRojo);
        compra.agregarProducto(spinnerAzul);
        compra.agregarProducto(spinnerMetalico);

        int precioProductos = spinnerRojo.getPrecio() + spinnerAzul.getPrecio() + spinnerMetalico.getPrecio();

        Assert.assertTrue(compra.getPrecioTotal() == precioProductos);
    }

    @Test
    public void testPrecioTotalEsIgualAlPrecioDelproductoAlAgregarUnSoloProductoAlaCompra() throws PrecioProductoInvalidoException, NombreProductoVacioException {
        Compra compra = new Compra();

        Producto spinnerMetalico = new Producto("Spinner Metalico", 10);
        compra.agregarProducto(spinnerMetalico);

        Assert.assertTrue(compra.getPrecioTotal() == spinnerMetalico.getPrecio());
    }

    @Test
    public void testPrecioTotalEsIgualASumatoriaDeProductosMasEnvioCuandoEsCompraConEnvio() throws PrecioProductoInvalidoException, NombreProductoVacioException {
        Compra compra = new Compra();

        Producto spinnerRojo = new Producto("Spinner Rojo", 10);
        Producto spinnerAzul = new Producto("Spinner Azul", 10);
        Producto spinnerMetalico = new Producto("Spinner Metalico", 10);

        compra.agregarProducto(spinnerRojo);
        compra.agregarProducto(spinnerAzul);
        compra.agregarProducto(spinnerMetalico);
        compra.agregarEnvio();

        int precioProductos = spinnerRojo.getPrecio() + spinnerAzul.getPrecio() + spinnerMetalico.getPrecio();

        Assert.assertTrue(compra.getPrecioTotal() == (precioProductos + 100));
    }

    @Test
    public void testPrecioTotalEsIgualAceroCuandoNoHayProductosAgregadosYtieneGarantia() {
        Compra compra = new Compra();
        compra.agregarGarantia();

        Assert.assertTrue(compra.getPrecioTotal() == 0);
    }

    @Test
    public void testPrecioTotalEsIgualASumatoriaDel10PorcientoDelPrecioDeProductosCuandoEsCompraConGarantia() throws PrecioProductoInvalidoException, NombreProductoVacioException {
        Compra compra = new Compra();
        Producto spinnerRojo = new Producto("Spinner Rojo", 10);
        Producto spinnerAzul = new Producto("Spinner Azul", 10);
        Producto spinnerMetalico = new Producto("Spinner Metalico", 10);

        compra.agregarProducto(spinnerRojo);
        compra.agregarProducto(spinnerAzul);
        compra.agregarProducto(spinnerMetalico);
        compra.agregarGarantia();

        int precioProductos = (int) ((spinnerRojo.getPrecio() + spinnerAzul.getPrecio() + spinnerMetalico.getPrecio()) * 1.1);

        Assert.assertTrue(compra.getPrecioTotal() == precioProductos);
    }

    @Test
    public void testPrecioTotalEsIgualAl10PorcientoDelPrecioDelproductoAlAgregarUnSoloProductoYgarantiaAlaCompra() throws PrecioProductoInvalidoException, NombreProductoVacioException {
        Compra compra = new Compra();
        Producto spinnerMetalico = new Producto("Spinner Metalico", 10);

        compra.agregarProducto(spinnerMetalico);

        compra.agregarGarantia();

        Assert.assertTrue(compra.getPrecioTotal() == 11);
    }

    @Test
    public void testPrecioTotalEsIgualAcienCuandoNoHayProductosAgregadosPeroEsCompraConEnvio() throws PrecioProductoInvalidoException, NombreProductoVacioException {
        Compra compra = new Compra();
        compra.agregarEnvio();

        Assert.assertTrue(compra.getPrecioTotal() == 100);
    }

}
