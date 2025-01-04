package modulo1_fundamentos;

public class DataTypeString {

	public static void main(String[] args) {
		System.out.println("=== DATA TYPE: STRING ===");
		System.out.println();
		
		// Criando uma String
		
		// Usando Literais:
		String saudacao = "Olá, Mundo!";
		System.out.println(saudacao);
		
		// Usando o Construtor:
		String nome = new String(" Marx ");
		System.out.println("Meu nome é " + nome);
		System.out.println("");
		
		
		// PRINCIPAIS MÉTODOS DA CLASSE STRING
		// Verificando o comprimento da String
		System.out.println("Comprimento: " + nome.length());
		System.out.println("");
		
		// Fazendo comparação com o valor da string
		String str1 = "Java";
		String str2 = "Java";
		String str3 = "java";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println("");
		
		//Comparando os valores e ignorano maiúsculas e minusculas
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println("");
		
		
		// EXTRAINDO PARTES DE UMA STRING
		String texto = "Aprendendo Java";
		String parteTexto = texto.substring(11);
		System.out.println(parteTexto);
		System.out.println("");
		
		
		// FAZENDO CONVERSÃO DE MAIÚSCULAS E MINUSCULAS
		System.out.println(nome.toLowerCase());
		System.out.println(nome.toUpperCase());
		System.out.println("");
		
		
		// VERIFICANDO SE SEQUENCIA DE CARACTERES ESTÁ PRESENTE EM UMA STRING
		System.out.println(texto.contains("Java"));
		System.out.println(texto.contains("JAVA"));
		System.out.println("");
		
		
		// VERIFICANDO SE A STRING COMEÇA OU TERMINA COM UM SEQUENCIA ESPECIFICA
		System.out.println(texto.startsWith("Aprend"));
		System.out.println(texto.startsWith("Vamos"));
		System.out.println(texto.endsWith("Java"));
		System.out.println(texto.endsWith("C++"));
		System.out.println("");
		
		
		// FAZENDO UMA SUBSTITUIÇÃO DE TEXTO
		String novoTexto = saudacao.replace("Mundo", "Java");
		System.out.println(novoTexto);
		System.out.println("");
		
		
		// FAZENDO DIVISÃO DE UMA STRING
		String frutas = "Banana,Maça,Melancia";
		String[] listaFrutas = frutas.split(",");
		
		for (String fruta : listaFrutas) {
			System.out.println(fruta);
		}
		System.out.println("");
		
		
		// FAZENDO REMOÇÃO DE ESPAÇOS
		System.out.println(nome);
		System.out.println(nome.trim());
		System.out.println("");		
		
		
		/* STRINGS SÃO IMULTÁVEIS, OU SEJA, NÃO PODEMOS MODIFICAR 
		 * UMA STRING APÓS ELA SER DECLARADA.
		 * 
		 * Se tentarmos modificar uma string, ela irá criar um novo objeto.
		 */
		//EXEMPLO:
		String original = "Java";
		String alterada = original.concat(" é incrível!");
		System.out.println(original);
		System.out.println(alterada);
		System.out.println("");	
		
		
		//MANIPULANDO STRING SEM CRIAR UM NÓVO OBJETO
		StringBuilder sb = new StringBuilder("Java");
		sb.append(" é incrivel!");
		System.out.println(sb.toString());
		

	}

}
