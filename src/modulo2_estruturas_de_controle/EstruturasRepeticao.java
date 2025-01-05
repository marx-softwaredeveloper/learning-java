package modulo2_estruturas_de_controle;

public class EstruturasRepeticao {

	public static void main(String[] args) {
		// ESTRUTURAS DE REPETIÇÃO
		
		// ESTRUTURA FOR
		// O for é ideal quando sabemos o número de iterações que precisamos executar.
		
		// SINTAXE: 
		/* 
			for (inicialização; condição; atualização) {
    			Bloco de código a ser repetido
			} 
		*/ 
		// Inicialização: Executada uma vez antes do início do laço.
		// Condição: Avaliada antes de cada iteração. Se for false, o laço é encerrado.
		// Atualização: Executada após cada iteração.
		
		// EXEMPLO:
		for (int i = 1; i <= 5; i++) {
			System.out.println("Iteração: " + i);
		}
		System.out.println();
		
		
		
		// ESTRUTURA WHILE
		/* O while é usado quando não sabemos exatamente quantas iterações serão necessárias, 
		 * mas sabemos a condição que precisa ser atendida. */
		
		// SINTAXE:
		/* 
			while (condição) {
   				Bloco de código a ser repetido
			}
		 */
		// O bloco será executado enquanto a condição for verdadeira.
		// Se a condição for false na primeira avaliação, o laço não será executado.
		
		// EXEMPLO: 
		int contador = 1;
		while (contador <= 5) {
			System.out.println("Contador: " + contador);
			contador++;
		}
		System.out.println();
		
		
		
		// ESTRUTURA DO...WHILE
		/* O do-while é semelhante ao while, mas garante que o bloco de código será executado pelo 
		 * menos uma vez, já que a condição é avaliada somente após a primeira execução. */
		
		// SINTAXE:
		/*
			do {
    			Bloco de código a ser repetido
			} while (condição); 
		*/
		
		// EXEMPLO: 
		int contador2 = 1;
		do {
			System.out.println("Contador: " + contador2);
			contador2++;
		} while (contador2 <= 5);
		System.out.println();
		
		
		
		// CONTROLE DO FLUXO DE LAÇOS
		// break: O comando break é usado para encerrar o laço imediatamente, independentemente da condição.
		// continue: O comando continue pula a execução do restante do bloco de código na iteração atual e vai direto para a próxima iteração.
		
		// EXEMPLO BREAK: 
		for (int i = 1; i <= 10; i++) {
			if (i == 8) {
				break; // Sai do laça quando i == 5
			}
			System.out.println("Valor de i: " + i);
		}
		System.out.println();
		
		// EXEMPLO CONTINUE:
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				continue; // Pula a iteração quando i == 3
			}
			System.out.println("Valor de i: " + i);
		}
		
		
		
		// LAÇOS ANINHADOS
		// Podemos aninhar laços para trabalhar com estruturas bidimensionais ou multidimensionais.
		
		// EXEMPLO: Tabela de Multiplicação
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}

	}

}
