package fiuba.algo3.tp1.algobay.compra.modificador.cupon;

public class CuponSinDescuento implements Cupon {

    @Override
    public int modificarPrecio(int precio) {
        return precio;
    }

    @Override
    public boolean menorA(CuponConDescuento cupon) {
        return true;
    }

}
