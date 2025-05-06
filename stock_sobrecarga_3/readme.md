Sobrecarga em Java

Em Java, sobrecarga (em inglês, overloading) é o conceito de definir mais de um método com o mesmo nome dentro da mesma classe, mas com parâmetros diferentes.

✅ O que é sobrecarga de métodos?

Você cria uma sobrecarga de método quando:

Usa o mesmo nome, mas

Muda o tipo, a quantidade ou a ordem dos parâmetros.

🧠 Por que usar sobrecarga?

Para deixar seu código mais organizado e flexível, criando variações de um mesmo comportamento.

📌 Exemplo simples:

public class Calculadora {

    public int soma(int a, int b) {
        return a + b;
    }

    public double soma(double a, double b) {
        return a + b;
    }

    public int soma(int a, int b, int c) {
        return a + b + c;
    }
}

🧪 Uso no main:

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.soma(2, 3));         // chama soma(int, int)
        System.out.println(calc.soma(2.5, 3.2));     // chama soma(double, double)
        System.out.println(calc.soma(1, 2, 3));      // chama soma(int, int, int)
    }
}

🛍️ Regras da sobrecarga:

Os nomes dos métodos devem ser iguais.

Os parâmetros devem ser diferentes em tipo, número ou ordem.

O tipo de retorno não conta sozinho para diferenciar métodos!

// Isso NÃO compila:
int soma(int a, int b)
double soma(int a, int b) // ❌ Mesmo nome e mesmos parâmetros — conflito

📘 Curiosidade:

A sobrecarga é comum também em construtores, para permitir criar objetos de formas diferentes:

public class Produto {
    String nome;
    double preco;

    public Produto() {
    }

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}

Sobrecarga é uma ferramenta poderosa que ajuda a tornar seu código mais reutilizável e legível quando usada com responsabilidade.