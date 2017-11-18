package fiuba.algo3.tp1.algobay.compra.garantia;

public class GarantiaConCosto implements Garantia {

    private final double porcentaje;

    public GarantiaConCosto() {
        porcentaje = 1.1;
    }

    @Override
    public int modificarPrecio(int precio) {
        return (int) (precio * this.porcentaje);
    }
    
}
