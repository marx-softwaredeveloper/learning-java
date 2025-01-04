package modulo1_fundamentos;

public class DataTypes {

	public static void main(String[] args) {
		System.out.println("=== TIPOS DE DADOS PRIMITIVOS ===");
		System.out.println();
		
		//BYTE
		System.out.println("byte");
		byte idade = 25; // Armazena valores entre -128 e 127
		System.out.println("Idade: " + idade);
		System.out.println("");
		
		//SHORT
		System.out.println("short");
		short populacao = 32000; // Armazena valores entre -32.768 e 32.767
		System.out.println("População: " + populacao);
		System.out.println("");

		//INT
		System.out.println("int");
		int salario = 50000; // Tipo padrão para números inteiros
		System.out.println("Salário: " + salario);
		System.out.println("");
		
		//LONG
		System.out.println("long");
		long distancia = 123456789L; // Use 'L' no final para especificar um long
		System.out.println("Distância: " + distancia);
		System.out.println("");
		
		//FLOAT
		System.out.println("float");
		float preco = 19.99f; // Use 'f' no final para especificar um float
		System.out.println("Preço: " + preco);
		System.out.println("");
		
		//DOUBLE
		System.out.println("double");
		double pi = 3.14159; // Tipo padrão para números decimais
		System.out.println("Valor de PI: " + pi);
		System.out.println("");
		
		//CHAR
		System.out.println("char");
		char inicial = 'M'; // Use aspas simples para caracteres
		System.out.println("Inicial do nome: " + inicial);
		System.out.println("");
		
		//BOOLEAN
		System.out.println("boolean");
		boolean ativo = true;
		System.out.println("Usuário ativo? " + ativo);
		System.out.println("");
		
		System.out.println("=== TIPOS DE DADOS NÃO PRIMITIVOS (REFERÊNCIA) ===");
		System.out.println("");
		
		
		System.out.println("Array");
		System.out.println();
		
		// DECLARANDO E INICIALIZANDO UM ARRAY
		int[] numeros = {1, 2, 3, 4, 5}; // Array de inteiros
		String[] nomes = {"Marx", "Beatriz", "Léo"}; // Array de Strings
				
		// DECLARANDO UM ARRAY COM TAMANHO ESPECÍFICO:
		String[] frutas = new String[5]; // Cria um array de strings com 5 posições
		// Preenchendo o valores do array acima definido:
		frutas[0] = "Maça";
		frutas[1] = "Banana";
		frutas[2] = "Morango";
		frutas[3] = "Melancia";
		frutas[4] = "Uva";
				
		// DECLARANDO E INICIALIZANDO EM ETAPAS SEPARADAS
		int[] valores; // Declaração
		valores = new int[]{1, 2, 3, 4, 5}; // Inicialização
				
		// ACESSANDO ELEMENTOS DE UM ARRAY
		System.out.println("Primeira fruta: " + frutas[0]);
		System.out.println("Segunda fruta: " + frutas[1]);
		System.out.println("Terceira fruta: " + frutas[2]);
		System.out.println("Quarta fruta: " + frutas[3]);
		System.out.println("Quinta fruta: " + frutas[4]);
				
		System.out.println(nomes[0]);
		System.out.println(nomes[1]);
		System.out.println(nomes[2]);
				
		System.out.println(numeros[3]);
				
		System.out.println(valores[0]);
	}

}
