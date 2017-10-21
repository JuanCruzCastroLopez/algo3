package fiuba.algo3.tp1.algobay.compra.modificador.garantia;

public class GarantiaSinCosto implements Garantia {

    @Override
    public int modificarPrecio(int precio) {
        return precio;
    }

    
}
