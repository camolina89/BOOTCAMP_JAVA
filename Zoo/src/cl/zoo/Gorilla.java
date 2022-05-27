package cl.zoo;

public class Gorilla extends Mammal {
	
	
	
	public Gorilla() {
		super();
		
	}

	public void throwSomething() {
		System.out.println("El Gorilla a lanzado un objeto");
		this.setEnergyLevel(this.getEnergyLevel() - 5);
	}
	
	public void eatBananas() {
		System.out.println("ñam ñam oh! <exclamo! el Gorilla> Que rica banana");
		this.setEnergyLevel(this.getEnergyLevel() + 10);
	}
	
	public void climb() {
		System.out.println("El Gorilla ha trepado a la cima del árbol!");
		this.setEnergyLevel(this.getEnergyLevel() - 10);
		
	}
}
