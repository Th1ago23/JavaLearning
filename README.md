Projeto Carro
Este repositório contém uma implementação de classes em Java para representar um carro e suas variações. Ele inclui métodos para calcular o preço médio, verificar o maior preço e o menor preço entre três preços fornecidos.

Estrutura do Projeto
O projeto contém as seguintes classes:

Carro
ModeloCarro
Test
Carro
A classe Carro possui os seguintes atributos e métodos:

Atributos
modelo: String - modelo do carro.
preco1: double - primeiro preço do carro.
preco2: double - segundo preço do carro.
preco3: double - terceiro preço do carro.
Métodos
getPreco1(), setPreco1(double preco1)
getModelo(), setModelo(String modelo)
getPreco2(), setPreco2(double preco2)
getPreco3(), setPreco3(double preco3)
definirModelo(String modelo)
precoMedio(): Calcula o preço médio entre os três preços.
verificaMaiorPreco(): Verifica o maior preço entre os três preços.
verificaMenorPreco(): Verifica o menor preço entre os três preços.
ModeloCarro
A classe ModeloCarro herda de Carro e adiciona os seguintes atributos e métodos:

Atributos
anoModelo: int - ano do modelo do carro.
tipoModelo: String - tipo do modelo do carro.
Métodos
getAnoModelo(), setAnoModelo(int anoModelo)
getTipoModelo(), setTipoModelo(String tipoModelo)
Test
A classe Test contém o método main para testar a funcionalidade das classes Carro e ModeloCarro.

Uso
Para usar este projeto, basta clonar o repositório e compilar os arquivos Java. Abaixo está um exemplo de uso:

java
Copiar código
import Models.ModeloCarro;

public class Test {
    public static void main(String[] args) {
        ModeloCarro carro = new ModeloCarro("Civic", 31200d, 51000.40d, 42000d, 2020, "Hatch");
        System.out.println(carro.precoMedio());
        System.out.println(carro.verificaMaiorPreco());
        System.out.println(carro.verificaMenorPreco());
    }
}
Este código cria uma instância de ModeloCarro e imprime o preço médio, o maior preço e o menor preço.

Contribuição
Sinta-se à vontade para contribuir com este projeto enviando pull requests. Para problemas ou sugestões, abra uma issue.
