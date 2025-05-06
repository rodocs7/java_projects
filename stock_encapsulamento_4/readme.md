# 🛡️ Estudo sobre Encapsulamento em Java

Este repositório contém um estudo prático sobre **encapsulamento**, um dos pilares da programação orientada a objetos em Java.

## 📘 O que é Encapsulamento?

Encapsulamento é o princípio de **ocultar os dados internos de uma classe** e permitir o acesso a eles somente por meio de **métodos controlados** (getters e setters). Isso evita alterações diretas nos atributos e protege a integridade do objeto.

> Exemplo incorreto (sem encapsulamento):
```java
public class Produto {
    public String nome;
    public double preco;
}
Exemplo correto (com encapsulamento):

java
Copiar
Editar
public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }
}
🎯 Benefícios do Encapsulamento
Protege o estado interno do objeto.

Permite validações antes de alterar valores.

Evita uso incorreto de atributos.

Torna o código mais modular e fácil de manter.

📂 Estrutura do Projeto
bash
Copiar
Editar
/src
 ├── application
 │    └── Main.java        # Classe principal com teste de objetos
 └── entities
      └── Produto.java     # Classe com encapsulamento aplicado
🧪 Exemplo de Uso
java
Copiar
Editar
Produto p = new Produto();
p.setNome("Notebook");
p.setPreco(3500.00);

System.out.println("Produto: " + p.getNome());
System.out.println("Preço: R$" + p.getPreco());
🧠 Conclusão
Encapsulamento é uma prática essencial para o desenvolvimento de aplicações seguras e robustas. Ele separa os detalhes internos da implementação e fornece uma interface clara de uso para outros objetos.

