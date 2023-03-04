package br.com.trenaweb.logica.orientada.objetos.classes;


/* Transformando a classe (Animal) em abstrato tornando assim uma classe "Mãe" para as classes
 "Filhas", (Cachorro e Gato ou outras seguindo a herança). */

public abstract class Animal implements Animavel  {	// Declaramos a assinatura ou implementação da interface (Animavel), passando assim os metodos  que deverão ser executados.
	
	
	private String nome;
	private String especie;
	protected int idade;  // transformando em protected pois precisamos de um meio termo entre private e public.
	protected Boolean estaVivo;
	
	
	// Usamos get e set para cosulta e entrada de dados nos atributos.
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}	
	
	// Declaramos o metodo publico para a classes filhas herdarem 
	// Fizemos uma validação do metodo (estaVivo) para os metedos das classes filhas herdarem de sua maneira em override.  
	public  Animal(String nome, int idade, String especie) {
		this.nome = nome;
		this.idade = idade;
		this.especie = especie;
		this.estaVivo = true;
	}
	public Animal (String nome) {
		this.nome = nome;
		this.estaVivo = true;	
	}
	
	@Override  // : Para declarar a implementação da interface "Animavel".
	
	public Boolean estaVivo() {
		return estaVivo;
	}	
	@Override
	public abstract void barulhoAnimal ();	
	
	@Override
	public Boolean ehAdulto () {
		if (estaVivo) {
			return idade >= 1;
		} else {
			return false;
		}		
	}	
	@Override
	public final void animalMorreu () {
		this.estaVivo = false;
	}
}