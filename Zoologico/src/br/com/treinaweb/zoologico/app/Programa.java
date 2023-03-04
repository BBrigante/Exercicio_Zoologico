package br.com.treinaweb.zoologico.app;

import br.com.trenaweb.logica.orientada.objetos.classes.Animal;
import br.com.trenaweb.logica.orientada.objetos.classes.Animavel;
import br.com.trenaweb.logica.orientada.objetos.classes.Cachorro;
import br.com.trenaweb.logica.orientada.objetos.classes.Gato;
import br.com.trenaweb.logica.orientada.objetos.classes.Veterinario;
import br.com.trenaweb.logica.orientada.objetos.classes.Zoologico;


public class Programa {

	public static void main(String[] args) {
		Animal animal = new Cachorro ("Totó", 2);

		
		
		System.out.println("Nome do animal: " + animal.getNome() + 
				"\nEspecie: " + animal.getEspecie() + 
				 "\nIdade: " + animal.getIdade()  + " anos.\n" ); 
		System.out.println("=== Barulho do animal ====\n");
		animal.barulhoAnimal();
		
		if (animal.ehAdulto()) {
			System.out.println("Cachorro adulto.");
			
		} else {
			System.out.println("Cachorro não é adulto.");
		}
		
		
		System.out.println("\n");		
		System.out.println("===============================================");
		System.out.println("\n");
		
		Zoologico zoo = new Zoologico();
		zoo.setNome("Zoo Brigante");
		zoo.adicionarAnimal(animal);
		Animal animal2 = new Gato("Zé", 1);
		zoo.adicionarAnimal(animal2);
		System.out.println("Animais do zoologico - " + zoo.getNome());
		zoo.listarAnimais();
		zoo.removerAnimal(0);
		System.out.println("\n\n-> DEPOIS DA REMOÇÃO <-\n\n");
		zoo.listarAnimais();
		
		
		Veterinario vet = new Veterinario ();
		vet.setNome("Veterinario Zoo");
		vet.antenderAnimal(animal2);
		vet.listaDeAnimalASerAtendido();
	}
}
