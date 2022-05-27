package cl.zoo;

public class GorillaTest {

	public static void main(String[] args) {
		
		Gorilla jaimico = new Gorilla();
		jaimico.setEnergyLevel(100);
		
		
		//gorilla lanza un objeto 3 veces
		jaimico.throwSomething();
		jaimico.throwSomething();
		jaimico.throwSomething();
		
		// gorilla come 2 bananas
		jaimico.eatBananas();
		jaimico.eatBananas();
		
		//gorilla trepa el árbol una vez
		jaimico.climb();
		
		jaimico.displayEnergy();
		
		
		

	}

}
