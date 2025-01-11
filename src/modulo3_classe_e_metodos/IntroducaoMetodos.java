package modulo3_classe_e_metodos;

public class IntroducaoMetodos {
	// INTRODUÇÃO À MÉTODOS
	
	/* Um método é uma função definida dentro de uma classe que pode ser executada para 
	 * realizar uma tarefa específica. Ele encapsula um conjunto de instruções, permitindo 
	 * modularização e reutilização de código. */
	
	// ESTRUTURA DE UM MÉTODO
	/* 
	 	[modificador de acesso] [modificador opcional] tipoRetorno nomeDoMetodo(parâmetros) {
    		Corpo do método
		}
	*/
	// Partes de um Método:
	// - Modificador de Acesso: Define a visibilidade (public, private, protected, ou padrão).
	// - Modificador Opcional: Como static, que define métodos estáticos.
	// - Tipo de Retorno: Tipo do valor que o método devolve (int, String, void, etc.).
	// - Nome do Método: Nome que representa a ação realizada.
	// - Parâmetros (Opcional): Valores de entrada para o método.
	// - Corpo do Método: Código que será executado.
	
	// Exemplo:
	public void exibirMensagem() {
        System.out.println("Olá, mundo!");
    }
	
	
	// ----------------------------------------------------------------------------------
		
	
	// TIPOS DE MÉTODOS:
	
	// Métodos Sem Retorno (void): Não retorna nenhum valor
	// Exemplo:
	void exibirMensagem(String mensagem) {
		System.out.println(mensagem);
	}	

	
	// Métodos Com Retorno: Esses métodos devolvem um valor para quem os chamou.
	// Exemplo:
	int somar(int a, int b) {
		return a + b;
	}
	
	
	// Métodos Com Parâmetros: Parâmetros são usados para passar informações para o método.
	// Exemplo:
	void exibirSaudacao(String nome) {
		System.out.println("Olá, " + nome + "!");
	}
	
	
	// Métodos Estáticos: pertencem à classe e não a um objeto. Eles podem ser chamados sem criar uma instância da classe.
	// Exemplo: 
	public static void exibirChamada() {
		System.out.println("Método estático chamado!");
	}
}