package modulo3_classe_e_metodos;

//INTRODUÇÃO A CLASSE
	/* Uma classe é uma estrutura que encapsula atributos (dados) e 
	* métodos (funções/comportamentos). Ela define um molde para 
	* criar objetos, que são instâncias dessa classe. */
			
	// Componentes principais de uma classe:
	// - Modificador de acesso: Define quem pode acessar a classe (public, default).
	// - Nome da classe: Deve começar com letra maiúscula e seguir o padrão PascalCase.
	// - Atributos: Variáveis que representam as características da classe.
	// - Métodos: Funções que definem os comportamentos da classe.

	//EXEMPLO DE CLASSE:

// Essa classe se chama "IntroducaoClasse" e o modificador de acesso é "public".
public class IntroducaoClasse {
	// Atributos da Classe.
	String nome;
	int idade;
	
	// Métodos da Classe.	
	void apresentar() {
		System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos.");
	}
	
	
	// UTILIZANDO A CLASSE
	public class Principal {
		public static void main(String[] args) {
			// Criando um objeto.
			IntroducaoClasse pessoa = new IntroducaoClasse(); 
			
			// Atribuindo valores aos atributos.
			pessoa.nome = "Marx";
			pessoa.idade = 29;
			
			// Chamando o método.
			pessoa.apresentar(); 
		}
	}
}