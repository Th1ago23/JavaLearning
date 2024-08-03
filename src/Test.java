import Models.ModeloCarro;

public class Test {
    public static void main(String[] args) {
        ModeloCarro carro = new ModeloCarro("Civic",31200d, 51000.40d, 42000d, 2020, "Hatch");
        System.out.println(carro.precoMedio());
        System.out.println(carro.verificaMaiorPreco());
        System.out.println(carro.verificaMenorPreco());

    }
}
