Aqui aprendi a usar o Util.

Segue diferença:

📦 entities (ou model)
Representa objetos reais do seu sistema — as "coisas" com as quais o programa trabalha.

✅ Características:
Classes com atributos e comportamentos.

Representam dados como: Pessoa, Produto, Cliente, Pedido, etc.

Costumam ter getters, setters, construtores, toString, etc.

🧩 Exemplo:
java
Copiar
Editar
public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
🧰 util (de “utilities”)
Contém classes auxiliares com métodos úteis ou genéricos, que ajudam em operações matemáticas, conversões, manipulações de texto, datas, etc.

✅ Características:
Geralmente contém métodos estáticos.

Não representa um “objeto do mundo real”.

Reutilizável em qualquer parte do sistema.

🧩 Exemplo:
java
Copiar
Editar
public class StringUtil {
    public static String capitalize(String texto) {
        if (texto == null || texto.isEmpty()) return texto;
        return texto.substring(0, 1).toUpperCase() + texto.substring(1);
    }
}
🔍 Comparando:

Aspecto	entities	util
Representa o quê?	Dados do sistema (ex: Cliente)	Funções auxiliares (ex: calcular)
Tem atributos?	Sim	Normalmente não
Usa static?	Raramente	Frequentemente
Exemplo	Produto, Aluno, Pedido	MathUtils, DateUtil
