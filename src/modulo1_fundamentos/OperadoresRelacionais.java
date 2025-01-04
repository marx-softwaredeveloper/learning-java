package modulo1_fundamentos;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		// OPERADORES RELACIONAIS
		/* Os operadores relacionais em Java são usados para comparar valores. 
		 * O resultado de uma comparação é sempre um valor booleano: true (verdadeiro) ou 
		 * false (falso). Eles são amplamente utilizados em estruturas condicionais como if, 
		 * while e for. */
		
		// LISTA DE OPERADORES RELACIONAIS
		int a = 6, b = 5;
		
		// == (igual a): Verifica se dois valores são iguais.
		boolean igualA = a == b;
		System.out.printf("%d é igual a %d: %b%n", a, b, igualA);
				
		// != (diferente de): Verifica se dois valores são diferentes.
		boolean diferenteDe = a != b;
		System.out.printf("%d é diferente de %d: %b%n", a, b, diferenteDe);
		
		// > (maior que): Verifica se o valor à esquerda é maior que o valor à direita.
		boolean maiorQue = a > b;
		System.out.printf("%d é maior que %d: %b%n", a, b, maiorQue);
		
		// < (menor que): Verifica se o valor à esquerda é menor que o valor à direita.
		boolean menorQue = a < b;
		System.out.printf("%d é menor que %d: %b%n", a, b, menorQue);
		
		// >= (maior ou igual a): Verifica se o valor à esquerda é maior ou igual ao valor à direita.
		boolean maiorOuIgual = a >= b;
		System.out.printf("%d é maior ou igual a %d: %b%n", a, b, maiorOuIgual);
		
		// <= (menor ou igual a): Verifica se o valor à esquerda é menor ou igual ao valor à direita.
		boolean menorOuIgual = a <= b;
		System.out.printf("%d é menor ou igual a %d: %b%n", a, b, menorOuIgual);
	}
}