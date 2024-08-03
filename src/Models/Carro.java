package Models;
public class Carro{
    String modelo;
    double preco1;
    double preco2;
    double preco3;

    public Carro(String modelo, double preco1, double preco2, double preco3) {
        this.modelo = modelo;
        this.preco1 = preco1;
        this.preco2 = preco2;
        this.preco3 = preco3;
    }

    public Carro() {

    }

    public double getPreco1() {
        return preco1;
    }

    public void setPreco1(double preco1) {
        this.preco1 = preco1;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco3() {
        return preco3;
    }

    public void setPreco3(double preco3) {
        this.preco3 = preco3;
    }

    public double getPreco2() {
        return preco2;
    }

    public void setPreco2(double preco2) {
        this.preco2 = preco2;
    }

    public void definirModelo(String modelo){
        this.modelo = modelo;
    }

    public double precoMedio(){
        return (preco1 + preco2 + preco3) / 3;
    }
    public double verificaMaiorPreco(){
        double maiorPreco = preco1;
        if (maiorPreco < preco2){
            maiorPreco = preco2;
        }

        if (maiorPreco < preco3){
            maiorPreco = preco3;
        }

        return maiorPreco;
    }

    public double verificaMenorPreco(){
        double menorPreco = preco1;

        if (menorPreco < preco2){
            menorPreco = preco2;
        }
        if (menorPreco < preco3){
            menorPreco = preco3;
        }

        return menorPreco;
    }
}