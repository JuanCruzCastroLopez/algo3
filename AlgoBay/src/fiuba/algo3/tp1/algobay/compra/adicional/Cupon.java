package fiuba.algo3.tp1.algobay.compra.adicional;

public class Cupon {

    private final float descuento;

    public Cupon(int porcentaje) throws PorcentajeCuponInvalidoException {
        if (porcentaje <= 0) {
            throw new PorcentajeCuponInvalidoException();
        }
        this.descuento = porcentaje / 100f;
    }

    public float getDescuento() {
        return this.descuento;
    }

    public int actualizarPrecio(int precio) {
        return (int) (precio - (precio * this.descuento));
    }

    public boolean menorA(Cupon cupon) {
        return this.descuento < cupon.getDescuento();
    }
}
