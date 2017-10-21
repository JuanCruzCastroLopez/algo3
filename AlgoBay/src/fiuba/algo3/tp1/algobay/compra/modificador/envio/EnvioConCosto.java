package fiuba.algo3.tp1.algobay.compra.modificador.envio;

public class EnvioConCosto implements Envio {

    private final int costo;
    private final int limitePrecio;

    public EnvioConCosto() {
        this.costo = 100;
        this.limitePrecio = 5000;
    }

    @Override
    public int modificarPrecio(int precio) {
        return (precio > this.limitePrecio) ? precio : (precio + this.costo);
    }
    
}
