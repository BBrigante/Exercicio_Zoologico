package br.com.trenaweb.logica.orientada.objetos.classes;


//Fzemos a extenção da classe filha (Gato) para a classe mãe (Animal)
public class Gato extends Animal{

	public Gato(String nome) {
		super(nome);	/* buscamos os parametros get e set da classe mãe pela classe filha atraves do 
							(super) + o atributo preescrito pela classe mãe*/
	}
	public Gato(String nome, int idade) {
		super(nome, idade, "Gato");
	}
	public Gato(String nome, int idade, String especie) {
		super(nome, idade, especie);
	}
	
	
	@Override		// Reescrevendo o metodo da classe mãe
	
	public void barulhoAnimal (){
		if (estaVivo) {
		System.out.println("Som Emitido: Miado"); 
		} else {
			System.out.println("O gato faleceu!");
		}
	}
}
