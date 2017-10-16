package fiuba.algo3.tp1.algobay.compra.adicional;

public class Garantia implements Adicional{

    @Override
    public int actualizarPrecio(int precio) {
        return (int) (precio * 1.1);
    }

}
