TERCEIRA VERSÃO DE TREINO
Esta versão foi feita com base na explicação de que PI, circumference e volume são valores que não dependem de objetos individuais, ou seja, são os mesmos para todos.

Por isso, esses elementos são declarados como static: eles pertencem à classe, e não a instâncias específicas (objetos).

Além disso, como esses valores não devem mudar, PI também é declarado como uma constante (final).

Dessa forma:

circumference e volume são métodos estáticos.

PI é uma constante estática (public static final double PI = 3.14).

Como são estáticos, não é necessário criar um objeto para usá-los — basta chamar diretamente pela classe.