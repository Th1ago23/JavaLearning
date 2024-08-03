package Models;

public class ModeloCarro extends Carro{
    int anoModelo;
    String tipoModelo;

    public ModeloCarro(String modelo, double preco1, double preco2, double preco3, int anoModelo, String tipoModelo) {
        super(modelo, preco1, preco2, preco3);
        this.anoModelo = anoModelo;
        this.tipoModelo = tipoModelo;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getTipoModelo() {
        return tipoModelo;
    }

    public void setTipoModelo(String tipoModelo) {
        this.tipoModelo = tipoModelo;
    }
}