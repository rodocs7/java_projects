Nesse treino implementeo this.


Palavra this

- É uma referência para o próprio objeto

-Uso comuns:
	-Diferenciar atributos de variáveis locais (caso tenham o mesmo nome, se nao tiverem, não precisa do this).
	-Passar o próprio objeto como argumento na chamada de um método ou construtor.
	
	
Ex:



public class Produto {
    private String nome;
    private double preco;

    // O parâmetro chama-se 'valor' e não 'preco'
    public Produto(String nome, double valor) {
        this.nome = nome; // Aqui ainda usamos 'this' porque o nome é igual
        preco = valor;    // Aqui NÃO precisa de 'this' porque 'preco' ≠ 'valor'
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}




public class Main {
    public static void main(String[] args) {
        Produto p = new Produto("Caneta", 2.50);
        System.out.println("Nome: " + p.getNome());
        System.out.println("Preço: R$ " + p.getPreco());
    }
}
