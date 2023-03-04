package br.com.trenaweb.logica.orientada.objetos.classes;


//Fzemos a extenção da classe filha (Cachorro) para a classe mãe (Animal)
public class Cachorro extends Animal {

	public Cachorro(String nome) { 
		super(nome); /* buscamos os parametros get e set da classe mãe pela classe filha atraves do 
								(super) + o atributo preescrito pela classe mãe*/ 
	}
	
	public Cachorro(String nome, int idade, String especie) {
		super(nome, idade, especie); 
	}
	
	public Cachorro(String nome, int idade) {
		super (nome, idade, "Cachorro");
	}
	
	@Override // Reescrevendo o metodo da classe mãe
	public void barulhoAnimal (){
		if (estaVivo) {
		System.out.println("Som emitido: Latido");
		} else {
			System.out.println("O Cachorro Faleceu.");
		}
	}	
	
	
	@Override
	
	public Boolean ehAdulto () { // Reescrevendo o metodo da classe mãe
		if (estaVivo) {
			return idade >= 2;
		} else {
			return false;
		}
	}
}
