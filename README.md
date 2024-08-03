# Projeto de Modelos de Carros

Este projeto demonstra um sistema de gerenciamento de modelos de carros em Java. Inclui classes para representar um carro com preços variados e um modelo de carro específico com ano e tipo. Também contém métodos para calcular o preço médio e verificar os maiores e menores preços.

## Índice

- [Instalação](#instalação)
- [Uso](#uso)
- [Contribuindo](#contribuindo)
- [Licença](#licença)
- [Contato](#contato)

## Instalação

1. Clone o repositório:
    ```bash
    git clone https://github.com/usuario/nome-do-projeto.git
    ```
2. Navegue até o diretório do projeto:
    ```bash
    cd nome-do-projeto
    ```
3. Compile o projeto:
    ```bash
    javac -d bin src/Models/Carro.java src/Models/ModeloCarro.java src/Test.java
    ```
4. Execute o projeto:
    ```bash
    java -cp bin Test
    ```

## Uso

O projeto inclui as seguintes classes e métodos:

### Classes

- **Carro**: Representa um carro com múltiplos preços.
  - Atributos: `modelo`, `preco1`, `preco2`, `preco3`
  - Métodos: `getPreco1`, `setPreco1`, `getModelo`, `setModelo`, `getPreco3`, `setPreco3`, `getPreco2`, `setPreco2`, `definirModelo`, `precoMedio`, `verificaMaiorPreco`, `verificaMenorPreco`

- **ModeloCarro**: Extende a classe Carro e adiciona atributos específicos do modelo.
  - Atributos: `anoModelo`, `tipoModelo`
  - Métodos: `getAnoModelo`, `setAnoModelo`, `getTipoModelo`, `setTipoModelo`

### Exemplos

No arquivo `Test.java`, é criada uma instância de `ModeloCarro` e são chamados métodos para calcular o preço médio, verificar o maior preço e o menor preço.

```java
import Models.ModeloCarro;

public class Test {
    public static void main(String[] args) {
        ModeloCarro carro = new ModeloCarro("Civic", 31200d, 51000.40d, 42000d, 2020, "Hatch");
        System.out.println(carro.precoMedio());
        System.out.println(carro.verificaMaiorPreco());
        System.out.println(carro.verificaMenorPreco());
    }
}
