package entities;  // o triangulo é uma entidade do nosso negócio que mexe com áreas de triangulos

public class Triangle {

	public double a;
	public double b;
	public double c;
	
	
	/* aqui abaixo em () ele nao  precisa preencher a lista de parametros do metodo,
	 porque na classe ja tem tudo o que ele precisa, que é o A, B e C */
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
 
}

