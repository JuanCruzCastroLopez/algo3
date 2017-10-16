package fiuba.algo3.tp1.algobay.compra.adicional;

public class Cupon {

    private final int descuento;
    
    public Cupon(int porcentaje) throws PorcentajeCuponInvalidoException {
        if (porcentaje <= 0) {
            throw new PorcentajeCuponInvalidoException();
        }
        this.descuento = porcentaje;
    }
    
    public int getDescuento() {
        return this.descuento;
    }
    
    public int actualizarPrecio(int precio) {
        return precio - (precio * descuento);
    }
    
    public boolean menorA(Cupon cupon) {
        return descuento < cupon.getDescuento();
    }
}
