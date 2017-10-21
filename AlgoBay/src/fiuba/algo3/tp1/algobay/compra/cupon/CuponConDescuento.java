package fiuba.algo3.tp1.algobay.compra.cupon;

public class CuponConDescuento implements Cupon {

    private final float descuento;

    public CuponConDescuento(int porcentaje) throws PorcentajeCuponInvalidoException {
        if (porcentaje <= 0) {
            throw new PorcentajeCuponInvalidoException();
        }
        this.descuento = porcentaje / 100f;
    }

    public float getDescuento() {
        return this.descuento;
    }

    @Override
    public int modificarPrecio(int precio) {
        return (int) (precio - (precio * this.descuento));
    }

    @Override
    public boolean menorA(CuponConDescuento cupon) {
        return this.descuento < cupon.getDescuento();
    }

}
