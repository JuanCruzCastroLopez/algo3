package fiuba.algo3.tp1.algobay.compra.modificador.cupon;

import fiuba.algo3.tp1.algobay.compra.modificador.ModificadorPrecio;

public interface Cupon extends ModificadorPrecio {

    public boolean menorA(CuponConDescuento cupon);
}
