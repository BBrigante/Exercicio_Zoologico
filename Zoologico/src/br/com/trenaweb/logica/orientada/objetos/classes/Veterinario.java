package br.com.trenaweb.logica.orientada.objetos.classes;

import java.util.ArrayList;
import java.util.List;

public class Veterinario {

	private String nome;
	private List<Animal> animais;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Veterinario() {
		animais = new ArrayList<Animal>();
	}
	public void antenderAnimal (Animal animalASerAtendido) {
		animais.add(animalASerAtendido);
	}
	public void deixarDeAtenderAnimal(int indiceAnimal) {
		animais.remove(indiceAnimal);
	}
	public void listaDeAnimalASerAtendido () {
		System.out.println("-----------------------------------------------|");
		System.out.println("Animais atendidos: ");
		for(int i = 0; i < animais.size(); i++) {
			System.out.println("			Nome: " + animais.get(i).getNome());
			System.out.println("			Idade:  " +  animais.get(i).getIdade() + " ano(s)");
			System.out.println("			Especie:  " +  animais.get(i).getEspecie());
			System.out.println("-----------------------------------------------|");
		}
	}
}
