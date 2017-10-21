package fiuba.algo3.tp1.algobay.compra.envio;

public class EnvioSinCosto implements Envio {

    @Override
    public int modificarPrecio(int precio) {
        return precio;
    }
    
}
