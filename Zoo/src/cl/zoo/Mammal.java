package cl.zoo;

public class Mammal {
	
	private int energyLevel;
	
	public void displayEnergy() {
		
		System.out.println("El nivel de energia es: "+ this.energyLevel);
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	
	
	
	
}
