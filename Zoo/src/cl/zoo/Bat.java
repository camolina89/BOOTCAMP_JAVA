package cl.zoo;

public class Bat extends Mammal {

	public Bat() {
		super();
	}
	
	
	// metodo de volar
	public void fly() {
		System.out.println("fuu, fuu, fuu, fuu, fuuu <emprendio el vuelo>");
		setEnergyLevel(getEnergyLevel()-50); //resta 50 al nivel de energia
	}
	
	public void eatHumans() {
		System.out.println("bueno, no importa");
		setEnergyLevel(getEnergyLevel() + 25); //suma 25 al nivel de energia
	}
	
	public void attackTown() {
		System.out.println("wwwoowww crashh boomm! wwwwwuuuuushshs frfrufuurfuruu");
		setEnergyLevel(getEnergyLevel() -100 );//resta 100 al nivel de energia
	}
	
}
