package br.com.trenaweb.logica.orientada.objetos.classes;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {

	private String nome;
	private List<Animal> animais;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public Zoologico () {
		animais = new ArrayList<Animal>();
	}
	
	public void adicionarAnimal(Animal animalASerAdicionado) {
		animais.add(animalASerAdicionado);
	}
	public void removerAnimal(int indiceDoAnimal) {
		animais.remove(indiceDoAnimal);
	}
	
	public void listarAnimais () {
		System.out.println("-----------------------------------------------|");
		System.out.println("Animais do zoologico: ");
		for(int i = 0; i < animais.size(); i++) {
			System.out.println("			Nome: " + animais.get(i).getNome());
			System.out.println("			Idade:  " +  animais.get(i).getIdade() + " ano(s)");
			System.out.println("			Especie:  " +  animais.get(i).getEspecie());
			System.out.println("-----------------------------------------------|");
		}
	}
}
