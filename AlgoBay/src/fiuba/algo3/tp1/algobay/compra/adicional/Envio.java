package fiuba.algo3.tp1.algobay.compra.adicional;

public class Envio implements Adicional {

    @Override
    public int actualizarPrecio(int precio) {
        return (precio > 5000) ? precio : (precio + 100);
    }
    
}
